package com.java.basis.System;

/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-11-17 14:09
 * System 的数组拷贝
 **/

public class SystemDemo {
    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5,6,7,8,9,0};
        int [] arr2={11,22,33,44,55,66,77,88,99,100};
        /**
         * 1、要拷贝的数组
         * 2、要拷贝数组的开始索引
         * 3、目标数组
         * 4、目标数组的开始索引；
         * 5、要拷贝的长度
         *
         */
        System.arraycopy(arr2,1,arr1,3,2);
        for (int i = 0; i <arr1.length ; i++) {
            System.out.println(arr1[i]+"\t");
        }
    }
}
