package com.java.basis.array;

/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-11-20 00:25
 * <p>
 * 数组基础
 **/

public class TestDemo1 {
    public static void main(String[] args) {
        /**
         * 数组语法：
         * 语法一：
         * 数据类型[] 数组名 =new 数据类型[整数]
         * 语法二：
         * 数据类型[] 数组变量名称={值1，值2，值3};
         * 语法三：
         * 数据类型[] 数组变量名 =new 数据类型[]{值1，值2，值3};
         */
        int[] arr = new int[5];
        //声明数组第一个值为1
        arr[0] = 1;
        System.out.println("arr第三个数字是" + arr[2]);
        //获得数组的长度
        System.out.println("arr的长度是" + arr.length);
        int[] arr1 = {2, 3, 3, 3, 8, 8, 6, 6, 6};
        System.out.println("arr1的数组的长度是:" + arr1.length);
        System.out.println("arr1第2个数组是" + arr1[1]);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr1的全部数组是:" + arr1[i]);
        }
        /**
         * 第三种声明方式
         */
        int[] arr2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println("arr2的长度是:" + arr2.length);
        System.out.println("arr2第三个值是:" + arr2[2]);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("arr2的全部数组是:" + arr2[i]);
        }
    }
}
