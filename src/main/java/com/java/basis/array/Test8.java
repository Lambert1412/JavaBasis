package com.java.basis.array;

/**
 * @Author: Lambert
 * @Date: 2018/10/21 下午9:54
 * @Description:
 * 查找数组
 * 查询输入数字
 */
public class Test8 {
    public static void main(String[] args) {
        /**
         * 定义数组
         */
        int[] array = {23, 34, 87, 12, 7, 83, 57};
        int index = getValueIndex(array, 57);
        System.out.println(index + 1);
    }

    public static int getValueIndex(int[] array, int value) {
        /**
         * 定义结果索引
         */
        int index = 1;
        /**
         * 遍历数组
         */
        for (int i = 0; i < array.length; i++) {
            /**
             * 如果找到了目标值
             */
            if (array[i] == value) {
                /**
                 * 把索引赋给结果值
                 */
                index = i;
                /**
                 * 跳出循环
                 */
                break;
            }
        }
        /**
         * 返回结果
         */
        return index;
    }
}
