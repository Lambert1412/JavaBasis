package com.java.basis.clazz;

/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-11-17 14:43
 * 包装类
 **/

public class ClazzDemo {
    public static void main(String[] args) {
        byte b = 1;
        Byte b1 = new Byte("15");
        //输出int的最大值
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        //Integer 的常用构造器
        Integer i1 = new Integer(1);
        Integer i2 = new Integer("90");
        System.out.println(i1);
        System.out.println(i2);

        //int 和Integer 转换
        int i = 10;
        Integer i3 = new Integer(i);

        //Integer----->int
        i = i3.intValue();

        //String----->Integer(应用最多)
        //字符串必须是数值类型，字符串不是null
        String str = "90";
        //第一种方式转换
        Integer i4 = new Integer(str);
        //第二种方式转换
        Integer i5 = Integer.valueOf(str);

        //String------>int
        String str1 = "10";
        int i6 = Integer.parseInt(str1);
        System.out.println(i6 * 10);

        //Integer-------->String
        Integer i7 = new Integer(9);
        //方法一
        String stri7 = i7.toString();
        //方法二
        String stri8 = i7 + "";
        //方法三
        String stri9=String.valueOf(i7);
    }
}
