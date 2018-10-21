package com.java.basis.array;

/**
 * @Author: Lambert
 * @Date: 2018/10/21 下午3:43
 * @Description: java 数组
 * 求极值
 */
public class Test5 {
    /**
     * 求出数组的最大值
     *
     * @param args
     */
    public static void main(String[] args) {
        /**
         * 定义数组
         */
        int[] array = {2, 4,234, 6, 2, 4, 91};
        int maxVal = maxValue(array);
        System.out.println("最大值是：" + maxVal);

    }

    /**
     * 定义选举对象
     * @param array
     * @return
     */
    public static int maxValue(int[] array) {
        /**
         * 定义结果变量
         */
        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            /**
             * 如果result 小于所比较的数的时候
             */
            if (result < array[i]) {
                /**
                 * 把比result大的数赋给result即可
                 */
                result = array[i];
            }
        }
        return result;
    }

}
