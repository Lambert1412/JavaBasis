package com.java.basis.Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: Lambert
 * @Date: 2018/10/3 下午6:35
 * @Description: 解析字符串为时间
 * SimpleDateFormat 类有一些附加的方法，特别是parse()，
 * 它试图按照给定的SimpleDateFormat 对象的格式化存储来解析字符串。例如：
 */
public class DateDemo7 {
    public static void main(String[] args) {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");

        String input = args.length == 0 ? "1818-11-11" : args[0];

        System.out.print(input + " Parses as ");

        Date t;

        try {
            t = ft.parse(input);
            System.out.println(t);
        } catch (ParseException e) {
            System.out.println("Unparseable using " + ft);
        }
    }
}
