package com.java.basis.StringDemo;


import java.util.Scanner;

/**
 * @program: basis
 * @description: 对比字符串
 * @author: Mr.LI
 * @create: 2018-11-11 14:13
 * <p>
 * 链式结构
 **/

public class StringDemo10 {
    public static void main(String[] args) {
        callMethod();
    }

    public static void callMethod() {
        try {
            getResult();
        } catch (Exception e) {
            System.out.println("请输入字符串：");
            callMethod();
        }
    }

    public static void getResult() {
        Scanner scanner = new Scanner(System.in);
        //获得输入字符串
        String line = scanner.nextLine();
        //获得第一个字符，过程中可能出现异常，如果出现异常可能向上抛出
        char firstChar = line.charAt(0);
        //获得第一个字符的字符串
        String firstStr = String.valueOf(firstChar).toUpperCase().concat(line.substring(1).toLowerCase());
        System.out.println(firstStr);
    }
}
