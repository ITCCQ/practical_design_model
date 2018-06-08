package com.cai.practical.service.proxyDynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2018/6/8.
 */
public class StuInvocationHandle<T> implements InvocationHandler {
    //invocationHandler持有的被代理对象
    T target;

    public StuInvocationHandle(T target) {
        this.target = target;
    }

    /**
     * proxy:代表动态代理对象
     * method：代表正在执行的方法
     * args：代表调用目标方法时传入的实参
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行代理" + method.getName() + "方法");
        //代理过程中插入检测方法计算方法耗时
        MonitorUtil.start();
        Object result = method.invoke(target, args);
        MonitorUtil.finish(method.getName());
        return result;
    }
}
