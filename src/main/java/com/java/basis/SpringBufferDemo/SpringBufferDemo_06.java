package com.java.basis.SpringBufferDemo;

/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-11-17 11:11
 * StringBuffer append字符串拼接
 **/

public class SpringBufferDemo_06 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append(true).
        append('a').
        append(new char[]{'a','b','c'}).
        append("hello").
        append(100d).
        append(14.5F).
        append(13).
        append(9001);
        System.out.println(sb);
    }
}
