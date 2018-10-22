package com.java.basis.array;

/**
 * @Author: Lambert
 * @Date: 2018/10/22 下午10:08
 * @Description: 腾讯课堂
 * 数组倒置：
 * 找到数组每次对称的数，交换即可
 */
public class Test10 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        reversArray(array);
        printArray(array);

    }

    public static void reversArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

}
