package com.java.basis.SpringBufferDemo;

/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-11-14 08:45
 * 在指定位置插入字符串，
 * 注意数组越界问题
 **/

public class SpringBufferDemo_04 {
    public static void main(String[] args) {
        StringBuffer stringBuffer =new StringBuffer("helloword");
//        第二个位置插入字符
        stringBuffer.insert(2,true);
        System.out.println(stringBuffer);
        stringBuffer.insert(2,"kkk");
        System.out.println(stringBuffer);
        stringBuffer.insert(3,new char[]{'a','b','c','d','e','f'});
        System.out.println(stringBuffer);

        System.out.println("------------------------------------");
        StringBuffer stringBuffer1 =new StringBuffer("hello");
        //数组选择插入
        char [] d={'1','2','3','4'};
//        stringBuffer1.insert(index,str,offset,len)
        stringBuffer1.insert(3,d,2,2);
        System.out.println(stringBuffer1);
    }
}
