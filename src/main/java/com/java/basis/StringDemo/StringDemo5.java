package com.java.basis.StringDemo;

/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-11-07 08:39
 **/

public class StringDemo5 {
    public static void main(String[] args) {
        String str = "Helloword";
//        指定索引处的值
        char c = str.charAt(5);
        System.out.println(c);

//        查找指定索引第一次出现（不存在返回-1）
        int d=str.indexOf('l');
        System.out.println(d);;
    }
}
