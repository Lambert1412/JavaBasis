package com.java.basis.Data;

import java.util.Date;

/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-11-17 17:30
 * 昨天时间计算
 **/

public class DateDemo11 {
    public static void main(String[] args) {
        //创建日期对象
        Date date = new Date();
        System.out.println(date);

        //计算昨天到现在的时间戳
        long ms = 24 * 60 * 60 * 1000;
        long cms= System.currentTimeMillis();
        //获得昨天当前时间
        Date date1 =new Date(cms-ms);
        System.out.println(date1);
    }
}
