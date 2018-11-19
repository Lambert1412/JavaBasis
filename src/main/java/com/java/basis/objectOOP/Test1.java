package com.java.basis.objectOOP;

/**
 * 方法重写
 */
public class Test1 {
    public static void main(String[] args) {
        
    }

    public static int compareNum(int a, int b) {
        int result = 0;
        if (a > b) {
            return a;
        } else if (a < b) {
            return b;
        }
        return result;
    }

    //    public static int compareNum(int a, int b, int c) {
//        int result = 0;
//        if (a > b) {
//            return a;
//        } else if (a > c) {
//            return a;
//        } else if (b > c) {
//            return b;
//        }
//        return result;
//    }
    public static int compareNum(int a, int b, int c) {
        //比较a和b
        int resultab = compareNum(a, b);
        //比较ab中的数和c的大小
        int resultabc = compareNum(resultab, c);
        return resultabc;
    }
}
