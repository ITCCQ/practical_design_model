package com.cai.practical.service.proxyDynamic;

/**
 * Created by Administrator on 2018/6/8.
 */
public class StudentsProxyTest {

    public static void main(String[] args) {
        Person zs = new Student("小菜");
        Person monitor = new StudentsProxy(zs);
        monitor.giveMoney();
    }
}
