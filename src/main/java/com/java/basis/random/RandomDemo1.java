package com.java.basis.random;

import java.util.Random;

/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-11-17 13:29
 *
 * 获取各种类型的随机数
 **/

public class RandomDemo1 {
    public static void main(String[] args) {
        //创建随机数的对象
        Random r=new Random();
        //获取随机整数
        int val=r.nextInt();
        System.out.println("单个随机数："+val);

        for (int i = 0; i <10 ; i++) {
            boolean bval=r.nextBoolean();
            float fval=r.nextFloat();
            System.out.println("一组随机数："+r.nextInt());
            System.out.println("随机布尔类型值："+r.nextBoolean());
            System.out.println("浮点类型"+r.nextFloat());
        }
    }
}
