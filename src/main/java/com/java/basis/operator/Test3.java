package com.java.basis.operator;

/**
 * @Author: Lambert
 * @Date: 2018/10/2 下午2:55
 * @Description:
 * 逻辑运算符
 * 下表列出了逻辑运算符的基本运算，假设布尔变量A为真，变量B为假
 * &&   称为逻辑与运算符。当且仅当两个操作数都为真，条件才为真。
 * ||   称为逻辑或操作符。如果任何两个操作数任何一个为真，条件为真。
 * ！   称为逻辑非运算符。用来反转操作数的逻辑状态。如果条件为true，则逻辑非运算符将得到false。
 */
public class Test3 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println("a && b = " + (a&&b));
        System.out.println("a || b = " + (a||b) );
        System.out.println("!(a && b) = " + !(a && b));
    }
}
