package com.java.basis.array;

/**
 * @Author: Lambert
 * @Date: 2018/10/21 下午9:54
 * @Description: 二分法查询
 * 查询输入数字
 */
public class Test8 {
    public static void main(String[] args) {
        int[] array = {23, 34, 87, 12, 7, 83, 57};
        int index = getValueIndex(array, 58);
        System.out.println(index + 1);
    }

    public static int getValueIndex(int[] array, int value) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                index = i;
                break;
            } else {
                System.out.println("查询不到");
                break;
            }
        }
        return index;
    }
}
