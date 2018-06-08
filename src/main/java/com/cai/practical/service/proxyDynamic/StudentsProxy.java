package com.cai.practical.service.proxyDynamic;

/**
 * 学生代理类，实现了person接口，保持一个学生实体，这样可以代理学生产生行为
 * Created by Administrator on 2018/6/8.
 */
public class StudentsProxy implements Person {
    /**
     * 代理对象
     */
    Student stu;

    public StudentsProxy(Person stu) {
        if (stu.getClass() == Student.class) {
            this.stu = (Student) stu;
        }
    }

    //代理学生上交班费行为
    @Override
    public void giveMoney() {
        stu.giveMoney();
    }
}
