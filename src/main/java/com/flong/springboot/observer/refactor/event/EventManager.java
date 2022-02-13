package com.flong.springboot.observer.refactor.event;

import com.flong.springboot.observer.refactor.LotteryResult;
import com.flong.springboot.observer.refactor.event.listener.EmailEventListener;
import com.flong.springboot.observer.refactor.event.listener.EventListener;
import com.flong.springboot.observer.refactor.event.listener.LinkEventListener;
import com.flong.springboot.observer.refactor.event.listener.MQEventListener;
import com.flong.springboot.observer.refactor.event.listener.MessageEventListener;

import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author wangshuai
 * @version 1.0
 * @description 事件管理类
 * @date 2022/1/21 4:27 PM
 */
public class EventManager {

    Map<EventTypeEnum, List<EventListener>> listeners = new EnumMap<>(EventTypeEnum.class);

    public EventManager(EventTypeEnum... operations) {
        Set<Class> classSet = new HashSet<>();
        for (EventTypeEnum operation : operations) {
            Class aClass = operation.getaClass();
            classSet.add(aClass);
            EventListener eventListener = operation.getEventListener();
            this.listeners.put(operation, Collections.singletonList(eventListener));
        }
        if (classSet.size() > 1) {
            throw new RuntimeException("不能在一个通知内注入不同的class类类型:");
        }
    }

    public enum EventTypeEnum {
        //mq
        MQ(LotteryResult.class, new MQEventListener()),
        //message
        Message(LotteryResult.class, new MessageEventListener()),
        //email
        EMAIL(LotteryResult.class, new EmailEventListener()),

        Link(com.flong.springboot.link.domain.Link.class, new LinkEventListener());
        private final EventListener eventListener;

        private final Class aClass;

        EventTypeEnum(Class aClass, EventListener eventListener) {
            this.eventListener = eventListener;
            this.aClass = aClass;
        }

        public EventListener getEventListener() {
            return eventListener;
        }

        public Class getaClass() {
            return aClass;
        }
    }

    /**
     * 订阅
     *
     * @param eventType 事件类型
     */
    public void subscribe(EventTypeEnum eventType) {
        List<EventListener> eventListeners = this.listeners.get(eventType);
        eventListeners.add(eventType.getEventListener());
    }

    /**
     * 取消订阅
     *
     * @param eventType 事件类型
     * @param listener  监听
     */
    public void unsubscribe(Enum<EventTypeEnum> eventType, EventListener listener) {
        List<EventListener> eventListeners = listeners.get(eventType);
        eventListeners.remove(listener);
    }

    /**
     * 通知
     *
     * @param result 结果
     */
    public <T> void notify(T result) {
        for (Map.Entry<EventTypeEnum, List<EventListener>> map : listeners.entrySet()) {
            List<EventListener> value = map.getValue();
            for (EventListener eventListener : value) {
                eventListener.doEvent(result);
            }
        }
    }
}
