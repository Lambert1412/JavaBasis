package com.java.basis.SpringBufferDemo;

/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-11-14 08:17
 * stringBuffer的容量
 **/

public class SpringBufferDemo_03 {
    public static void main(String[] args) {
        //创建可变字符串，默认容量为16个字符的空间
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println("可变字符串的长度是" + stringBuffer.length() + "容量是" + stringBuffer.capacity());
        stringBuffer.append("Hello");
        System.out.println("可变字符串的长度是" + stringBuffer.length() + "容量是" + stringBuffer.capacity());
        stringBuffer.append("111111111112222222222222222223444444444445555555555555");
        System.out.println("可变字符串的长度是" + stringBuffer.length() + "容量是" + stringBuffer.capacity());
    }
}
