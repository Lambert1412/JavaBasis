package com.java.basis.where;

/**
 * @Author: Lambert
 * @Date: 2018/10/2 下午9:09
 * @Description:
 * 嵌套的 if…else 语句
 * 使用嵌套的 if…else 语句是合法的。也就是说你可以在另一个 if 或者 elseif 语句中使用 if 或者 elseif 语句。
 */
public class Test9 {
    public static void main(String args[]) {
        int x = 30;
        int y = 10;

        if (x == 30) {
            if (y == 10) {
                System.out.print("X = 30 and Y = 10");
            }
        }
    }
}
