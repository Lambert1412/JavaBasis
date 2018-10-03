package com.java.basis.Data;

import java.util.Date;

/**
 * @Author: Lambert
 * @Date: 2018/10/3 下午6:29
 * @Description:
 * 索引必须紧跟在%后面，而且必须以$结束。例如：
 */
public class DateDemo4 {
    public static void main(String[] args) {
        // 初始化 Date 对象
        Date date=new Date();

        // 使用toString()显示日期和时间
        System.out.printf("%1$s %2$tB %2$td, %2$tY",
                "Due date:", date);
    }
}
