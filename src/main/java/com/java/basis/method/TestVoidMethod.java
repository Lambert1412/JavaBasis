package com.java.basis.method;

/**
 * @Author: Lambert
 * @Date: 2018/10/3 下午7:56
 * @Description:
 * void 关键字
 * 本节说明如何声明和调用一个 void 方法。
 * 下面的例子声明了一个名为 printGrade 的方法，并且调用它来打印给定的分数。
 */
public class TestVoidMethod {
    public static void main(String[] args) {
        printGrade(78.5);
    }
    public static void printGrade(double score){
        if (score>=90.0){
            System.out.println('A');
        }
        else if (score >=80.0){
            System.out.println("B");
        }else if (score>=70.0){
            System.out.println("D");
        }else if (score>=60.0){
            System.out.println("F");
        }
    }
}
