package com.java.basis.StringDemo;


import java.util.Scanner;

/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-11-11 14:13
 * 分割字符串
 **/

public class StringDemo12 {
    public static void main(String[] args) {
        String str = "3000-3999-uu-999-kkk-2333";
//        分割字符串
        String[] sTrs = str.split("-");
        for (int i = 0; i <sTrs.length ; i++) {
            String str1=sTrs[i];
            System.out.println(str1);
        }
    }
}
