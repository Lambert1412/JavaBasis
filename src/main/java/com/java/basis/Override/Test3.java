package com.java.basis.Override;


/**
 * @Author: Lambert
 * @Date: 2018/10/21 下午3:08
 * @Description: 腾讯课堂overload（重载）demo
 * 参数类型不同的重载
 */
public class Test3 {
    public static void main(String[] args) {
        int result = add(3,9);
        double result1=add(4.5,8);
        System.out.printf(result+"\n");
        System.out.printf(result1+"\n");
    }

    /**
     * 比较两个数值的大小
     * @param a
     * @param b
     * @return
     */
    public static int add(int a,int b){
        return a+b;
    }
   public static double add(double a, int b){
        return a+b;
   }

}
