package com.java.basis.Data;

import java.util.Date;

/**
 * @Author: Lambert
 * @Date: 2018/10/3 下午6:42
 * @Description:
 * Java 休眠(sleep)
 * sleep()使当前线程进入停滞状态（阻塞当前线程），让出CPU的使用、目的是不让当前线程独自霸占该进程所获的CPU资源，以留一定时间给其他线程执行的机会。
 * 你可以让程序休眠一毫秒的时间或者到您的计算机的寿命长的任意段时间。例如，下面的程序会休眠3秒：
 */
public class DateDemo8 {
    public static void main(String[] args) {
        try {
            System.out.println(new Date()+"\n");
            Thread.sleep(1000*3);
            System.out.println(new Date()+"\n");
        }catch (Exception e){
            System.out.println("Got an exception");
        }
    }
}
