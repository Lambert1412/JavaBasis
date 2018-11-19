package com.java.basis.method;

/**
 * 比较数的大小
 */

/**
 * 主函数是指挥者
 */
public class Test1 {
    public static void main(String[] args) {
        int a = 90;
        int b = 30;
        int result = compareNum(a, b);
        System.out.println(result + "大");
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
}
