package com.java.basis.StringDemo;


/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-11-11 14:13
 * 查找下面字符串数量
 **/

public class StringDemo14 {
    public static void main(String[] args) {
        int count = 0;
//        获得la第一次出现的索引
        String a = "lalalalalallalalalalalallaallalalalalalalal";
        int index = a.indexOf("la");
        while (index != -1) {
            count++;
            index = a.indexOf("la", index + 2);
        }
        System.out.println("la出现的次数是" + count + "次");
    }
}
