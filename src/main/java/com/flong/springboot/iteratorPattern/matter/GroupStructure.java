package com.flong.springboot.iteratorPattern.matter;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wangshuai
 * @version 1.0
 * @description
 * @date 2022/1/17 4:10 PM
 */
public class GroupStructure implements Collection<Employee, Link> {

    // 组织ID，也是一个组织链的头部ID
    private String groupId;
    // 组织名称
    private String groupName;
    // 雇员列表
    private Map<String, Employee> employeeMap = new ConcurrentHashMap<>();
    // 组织架构关系；id->list
    private Map<String, List<Link>> linkMap = new ConcurrentHashMap<>();
    // 反向关系链
    private Map<String, String> invertedMap = new ConcurrentHashMap<>();

    public GroupStructure(String groupId, String groupName) {
        this.groupId = groupId;
        this.groupName = groupName;
    }

    @Override
    public boolean add(Employee employee) {
        return employeeMap.put(employee.getUId(), employee) != null;
    }

    @Override
    public boolean remove(Employee employee) {
        return employeeMap.remove(employee.getUId()) != null;
    }

    @Override
    public boolean addLink(String key, Link link) {
        invertedMap.put(link.getToId(), link.getFromId());
        if (linkMap.containsKey(key)) {
            return linkMap.get(key).add(link);
        } else {
            List<Link> links = new LinkedList<>();
            links.add(link);
            linkMap.put(key, links);
            return true;
        }
    }

    @Override
    public boolean removeLink(String key) {
        return null != linkMap.remove(key);
    }

    @Override
    public Iterator<Employee> iterator() {
        return new Iterator<Employee>() {

            //记录当前层级遍历到了第几个
            final HashMap<String, Integer> keyMap = new HashMap<>();

            int totalIdx = 0;
            private String fromId = groupId;  // 雇员ID，From
            private String toId = groupId;   // 雇员ID，To

            @Override
            public boolean hasNext() {
                return totalIdx < employeeMap.size();
            }

            @Override
            public Employee next() {
                //判断有没有下一层
                List<Link> links = linkMap.get(toId);
                //获取下一层已经遍历到哪一个了
                int cursorIdx = getCursorIdx(toId);
                //如果该遍历对象已经没有下一层
                if (null == links) {
                    //判断from已经到达第几个
                    cursorIdx = getCursorIdx(fromId);
                    //获取toId层的links集合
                    links = linkMap.get(fromId); //获取formId层一共有几个
                }
                // 上级节点扫描 如果当前遍历已经到最后一个 当到底之后往上遍历
                while (cursorIdx > links.size() - 1) {
                    fromId = invertedMap.get(fromId); //如果已经该层遍历完 则往上拿到上一层对象作为formId
                    cursorIdx = getCursorIdx(fromId); //查询刚才拿到的上一层formId 已经遍历到了第几个 继续往上直到找到没有遍历完的那一层
                    links = linkMap.get(fromId); //拿到找到的那一层的那一个的links
                }
                // 获取节点
                Link link = links.get(cursorIdx);
                toId = link.getToId();  //往下继续遍历
                fromId = link.getFromId();
                totalIdx++;
                // 返回结果
                return employeeMap.get(link.getToId());
            }

            // 给每个层级定义宽度遍历进度
            public int getCursorIdx(String key) {
                int idx = 0;
                if (keyMap.containsKey(key)) {
                    keyMap.computeIfPresent(key, (k, v) -> ++v);
                } else {
                    keyMap.put(key, idx);
                }
                return idx;
            }
        };
    }
}
