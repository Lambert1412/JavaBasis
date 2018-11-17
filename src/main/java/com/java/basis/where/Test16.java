package com.java.basis.where;

/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-11-18 00:18
 *
 * do where  第一次执行不需要判断
 **/

public class Test16 {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 100);
    }
}
