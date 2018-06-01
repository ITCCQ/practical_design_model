package com.cai.practical.service.strategy;

/**
 * 上下文接口
 * Created by Administrator on 2018/5/31.
 */
public class Context {
    Strategy strategy;

    /**
     * 传入对象
     *
     * @param strategy
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;

    }

    /**
     * 传入参数
     *
     * @param type
     */
    public Context(String type) {

        switch (type) {
            case "a":
                ConcreteStrategyA csA = new ConcreteStrategyA();
                this.strategy = csA;
                break;
            case "b":
                ConcreteStrategyB csB = new ConcreteStrategyB();
                this.strategy = csB;
                break;
            case "c":
                ConcreteStrategyC csC = new ConcreteStrategyC();
                this.strategy = csC;
                break;
        }

    }

    /**
     * 上下文接口
     */
    public void contextInterface() {
        strategy.algorithmInterface();

    }

}
