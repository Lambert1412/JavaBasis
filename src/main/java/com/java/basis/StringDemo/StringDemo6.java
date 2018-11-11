package com.java.basis.StringDemo;

import java.util.Scanner;

/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-11-07 23:19
 * 题目：计算出一个字符串中大写字母和小写字母还有数字的数量
 * 分析：大写字母、小写字母、数字如何筛选
 * 1、字符比较；
 * 2、转成ascii码
 **/

public class StringDemo6 {
    public static void main(String[] args) {
//        String a = "ABCDEFGhigklmnopqrstuvwxyz1234567890";
//        System.out.println(a);
        //创建Scanner对象
        Scanner sc = new Scanner(System.in);
        //获得输入的字符串
        String str = sc.nextLine();
        //去掉static方法只能这么调用
//        new StringDemo6().parseStr(str);
        parseStr(str);
    }

    public static void parseStr(String str) {
        int upperCount = 0;
        int lowerCount = 0;
        int num = 0;
        //遍历a
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                upperCount++;
            } else if (c >= 'a' && c <= 'z') {
                lowerCount++;
            } else if (c >= '0' && c <= '9') {
                num++;
            }

        }
        System.out.println("大写字母个数" + upperCount);
        System.out.println("小写字母个数" + lowerCount);
        System.out.println("字母个数" + num);
    }
}
