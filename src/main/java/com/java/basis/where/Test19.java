package com.java.basis.where;

/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-11-19 15:30
 * 跳出
 **/

public class Test19 {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            System.out.println("我跑了第"+i+"圈了");
            if (i==3){
                System.out.println("不行了岔气了");
                break;
            }
        }
    }
}
