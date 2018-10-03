package com.java.basis.method;


/**
 * @Author: Lambert
 * @Date: 2018/10/3 下午7:46
 * @Description:
 * 对象比较大小
 * 比较对象大小
 */
public class TestMax {
    public static void main(String[] args) {
        int i=5;
        int j=2;
        int k=max(i,j);
        System.out.println(i+"和"+j+"比较，最大值是："+k);
    }
    /** 返回两个整数变量较大的值 */
    /** 返回两个整数变量较大的值 */
    public static int max(int num1, int num2) {
        int result;
        if (num1 > num2)
            result = num1;
        else
            result = num2;

        return result;
    }
}
