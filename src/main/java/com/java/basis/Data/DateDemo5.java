package com.java.basis.Data;

import java.util.Date;

/**
 * @Author: Lambert
 * @Date: 2018/10/3 下午6:32
 * @Description:
 * 或者，你可以使用 < 标志。它表明先前被格式化的参数要被再次使用。例如：
 */
public class DateDemo5 {
    public static void main(String args[]) {
        // 初始化 Date 对象
        Date date = new Date();

        // 显示格式化时间
        System.out.printf("%s %tB %<te, %<tY",
                "Due date:", date);
    }
}
