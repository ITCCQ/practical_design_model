package com.cai.practical.service.simplefactorymodel;

/**
 *
 * 减法
 * Created by Administrator on 2018/5/31.
 */
public class OperationSub extends Operation {
    @Override
    public double result()

    {
        double result = 0;
        result = get_numberA() - get_numberB();
        return result;
    }
}
