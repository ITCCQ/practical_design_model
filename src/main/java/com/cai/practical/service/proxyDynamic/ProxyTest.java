package com.cai.practical.service.proxyDynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2018/6/8.
 */
public class ProxyTest {
    public static void main(String[] args) {
        //创建一个实例退休，这个对象是被代理的对象
        Person zs = new Student("小菜");
        //创建一个与代理对象相关联的invocationHander
        InvocationHandler stuHandler = new StuInvocationHandle<Person>(zs);
        Person stuProxy = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class<?>[]{Person.class}, stuHandler);
        //代理执行上交班费的方法
        stuProxy.giveMoney();

    }
}
