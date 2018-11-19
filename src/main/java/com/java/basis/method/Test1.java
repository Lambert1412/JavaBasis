package com.java.basis.method;

/**
 * 比较数的大小
 */

/**
 * 主函数是指挥者
 */
public class Test1 {
    public static void main(String[] args) {
        int a = 60;
        int b = 90;
        int result = compareNum(a, b);
        if (result == 0) {
            System.out.println("两个值相等");
        }
        System.out.println(result + "大");

        compareNum1(63, 45);
    }

    /**
     * 方法模板
     * <public><static> 返回值类型 [void] 方法名 （[数据类型] 参数名）{
     * 方法体
     * return 结果
     * }
     */
    public static int compareNum(int a, int b) {
        //定义结果变量
        int result = 0;
        if (a > b) {
            result = a;
        } else if (a < b) {
            result = b;
        }
        return result;
    }

    /**
     * 无返回值调用
     */
    public static void compareNum1(int a, int b) {
        if (a > b) {
            System.out.println(a + "大");
        } else if (a < b) {
            System.out.println(b + "大");
        } else {
            System.out.println("相等");
        }
    }
}
