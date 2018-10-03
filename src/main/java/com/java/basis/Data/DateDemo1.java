package com.java.basis.Data;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: Lambert
 * @Date: 2018/10/3 下午5:56
 * @Description:
 * 获取当前时间
 */
public class DateDemo1 {
    public static void main(String[] args) {
        //设置日期格式
        SimpleDateFormat df =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //设置日期格式
        System.out.println(df.format(new Date()));
    }
}
