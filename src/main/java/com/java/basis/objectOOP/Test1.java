package com.java.basis.objectOOP;

/**
 * 方法重写
 */
public class Test1 {
    public static void main(String[] args) {
        int result = compareNum(33, 34, 32);
        if (result == 0) {
            System.out.println("两个数相等");
        } else {
            System.out.println(result + "大");
        }
    }

    /**
     * 比较两个数值的大小
     *
     * @param a
     * @param b
     * @return
     */
    public static int compareNum(int a, int b) {
        int result = 0;
        if (a > b) {
            return a;
        } else if (a < b) {
            return b;
        }
        return result;
    }

    /**
     * 比较三个数直接的大小
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static int compareNum(int a, int b, int c) {
        //比较a和b
        int resultab = compareNum(a, b);
        //比较ab中的数和c的大小
        int resultabc = compareNum(resultab, c);
        return resultabc;
    }
}
