package com.java.basis.Number;

/**
 * @Author: Lambert
 * @Date: 2018/10/3 下午5:34
 * @Description:
 * foreach 循环
 * 循环或者加强型循环，它能在不使用下标的情况下遍历数组。
 */
public class TestArray3 {
    public static void main(String[] args) {
        double[] myList = {1.9, 2.9, 3.4, 3.5};
        // 打印所有数组元素
        for (double element:myList){
            System.out.println(element);
        }
    }
}
