package com.java.basis.array;

import static com.java.basis.array.ArrayUtils.printArray;
import static com.java.basis.array.ArrayUtils.sort;

/**
 * @Author: Lambert
 * @Date: 2018/10/28 上午10:26
 * @Description:
 * static 作为工具类封装
 */
public class ArrayUtils {
    public static void sort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

}

class TestArrayUtils {
    public static void main(String[] args) {
        int[] array = {97, 12, 190, 4, 52, 98};


//
//        ArrayUtils.printArray(array);
//        ArrayUtils.sort(array);
//        System.out.println();
//        ArrayUtils.printArray(array);


//        //在同一个类中可以不加类名去访问静态方法。如果是不同类之间来访问静态方法必须加类名
        printArray(array);
        sort(array);
        System.out.println();
        printArray(array);

    }
}
