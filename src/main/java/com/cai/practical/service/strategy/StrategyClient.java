package com.cai.practical.service.strategy;

/**
 * 客户端使用策略
 * Created by Administrator on 2018/5/31.
 */
public class StrategyClient {
    public static void main(String[] args) {
        Context context;
        //使用策略a
        context = new Context(new ConcreteStrategyA());
        context.contextInterface();

        //使用策略b
        context = new Context(new ConcreteStrategyB());
        context.contextInterface();
        //使用策略
        context = new Context(new ConcreteStrategyC());
        context.contextInterface();

        //添加参数调用
        context = new Context("b");
        context.contextInterface();

    }
}
