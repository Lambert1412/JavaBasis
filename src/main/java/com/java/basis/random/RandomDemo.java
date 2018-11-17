package com.java.basis.random;

/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-11-17 12:33
 * 随机数
 **/

public class RandomDemo {
    public static void main(String[] args) {
        Double val=Math.random();
        System.out.println(val);

        //获得1-100的整数
        Double val1=val*100;
//        System.out.println(val1);
        int val2=(int)Math.floor(val*100)+1;
//        int val2=(int) (val*100)+1;
        System.out.println(val2);
    }
}
