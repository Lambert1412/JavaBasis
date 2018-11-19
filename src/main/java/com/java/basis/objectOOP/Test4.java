package com.java.basis.objectOOP;

/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-11-20 00:17
 * 类型不同的方法重载
 **/

public class Test4 {
    public static void main(String[] args) {
        double a = add(1.5, 2);
        int b = add(1, 2);
        System.out.println(a);
        System.out.println(b);
    }

    /**
     * 两个整数相加
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * 一个小数和一个整数相加
     *
     * @param a
     * @param b
     * @return
     */
    public static double add(double a, int b) {
        return a + b;
    }
}
