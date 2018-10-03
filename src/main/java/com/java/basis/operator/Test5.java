package com.java.basis.operator;

/**
 * @Author: Lambert
 * @Date: 2018/10/2 下午4:27
 * @Description:
 * instanceof 运算符
 * 该运算符用于操作对象实例，检查该对象是否是一个特定类型（类类型或接口类型）。
 */

class Vehicle {}

public class Test5 extends Vehicle{
    public static void main(String[] args){
        Vehicle a = new Test5();
        boolean result =  a instanceof Test5;
        System.out.println( result);
    }
}
