package com.java.basis.SpringBufferDemo;

/**
 * @program: basis
 * @description: StringBuffer删除
 * @author: Mr.LI
 * @create: 2018-11-14 09:00
 * StringBuffer删除
 **/

public class SpringBufferDemo_05 {
    public static void main(String[] args) {
        StringBuffer stringBuffer =new StringBuffer("helloword");
//        删除第二个到第四个
        stringBuffer.delete(2,4);
        System.out.println(stringBuffer);
    }
}
