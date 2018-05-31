package com.cai.practical.service.simplefactorymodel;

/**
 * 除法
 * Created by Administrator on 2018/5/31.
 */
public class OperationDiv extends Operation {
    @Override
    public double result() {
        double result = 0;
        if (get_numberB() == 0) {
            throw new RuntimeException("divided by 0");
        }
        result = get_numberA() / get_numberB();
        return result;

    }

}
