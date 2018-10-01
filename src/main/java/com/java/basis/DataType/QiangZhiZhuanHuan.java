package com.java.basis.DataType;

/**
 * @Author: Lambert
 * @Date: 2018/10/1 下午10:35
 * @Description:
 * 强制类型转换
 *
 * 1. 条件是转换的数据类型必须是兼容的。
 *2. 格式：(type)value type是要强制类型转换后的数据类型 实例：
 */

public class QiangZhiZhuanHuan{
    public static void main(String[] args){
        int i1 = 123;
        byte b = (byte)i1;//强制类型转换为byte
        System.out.println("int强制类型转换为byte后的值等于"+b);
    }
}