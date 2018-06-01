package com.cai.practical.service.decorator;

/**
 * Created by Administrator on 2018/6/1.
 */
public class ConcreteDecoratorA extends Decorator {
    private String addedState;

    @Override
    public void operation() {
        //首先运行原Component的 operation(),再执行本类的功能，如addedState，
        // 相对于原Component进行了装饰
        super.operation();
        addedState = "A中的new state";
        System.out.println(addedState + "具体装饰对象A的操作");


    }
}
