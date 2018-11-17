package com.java.basis.random;

import java.util.Random;

/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-11-17 13:39
 *
 * 获取直接的指定随机数
 **/

public class RandomDemo2 {
    public static void main(String[] args) {
        Random r=new Random();
        for (int i = 0; i < 10; i++) {
//获取直接的指定随机数
            int val=r.nextInt(10);
            System.out.println(val);
        }
    }
}
