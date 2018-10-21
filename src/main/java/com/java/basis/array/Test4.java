package com.java.basis.array;

/**
 * @Author: Lambert
 * @Date: 2018/10/21 下午3:43
 * @Description: java 数组
 * 遍历数组
 */
public class Test4 {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 2, 4, 91};
        printArray(array);
    }

    public static void printArray(int[] h) {
        for (int i = 0; i < h.length; i++) {
            System.out.println(h[i] + "\t");
        }
    }
}
