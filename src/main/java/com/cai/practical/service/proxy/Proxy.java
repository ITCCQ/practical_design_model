package com.cai.practical.service.proxy;

/**
 * 代理类
 * Created by Administrator on 2018/6/4.
 */
public class Proxy implements Subject {
    Subject subject;

    public Proxy() {
        subject = new RealSubject();
    }

    @Override
    public void request() {
        subject.request();
    }


}
