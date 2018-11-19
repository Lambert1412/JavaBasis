package com.java.basis.where;

/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-11-19 15:33
 *
 * continue 跳出执行
 **/

public class Test20 {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            if (i==3){
                System.out.println("请假了");
                continue;
            }
            System.out.println("我跑了第"+i+"圈了");
        }
    }
}
