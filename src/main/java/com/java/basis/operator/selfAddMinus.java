package com.java.basis.operator;

/**
 * @Author: Lambert
 * @Date: 2018/10/2 下午2:15
 * @Description:
 * 自增（++）自减（--）运算符是一种特殊的算术运算符，在算术运算符中需要两个操作数来进行运算，而自增自减运算符是一个操作数
 */
public class selfAddMinus {
    public static void main(String[] args) {
        //定义一个变量；
        int a=3;
        //自增运算
        int b = ++a;
        int c = 3;
        //自减运算
        int d = --c;
        System.out.println("b的值是"+b);
        System.out.println("c的值是"+c);
        System.out.println("d的值是"+d);
        System.out.println("进行自增运算后的值等于"+b);
        System.out.println("进行自减运算后的值等于"+d);
    }
}
