package com.java.basis.array;

/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-11-20 00:25
 **/

public class TestDemo1 {
    public static void main(String[] args) {
        /**
         * 数组语法：
         * 数据类型[] 数组名 =new 数据类型[整数]
         */
        int[] arr = new int[5];
        //声明数组第一个值为1
        arr[0] = 1;
        System.out.println(arr[2]);
        //获得数组的长度
        System.out.println(arr.length);
    }
}
