package com.java.basis.clazz;

/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-11-17 16:50
 * 自动装箱和拆箱问题
 *
 **/

public class ClazzDemo1 {
    public static void main(String[] args) {
        //基本数据类型------>包装类=======装箱
        int i = 9;
        //装箱
        Integer a = i;

        //包装类------>基本数据类型======拆箱
        Integer i1 = new Integer(123);
        int i2=i1;
    }
}
