package com.java.basis.array;

/**
 * @Author: Lambert
 * @Date: 2018/10/22 上午8:51
 * @Description: 腾讯课堂
 * 二分法查询
 */
public class Test9 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 62, 57};
        int index = getBinaryQuery(array, 62);
        System.out.println(index);

    }

    public static int getBinaryQuery(int[] array, int value) {
        /**
         * 定义最小的索引
         */
        int min = 0;
        /**
         * 定义最大索引
         */
        int max = array.length - 1;
        /**
         * 计算中间索引
         */
        int mid = (min + max) / 2;

        /**
         * 通过while来做二分循环
         */
        while (array[mid] != value) {
            /**
             * 重新计算最小和最大索引
             */

            /**
             * 如果要查找的值比中间小
             */
            if (array[mid] > value) {
                max = mid - 1;
                /**
                 * 如果要查找的值比中间大
                 */
            } else {
                min = mid + 1;
            }
            /**
             * 更新中间索引
             */
            mid = (min + max) / 2;

        }

        return mid;
    }
}