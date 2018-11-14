package com.java.basis.SpringBufferDemo;

/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-11-14 07:56
 * StringBuffer与Spring的区别
 **/

public class SpringBufferDemo_02 {
    public static void main(String[] args) {
        //创建可变字符串
        StringBuffer stringBuffer = new StringBuffer();
        //把可变字符串做追加
        StringBuffer stringBuffer1 = stringBuffer.append(true);
        //判断可变字符串是否相当
        System.out.println(stringBuffer == stringBuffer1);
        String a = "abc";
        String b = a + true;
        System.out.println(a == b);
    }
}
