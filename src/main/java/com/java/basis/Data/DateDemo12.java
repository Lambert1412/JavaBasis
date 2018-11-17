package com.java.basis.Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-11-17 19:27
 * <p>
 * 字符串与时间相互转换
 **/

public class DateDemo12 {
    public static void main(String[] args) {
        //创建时间对象
        Date date = new Date();
        //创建时间格式化对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        String str = simpleDateFormat.format(date);
        System.out.println(str);
        //自定义格式化对象
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        //把日期转换成字符串
        String str1 = simpleDateFormat1.format(date);
        System.out.println(str1);

        //把字符串转换为时间
        String str2 = "2018-12-22 00:00:00:000";
        try {
            Date date1 = simpleDateFormat1.parse(str2);
            System.out.println(date1);
            long ms = date1.getTime();
            System.out.println(ms);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
