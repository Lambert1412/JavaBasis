package com.java.basis.SpringBufferDemo;

import java.util.Scanner;

/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-11-12 08:07
 **/

public class SpringBufferDemo {
    public static void main(String[] args) {
        //定义字符串
        String a = "123456789023423443455546:zhangsan:21:1|473854754865476576443203:lisi:18:2|99998989324343645324326:wangwu:30:1|";
        Scanner scanner = new Scanner(System.in);
        //获得输入字符串
        String str = scanner.nextLine();
        //判断输入字符串不是空
        if (str != null && !"".equals(str.trim())) {
            //根据|来做字符串的分割
            String[] p = str.split("\\|");
            //遍历字符串的数组
            for (int i = 0; i <p.length ; i++) {
                //获得p的字符串数据
                String p1=p[i];
                //把字符串按照学号、姓名、年龄、性别来拆分
                String [] p2=p1.split(":");
                SpringBufferDemo p3 =new SpringBufferDemo();
                //给学号赋值
                System.out.println(p1);
            }
        }
    }
}
