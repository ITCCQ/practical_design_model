package com.cai.practical.service.simplefactorymodel;

/**
 * 工厂类
 * Created by Administrator on 2018/5/31.
 */
public class OperationFactory {

    public static Operation caretaOperate(char operate) {
        Operation oper = null;
        switch (operate) {
            case '+':
                oper = new OperationAdd();
                break;
            case '-':
                oper = new OperationSub();
                break;
            case '*':
                oper = new OperationMul();
                break;
            case '/':
                oper = new OperationDiv();
                break;
            default:
                throw new RuntimeException("unsupported operation/不存在运算符");
        }
        return oper;

    }


}
