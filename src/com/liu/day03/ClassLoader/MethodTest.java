package com.liu.day03.ClassLoader;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//方法的调用
public class MethodTest {
    @Test
    //调用无参无返回值的方法
    public void test01() throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        //1.获取Class对象
        Class clz = Student.class;
        //2.调用Method时，要传递Student对象
        Constructor con = clz.getConstructor();
        Student student = (Student) con.newInstance();
        //3.获取public void study()方法的对象
        Method method = clz.getMethod("study");
        //4.使用Method对象，执行study（）方法
        method.invoke(student);
    }
    @Test
    //调用有参有返回值的方法
    public void test02() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1.获取Class对象
        Class clz = Student.class;
        //2.调用Method时，要传递Student对象
        Constructor con = clz.getConstructor();
        Student student = (Student) con.newInstance();
        //3.获取public String sayHello（String name）方法的Method对象
        Method method = clz.getMethod("sayHello", String.class);
        //4.调用Method方法
        System.out.println(method.invoke(student, "张三"));
    }
    @Test
    //调用私有方法
    public void test03() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1.获取Class对象
        Class clz = Student.class;
        //2.调用Method时，要传递Student对象
        Constructor con = clz.getConstructor();
        Student student = (Student) con.newInstance();
        //3.获取private void eat(String name)方法的Method对象
        Method method = clz.getDeclaredMethod("eat", String.class);
        //4.去除JVM对当前次权限的检查
        method.setAccessible(true);
        //5.执行method方法
        method.invoke(student,"张三");
    }
    @Test
    //调用静态方法
    public void test04() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //1.获取Class对象
        Class clz = Student.class;
        //静态方法的调用不需要对象
        //2.获取public static void drink（）方法的Method对象
        Method method = clz.getMethod("drink");
        //3.执行静态方法
        method.invoke(null);//不需要传递对象
    }
}
