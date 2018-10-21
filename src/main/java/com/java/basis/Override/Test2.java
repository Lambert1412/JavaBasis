package com.java.basis.Override;

/**
 * @Author: Lambert
 * @Date: 2018/10/21 下午3:08
 * @Description: 腾讯课堂overload（重载）demo
 */
public class Test2 {
    public static void main(String[] args) {
        int result = compareNum(34, 54, 4);
        System.out.printf(result + "最大");
    }

    public static int compareNum(int a, int b) {
        return a > b ? a : b;
    }

    public static int compareNum(int a, int b, int c) {
        /**
         * 比较a和b
         */
        return compareNum(a, b) > c ? compareNum(a, b) : c;
    }
}
