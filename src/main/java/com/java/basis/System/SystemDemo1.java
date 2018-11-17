package com.java.basis.System;

/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-11-17 14:18
 *
 * 毫秒时间戳以及运行时间计算
 **/

public class SystemDemo1 {
    public static void main(String[] args) {
        //获取当前时间的毫秒数,从1970年到现在的毫秒数
        long tm=System.currentTimeMillis();
        System.out.println(tm);
        long starTime=System.currentTimeMillis();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime=System.currentTimeMillis();

        System.out.println("程序的运行时间是"+(endTime - starTime)+"毫秒");
    }
}
