package com.java.basis.where;

/**
 * @Author: Lambert
 * @Date: 2018/10/21 下午2:56
 * @Description:
 * 腾讯课堂demo
 */
public class Test13 {
    public static void main(String[] args) {
        for (int i = 0; i <8 ; i++) {
            System.out.printf("跑了第"+i+"圈"+"\n");
            if (i==3){
                System.out.printf("岔气了，不行了");
                break;
            }
        }
    }
}
