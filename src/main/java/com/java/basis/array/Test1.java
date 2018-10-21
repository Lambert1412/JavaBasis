package com.java.basis.array;

/**
 * @Author: Lambert
 * @Date: 2018/10/21 下午3:43
 * @Description: java 数组
 */
public class Test1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println("--------------");
        arr[0] = 1;
        arr[1] = 34;
        arr[2] = 45;
        arr[3] = 2;
        arr[4] = 5;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
    }
}
