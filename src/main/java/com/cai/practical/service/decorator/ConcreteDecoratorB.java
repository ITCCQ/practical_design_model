package com.cai.practical.service.decorator;

/**
 * Created by Administrator on 2018/6/1.
 */
public class ConcreteDecoratorB extends Decorator {
    @Override
    public void operation() {
        super.operation();
        //调用行为
        addedBehavior();
        System.out.println("具体装饰对象B的操作");
    }

    public void addedBehavior() {
        System.out.println("B中的新增加行为");
    }
}
