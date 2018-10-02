package com.java.basis.operator;

/**
 * @Author: Lambert
 * @Date: 2018/10/2 下午2:26
 * @Description:
 * 前缀自增自减法(++a,--a): 先进行自增或者自减运算，再进行表达式运算。
 *
 * 后缀自增自减法(a++,a--): 先进行表达式运算，再进行自增或者自减运算 实例：
 */
public class selfAddMinusTest {
    public static void main(String[] args){
        //定义一个变量；
        int a = 5;
        int b = 5;
        int x = 2*++a;
        int y = 2*b++;
        System.out.println("自增运算符前缀运算后a="+a+",x="+x);
        System.out.println("自增运算符后缀运算后b="+b+",y="+y);
    }
}
