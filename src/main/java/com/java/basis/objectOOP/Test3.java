package com.java.basis.objectOOP;

/**
 * 方法重写
 * 优化代码，代码瘦身四则云算法
 */
public class Test3 {
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
        //a和b相比如果a大返回a否则返回b
        return a > b ? a : b;
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
        //如果a和b比c大返回ab否则返回c
        return compareNum(a,b)>c?compareNum(a,b):c;
    }
}
