package com.cai.practical.service.proxyDynamic;

/**
 * 学生类
 * Created by Administrator on 2018/6/8.
 */
public class Student implements Person {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void giveMoney() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("具体方法");
    }
}
