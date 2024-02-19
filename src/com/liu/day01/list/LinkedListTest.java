package com.liu.day01.list;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        /*LinkedList是List的子类，LinkedList集合数据存储的结构是链表结构，方便元素添加和删除
        addFirst,addLast,getFirst,getLast,removeFirst,removeLast,pop从栈中弹出一个元素(栈中不再存在该元素)，push将元素推入栈，isEmpty
        */
        LinkedList<String> list = new LinkedList<>();
        list.add("张三");
        list.add("赵四");
        list.add("王五");
        list.addFirst("小二");
        list.addLast("刘六");
        System.out.println(list);
        System.out.println(list.getFirst());
        list.removeFirst();
        System.out.println(list.pop());
        System.out.println(list);
    }
}
