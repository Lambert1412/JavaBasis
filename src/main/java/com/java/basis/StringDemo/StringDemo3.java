package com.java.basis.StringDemo;

/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-11-07 08:10
 **/

public class StringDemo3 {
    public static void main(String[] args) {
//        创建常理字符串
        String str="Helloword";
        //创建字符串对比对象
        String str1=new String("Helloword");
        System.out.println("str:"+str);
        System.out.println("\n"+"str1:"+str1+"\n");
//        对比地址
        System.out.println("两个值是否相等"+str==str1);
        //值比较
        System.out.println("\n"+"数据比较"+str.equals(str1));

        String str2 ="test";
        String str3="test";
        System.out.println(str2==str3);

        String str4="hello";
        String str5="word";
        String str6="helloword";
        System.out.println(str6==(str4+str5));
        System.out.println(str6=="hello"+"word");
    }
}
