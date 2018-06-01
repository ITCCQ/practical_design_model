package com.cai.practical.service.decorator;

/**
 * Created by Administrator on 2018/6/1.
 */
public class ConcreteDecoratorC extends Decorator {

    @Override
    public void operation() {
        super.operation();
        System.out.println("C没有特殊行为" + "具体装饰对象C的操作");
    }
}
