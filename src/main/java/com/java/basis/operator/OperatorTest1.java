package com.java.basis.operator;

/**
 * @Author: Lambert
 * @Date: 2018/10/2 下午2:48
 * @Description:
 * 位运算符
 * Java定义了位运算符，应用于整数类型(int)，长整型(long)，短整型(short)，字符型(char)，和字节型(byte)等类型。
 * 位运算符作用在所有的位上，并且按位运算。假设a = 60，b = 13;它们的二进制格式表示将如下：
 */
public class OperatorTest1 {
    public static void main(String[] args) {
        /* 60 = 0011 1100 */
        int a = 60;
        /* 13 = 0000 1101 */
        int b = 13;
        int c = 0;
        /* 12 = 0000 1100 */
        c = a & b;
        System.out.println("a & b = " + c );
        /* 61 = 0011 1101 */
        c = a | b;
        System.out.println("a | b = " + c );
        /* 49 = 0011 0001 */
        c = a ^ b;
        System.out.println("a ^ b = " + c );
        /*-61 = 1100 0011 */
        c = ~a;
        System.out.println("~a = " + c );
        /* 240 = 1111 0000 */
        c = a << 2;
        System.out.println("a << 2 = " + c );
        /* 15 = 1111 */
        c = a >> 2;
        System.out.println("a >> 2  = " + c );
        /* 15 = 0000 1111 */
        c = a >>> 2;
        System.out.println("a >>> 2 = " + c );
    }
}
