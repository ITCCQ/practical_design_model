package com.cai.practical.service.proxy;

/**
 * 真实实体类
 * Created by Administrator on 2018/6/4.
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("真实对象的请求");
    }
}
