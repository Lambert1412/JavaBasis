package com.java.basis.random;

import java.util.Random;

/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-11-17 13:44
 * 随机数种子
 *
 **/

public class RandomDemo3 {
    public static void main(String[] args) {
        plrintRandomSeed();
//        plrintRandom();
    }


    public static void plrintRandom() {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int val = r.nextInt(10);
            System.out.println(val);
        }
    }

    public static void plrintRandomSeed() {
        //固定种子随机数
        Random r = new Random(999);
        for (int i = 0; i < 10; i++) {
            int val = r.nextInt(10);
            System.out.println(val);
        }
    }
}
