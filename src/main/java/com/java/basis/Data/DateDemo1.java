package com.java.basis.Data;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: Lambert
 * @Date: 2018/10/3 下午5:56
 * @Description:
 * 获取当前时间
 * G:纪元标记
 * y:四位年份
 * M:月份
 * d:一个月的日期
 * h: A.M./P.M. (1~12)格式小时
 * H:一天中的小时 (0~23)
 * m:分钟数
 * s:秒数
 * S:毫秒数
 * E:星期几
 * D:一年中的日子
 * F:一个月中第几周的周几
 * w:一年中第几周
 * W:一个月中第几周
 * a:A.M./P.M. 标记
 * k:一天中的小时(1~24)
 * K:A.M./P.M. (0~11)格式小时
 * z:时区
 * ':文字定界符
 * ":单引号
 */
public class DateDemo1 {
    public static void main(String[] args) {
        //设置日期格式
        SimpleDateFormat df =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //设置日期格式
        System.out.println("当前时间为:"+ df.format(new Date()));
    }
}
