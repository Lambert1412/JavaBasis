package com.java.basis.ScannerDemo;

import java.util.Scanner;

/**
 * @Author: Lambert
 * @Date: 2018/10/4 下午3:53
 * @Description:
 * nextLine 方法：
 */
public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //nextLine方式接收：
        System.out.println("nextLine方式接收：");

        // 判断是否还有输入
        if (scanner.hasNextLine()) {
            String str2 = scanner.nextLine();
            System.out.println("输入的数据为：" + str2);
        }
        scanner.close();
    }
}
