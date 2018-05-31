package com.cai.practical.service.simplefactorymodel;

/**
 * 运行测试git
 * Created by Administrator on 2018/5/31.
 */
public class Calculator {
    public static void main(String[] args) {
        Operation operation;
        char operator;
        operator = '-';
        operation = OperationFactory.caretaOperate(operator);
        operation.set_numberA(1);
        operation.set_numberB(2);
        System.out.println(operation.result());


    }
}
