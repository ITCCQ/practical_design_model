package com.cai.practical.service.proxyDynamic;



import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 使用Java中的动态代理
 */
public class DynamicProxy implements InvocationHandler {

    /**
     * 被代理的对象
     */
    private OrderApi order = null;
    /**
     * 获取绑定好代理和具体目标对象后的目标对象的接口
     * @param order 具体的订单对象，相当于具体目标对象
     * @return 绑定好代理和具体目标对象后的目标对象的接口
     */
    public OrderApi getProxyInterface(Order order){
          this.order=order;
        OrderApi orderApi = (OrderApi) Proxy.newProxyInstance(
                order.getClass().getClassLoader(),
                order.getClass().getInterfaces(),
                this);
        return orderApi;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
