package com.liu.day01.duixiang;

public class StudentTest {
public static void main(String[] args) {
  Student s = new Student();
  s.study(); 
  s.name = "张三";
  s.setAge(18);
  System.out.println(s.name+s.getAge());
  /*匿名对象:创建对象时只有创建对象的语句，却没有把对象的地址赋值给某个变量
    如果对象需要多次操作成员，就不能使用匿名对象，否则会出错
  */
  new Student().name = "赵四";
  new Student().setAge(20);
}
}
