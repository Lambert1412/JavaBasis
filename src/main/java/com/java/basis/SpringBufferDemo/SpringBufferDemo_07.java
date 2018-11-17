package com.java.basis.SpringBufferDemo;

/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-11-17 11:27
 * StringBuffer的字符串、索引反转使用
 **/

public class SpringBufferDemo_07 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Helloword");
        StringBuffer sb1=new StringBuffer("Helloworlld");
        //第一个参数是开始替换的索引，第二个参数是替换的结束索引，第三个参数是替换的字符串
        sb.replace(2,5,"xx");
        System.out.println(sb);
        //字符串的反转
        sb.reverse();
        System.out.println("Helloword反过来是"+sb);
        //获得倒数第一次出现的字符串
        int lastIndex =sb1.lastIndexOf("ll");
        System.out.println(lastIndex);
        //获得从指定的字符串向前数，找到倒数第一次出现的字符串索引
        int lastIndex1=sb1.lastIndexOf("ll",5);
        System.out.println(lastIndex1);
    }
}
