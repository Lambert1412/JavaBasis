package com.java.basis.where;

/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-11-18 00:03
 * 1-100之间的偶数和
 **/

public class Test15 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                sum =sum+i;
//                sum += i;
            }
            i++;
        }
        System.out.println("1-100之间的偶数和是" + sum);
    }
}
