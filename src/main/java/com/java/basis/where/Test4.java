package com.java.basis.where;

/**
 * @Author: Lambert
 * @Date: 2018/10/2 下午4:46
 * @Description:
 * break 关键字
 * break 主要用在循环语句或者 switch 语句中，用来跳出整个语句块。
 * break 跳出最里层的循环，并且继续执行该循环下面的语句。
 * 语法
 * break 的用法很简单，就是循环结构中的一条语句：
 */

public class Test4 {
    public static void main(String args[]) {
        int [] numbers = {10, 20, 30, 40, 50};

        for(int x : numbers ) {
            // x 等于 30 时跳出循环
            if( x == 30 ) {
                break;
            }
            System.out.print( x );
            System.out.print("\n");
        }
    }
}
