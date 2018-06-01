package com.cai.practical.service.strategy;

/**
 * Created by Administrator on 2018/5/31.
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("策略a");
    }
}
