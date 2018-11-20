package com.java.basis.array;

/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-11-20 00:54
 * 数组遍历
 **/

public class TestDemo2 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        pleanArray(arr);
    }

    public static void pleanArray(int[] h) {
        for (int i = 0; i < h.length; i++) {
            System.out.println("数组是：" + h[i] + "\t");
        }
    }
}
