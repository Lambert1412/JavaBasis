package com.java.basis.operator;

/**
 * @Author: Lambert
 * @Date: 2018/10/2 下午3:00
 * @Description:
 * 短路逻辑运算符
 * 当使用与逻辑运算符时，在两个操作数都为true时，结果才为true，
 * 但是当得到第一个操作为false时，其结果就必定是false，这时候就不会再判断第二个操作了。
 */
public class LuoJi {
    public static void main(String[] args){
        //定义一个变量；
        int a = 5;
        boolean b = (a<4)&&(a++<10);
        System.out.println("使用短路逻辑运算符的结果为"+b);
        System.out.println("a的结果为"+a);
    }
}
