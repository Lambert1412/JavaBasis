package com.java.basis.Number;

/**
 * @Author: Lambert
 * @Date: 2018/10/3 下午4:37
 * @Description: Math 的 floor,round 和 ceil 方法实例比较
 */
public class Test2 {
    public static void main(String[] args) {
        double[] nums = {1.4, 1.5, 1.6, -1.4, -1.5, -1.6};
        for (double num : nums) {
            test(num);
        }
    }

    private static void test(double num) {
        System.out.println("Math.floor(" + num + ")=" + Math.floor(num));
        System.out.println("Math.round(" + num + ")=" + Math.floor(num));
        System.out.println("Math.ceil(" + num + ")=" + Math.ceil(num));
    }
}
