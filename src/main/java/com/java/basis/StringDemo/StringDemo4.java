package com.java.basis.StringDemo;

/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-11-07 08:39
 **/

public class StringDemo4 {
    public static void main(String[] args) {
        String str = "Helloworld";
//        判断字符串是否ld结尾
        System.out.println(str.endsWith("ld"));
        //比较值
        System.out.println(str.equals("Helloworld"));
//        建议使用（能防止空指针异常）
        System.out.println("Helloworld".equals(str));
//        不区分大小写比较
        System.out.println("HelloWorld".equalsIgnoreCase(str));
//        判断是否包含两个连续字符串(区分大小写)
        System.out.println(str.contains("ll"));
//        判断是否以。。。开头
        System.out.println(str.startsWith("He"));
//        字符串的长度是否是0
        System.out.println(str.isEmpty());
        System.out.println("".isEmpty());
//        获取字符串的长度
        System.out.println(str.length());
    }
}
