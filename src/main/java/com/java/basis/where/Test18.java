package com.java.basis.where;

/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-11-19 13:49
 * 打印1-100偶数
 * for循环
 **/

public class Test18 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i = i + 2) {
            System.out.println(i + "");
            if (i / 10 == 0) {
                System.out.println();
            }
        }
    }
}
