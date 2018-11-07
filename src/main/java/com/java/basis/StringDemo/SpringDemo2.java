package com.java.basis.StringDemo;

/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-11-06 22:20
 * 字符串的构造器
 **/

public class SpringDemo2 {
    public static void main(String[] args) {
        //创建一个空字符串的对象
        String str = new String();
        //字节数组为参数的字符串
        byte[] be = {97, 96, 98, 99, 100, 101, 102, 103, 104, 105, 106};
        String str1 = new String(be);
        System.out.printf("打印字符串str" + str + "---------");
        System.out.printf("\n");

        System.out.printf("打印字符串be" + str1);
        String str2 = new String(be, 3, 2);
        System.out.printf("\n" + "以参数作为字符数组" + str2);

        char[] cs = {'a', 'b', 'c' , 'd' , 'e' , 'f' , 'o'};
        String str3 = new String(cs);
        System.out.printf("\n" + "以字符串数组为参数创建数组" + str3);

        String str4 =new String(cs,3,4);
        System.out.printf("\n"+"以字符串作为参数的字符串截取创建"+str4);

        String str5 =new String("1234567890");
        System.out.printf("\n"+"以常理字符串作为参数："+str5);
    }
}
