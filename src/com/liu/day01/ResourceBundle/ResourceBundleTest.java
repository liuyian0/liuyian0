package com.liu.day01.ResourceBundle;

import java.util.ResourceBundle;

public class ResourceBundleTest {
    public static void main(String[] args) throws Exception{
        //获取.properties对象
        ResourceBundle rb = ResourceBundle.getBundle("data");
        //根据键获取对应的值
        String value = rb.getString("username");
        System.out.println(value);
        System.out.println(rb.getString("name"));
    }
}
