package com.java.basis.array;

/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-11-20 13:19
 * 求极值
 * 最大，最小的值是多少
 **/

public class TestDemo3 {
    public static void main(String[] args) {
        //定义数组
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int maxVal = maxVelue(arr);
        System.out.println(maxVal);
    }

    public static int maxVelue(int[] array) {
        //定义结果变量，把第一个结果的初始值赋值给result
        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            //如果result小于所比较数的时候，
            if (result < array[i]) {
                //把比result大的数赋值给他array[i]
                result = array[i];
            }

        }
        return result;
    }
}
