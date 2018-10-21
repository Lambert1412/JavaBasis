package com.java.basis.array;

/**
 * @Author: Lambert
 * @Date: 2018/10/21 下午4:52
 * @Description:
 */
public class Test6 {
    public static void main(String[] args) {
        int[] arr = {6, 3, 8, 2, 9, 1};
        System.out.println("排序前数组为：");
        for (int num : arr) {
            System.out.println(num + "");
        }
        /**
         *外层循环控制排序趟数
         */
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println("排序后数组为：");
            for (int num : arr)
                System.out.println(num + "");
        }
    }
}