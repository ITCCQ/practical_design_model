package com.cai.practical.service.simplefactorymodel;

/**
 * 加法
 * Created by Administrator on 2018/5/31.
 */
public class OperationAdd extends Operation {

    @Override
    public double result() {
        double result = 0;
        result = get_numberA() + get_numberB();
        return result;
    }
}
