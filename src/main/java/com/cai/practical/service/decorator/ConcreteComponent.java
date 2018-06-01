package com.cai.practical.service.decorator;

/**
 * 定义一个具体的对象，也可以给这个对象添加一些职责
 * Created by Administrator on 2018/6/1.
 */
public class ConcreteComponent extends Component {

    @Override
    public void operation() {
        System.out.println("具体对象的操作");
    }
}
