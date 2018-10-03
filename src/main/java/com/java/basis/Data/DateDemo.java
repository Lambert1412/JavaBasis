package com.java.basis.Data;

import java.util.Date;

/**
 * @Author: Lambert
 * @Date: 2018/10/3 下午5:43
 * @Description:
 * 获取当前日期时间
 */
public class DateDemo {
    public static void main(String[] args) {
        // 初始化 Date 对象
        Date date = new Date();
        // 使用 toString() 函数显示日期时间
        System.out.println(date.toString());
    }
}
