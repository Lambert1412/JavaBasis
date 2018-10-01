package com.java.basis.DataType;

/**
 * @Author: Lambert
 * @Date: 2018/10/1 下午10:29
 * @Description:
 * 自动类型转换
 *
 *
 * 必须满足转换前的数据类型的位数要低于转换后的数据类型，
 * 例如: short数据类型的位数为16位，就可以自动转换位数为32的int类型，
 * 同样float数据类型的位数为32，可以自动转换为64位的double类型。
 */
public class ZiDongLeiZhuan{
    public static void main(String[] args){
        //定义一个char类型
        char c1='a';
        //char自动类型转换为int
        int i1 = c1;
        System.out.println("char自动类型转换为int后的值等于"+i1);
        //定义一个char类型
        char c2 = 'A';
        //char 类型和 int 类型计算
        int i2 = c2+1;
        System.out.println("char类型和int计算后的值等于"+i2);
    }
}
