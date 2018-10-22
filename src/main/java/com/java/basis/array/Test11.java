package com.java.basis.array;

/**
 * @Author: Lambert
 * @Date: 2018/10/22 下午10:21
 * @Description:
 * 腾讯课堂
 * 
 */
public class Test11 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}, {13, 3, 4, 9}};
        printArray(array);
    }

    public static void printArray(int[][] array) {
        /**
         * array.length指的是集合中有几个集合
         */
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
