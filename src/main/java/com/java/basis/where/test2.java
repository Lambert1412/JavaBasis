package com.java.basis.where;

/**
 * @Author: Lambert
 * @Date: 2018/10/2 下午4:38
 * @Description:
 * for循环
 * 虽然所有循环结构都可以用 while 或者 do...while表示，但 Java 提供了另一种语句 —— for 循环，使一些循环结构变得更加简单。
 * for循环执行的次数是在执行前就确定的。语法格式如下：
 * for(初始化; 布尔表达式; 更新) {
 *     //代码语句
 * }
 */

public class test2 {
    public static void main(String args[]) {

        for(int x = 10; x < 20; x = x+1) {
            System.out.print("value of x : " + x );
            System.out.print("\n");
        }
    }
}
