package com.java.basis.array;

/**
 * @Author: Lambert
 * @Date: 2018/10/21 下午5:11
 * @Description:
 */
public class Test7 {
    public static void main(String[] args) {
        int[] array = {23, 34, 87, 12, 7, 83, 57};
        bubbleSort(array);
        printArr(array);
    }

    /**
     * 冒泡排序方法
     * @param array
     */
    public static void bubbleSort(int[] array) {
        /**
         * 比较的轮数
         */
        for (int i = 0; i < array.length - 1; i++) {
            /**
             * 每一轮所比较的次数，因为每一轮比较时会产生一个最小值，所有每一轮比较就会少一次
             */
            for (int j = 0; j < array.length - 1 - i; j++) {
                /**
                 * 如果后一个数比前一个数大,那么就做交换
                 */
                if (array[j + 1] < array[j]) {
                    /**
                     * 通过临时变量来存储后一个数
                     */
                    int temp = array[j + 1];
                    /**
                     * 把后一个数换成前一个数
                     */
                    array[j + 1] = array[j];
                    /**
                     * 再把前一个数换成后一个数
                     */
                    array[j] = temp;
                }
            }
        }
    }

    public static void printArr(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

}
