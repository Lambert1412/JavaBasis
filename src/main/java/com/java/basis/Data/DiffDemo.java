package com.java.basis.Data;

import java.util.Date;

/**
 * @Author: Lambert
 * @Date: 2018/10/3 下午6:47
 * @Description:
 * 时间相差对比
 * 下面的一个例子表明如何测量时间间隔（以毫秒为单位）：
 */
public class DiffDemo {

    public static void main(String args[]) {
        try {
            long start = System.currentTimeMillis();
            System.out.println(new Date() + "\n");
            Thread.sleep(5 * 60 * 10);
            System.out.println(new Date() + "\n");
            long end = System.currentTimeMillis();
            long diff = end - start;
            System.out.println("Difference is : " + diff);
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }
    }
}