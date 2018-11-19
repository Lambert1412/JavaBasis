package com.java.basis.objectOOP;

/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-11-19 23:54
 * <p>
 * 三元运算符练习题
 **/

public class Test2 {
    public static void main(String[] args) {
        int a = 1;
        Integer b = 2;
        boolean c = true;
        int d = c ? b : a;
        System.out.println(d);

        String str = "abc";
        StringBuilder strbu = new StringBuilder("def");
        boolean boo = true;
        CharSequence cs = boo ? str : strbu;
        System.out.println(cs);

        char ch = 'a';
        int num = 0;
        boolean bool = true;
        //这里不是 bool ? ch : num ，那样会打印两个97
        System.out.print(bool ? ch : 0);
        System.out.print(!bool ? num : ch);

        char ch1 = 'a';
        int num1 = 0 ;
        boolean bool1 = true;
        System.out.print( bool ? (char)ch : (char)0);
        System.out.print( !bool ? (int)num : (int)ch);



    }
}
