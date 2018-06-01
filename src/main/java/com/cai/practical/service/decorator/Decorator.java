package com.cai.practical.service.decorator;

/**
 * 装饰抽象类，继承了component ,从外类来扩展Component类的功能，
 * 但对于component来说 是无需知道Decorator的存在的
 * Created by Administrator on 2018/6/1.
 */
public class Decorator extends Component {
    protected Component component;

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if (component != null) {
            component.operation();
        }
    }
}
