package com.java.basis.StringDemo;


import java.util.Scanner;

/**
 * @program: basis
 * @description: 对比字符串
 * @author: Mr.LI
 * @create: 2018-11-11 14:13
 * <p>
 * 题：
 * 从控制台输出一段字符串，然后把首字母变成大写，其余变成小写
 * 1、获取所有字符串
 * 2、把首写字符大写，把后面的变小写
 * 3、把大写的字符和后面的拼接上
 **/

public class StringDemo9 {
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
        String firstStr = String.valueOf(firstChar);
        //把他变成大写
        String firstStrUpper = firstStr.toUpperCase();
        //获得第一个字符串后面的字符串
        String lastStr = line.substring(1);
        String lowerLastStr = lastStr.toLowerCase();
        //获得结果字符串
        System.out.println(firstStrUpper + lowerLastStr);
    }
}
