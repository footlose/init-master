package com.flong.springboot.iteratorPattern.matter;

/**
 * @author wangshuai
 * @version 1.0
 * @description 定义了两个泛型<E, L>，因为数据结构一个是用于添加元素，另外一个是用于添加树节点的链路关系
 * @date 2022/1/17 4:08 PM
 */
public interface Collection<E, L> extends Iterable<E> {
    //添加元素
    boolean add(E e);

    //删除
    boolean remove(E e);

    //
    boolean addLink(String key, L l);

    //
    boolean removeLink(String key);

    //遍历
    @Override
    Iterator<E> iterator();

}
