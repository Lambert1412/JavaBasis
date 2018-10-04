package com.java.basis.File;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: Lambert
 * @Date: 2018/10/4 下午2:35
 * @Description:
 * 从控制台读取字符串
 * 从标准输入读取一个字符串需要使用 BufferedReader 的 readLine() 方法。
 */
public class BRReadLines1 {
    public static void main(String[] args) throws IOException {
        // 使用 System.in 创建 BufferedReader
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit.");
        do {
            str=br.readLine();
            System.out.println(str);
        }while (!str.equals("end"));
    }
}
