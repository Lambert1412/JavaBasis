package com.java.basis.StringDemo;


import java.util.Scanner;

/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-11-11 14:13
 **/

public class StringDemo11 {
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
        String firstStr = line.substring(0, 1).toUpperCase().concat(line.substring(1).toLowerCase());
        System.out.println(firstStr);
    }
}
