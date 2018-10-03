package com.java.basis.operator;

/**
 * @Author: Lambert
 * @Date: 2018/10/2 下午3:34
 * @Description:
 * 条件运算符（?:）
 * 条件运算符也被称为三元运算符。该运算符有3个操作数，并且需要判断布尔表达式的值。该运算符的主要是决定哪个值应该赋值给变量。
 */
public class Test4 {
    public static void main(String[] args){
        int a , b;
        a = 10;
        // 如果 a 等于 1 成立，则设置 b 为 20，否则为 30
        b = (a == 1) ? 20 : 30;
        System.out.println( "Value of b is : " +  b );

        // 如果 a 等于 10 成立，则设置 b 为 20，否则为 30
        b = (a == 10) ? 20 : 30;
        System.out.println( "Value of b is : " + b );
    }
}
