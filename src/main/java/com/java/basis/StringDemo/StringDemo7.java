package com.java.basis.StringDemo;

/**
 * @program: basis
 * @description: 对比字符串
 * @author: Mr.LI
 * @create: 2018-11-11 14:13
 **/

public class StringDemo7 {
    public static void main(String[] args) {
        String a = "ABCDEFGhigklmnopqrstuvwxyz1234567890";
        parseStr(a);
    }

    public static void parseStr(String str) {
        int Capital = 0;
        int Lowercase = 0;
        int num = 0;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'B') {
                Capital++;
            } else if (c >= 'a' && c <= 'b') {
                Lowercase++;
            } else if (c >= '0' && c <= '9') {
                num++;
            }
        }
        System.out.println("大写字母有" + Capital + "个");
        System.out.println("小写字母有" + Lowercase + "个");
        System.out.println("数字有" + num + "个");
    }
}
