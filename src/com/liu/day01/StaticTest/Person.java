package com.liu.day01.StaticTest;

public class Person {
    /*
    被static修饰的函数，不需要对象调用，可以直接类名.函数名方式直接调用。
    静态函数在类加载的时候，就在内存中加载完成，可以直接运行；
    非静态函数只有在类加载完成后，通过new关键字创建对象之后，通过对象才能调用
    */
    static String name;
    int age;
    //构造函数
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    //静态函数
    public static void sleep(){
        //System.out.println(this.name + "睡觉");   报错，静态函数中不能使用this关键字
        System.out.println(name + "睡觉");
        //speak();   报错，静态函数中无法调用非静态函数
    }
    //非静态函数
    void speak(){
        //非静态函数中可以调用静态函数
        sleep();
        System.out.println(this.name + this.age + "说话");
    }
}
    /*静态函数中不能调用非静态函数；
      非静态函数中可以调用静态函数
      静态函数中不能使用this关键字，this关键字表示的是当前调用的这个函数的那个对象，静态函数中没有对象
    */
