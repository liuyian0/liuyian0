package com.liu.day03.zhujie;

import com.liu.day03.ClassLoader.Student;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/*
业务对象的每个方法都要进行性能统计，存在大量重复代码
使用动态代理解决该问题
 */
public class UserServiceImplNew{
    public static void main(String[] args) {
        //1.调用getClassLoader()方法来获取类加载器
        ClassLoader classLoader = UserService.class.getClassLoader();
        //2.获取被代理类的所有接口信息，以便生成的代理类可以具有代理类接口中的所有方法
        Class[] interfaces = {UserService.class};
        //3.用于集中处理在动态代理类对象上的方法调用，通常在该方法中实现对委托方法的处理以及访问
        InvocationHandler ih = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                String name = method.getName();
                long start = System.currentTimeMillis();
                if ("login".equals(name)){
                    System.out.println("登录");
                    Thread.sleep(3000);
                }else if ("delete".equals(name)){
                    System.out.println("删除");
                    Thread.sleep(4000);
                }else if ("query".equals(name)){
                    System.out.println("查询");
                    Thread.sleep(1000);
                }
                long end = System.currentTimeMillis();
                System.out.println("耗时："+(end-start));
                return null;
            }
        };
        UserService proxyUserServiceImpl = (UserService) Proxy.newProxyInstance(classLoader,interfaces,ih);
        proxyUserServiceImpl.login();
        proxyUserServiceImpl.delete();
        proxyUserServiceImpl.query();
    }
}
