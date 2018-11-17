package com.java.basis.SpringBufferDemo;

/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-11-13 22:50
 **/

public class SpringBufferDemo_01 {
    public static void main(String[] args) {
        String a = "123456789023423443455546:zhangsan:21:1|473854754865476576443203:lisi:18:2|99998989324343645324326:wangwu:30:1|";
        //判断输入字符串不是空
        if (a == null && !"".equals(a.trim())) {
            //根据|来做字符串的分割
            String[] p = a.split("\\|");
            //遍历字符串的数组
            for (int i = 0; i < p.length; i++) {
                //获得p的字符串数据
                String p1 = p[i];
                //把字符串按照学号、姓名、年龄、性别来拆分
                String[] p2 = p1.split(":");
                SpringBufferDemo_01 p3 = new SpringBufferDemo_01();
                System.out.printf(p1);
            }
        }
    }
}
