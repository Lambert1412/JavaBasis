package com.java.basis.conversion;

/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-11-17 23:27
 **/

public class TestDemo {
    public static void main(String[] args) {
        //int 转换为short
        int i = 8;
        short s = (short) i;
        System.out.println(s);

        //int------>byte
        byte b = (byte) i;
        System.out.println(b);

        //long ---->byte
        long l = 120;
        byte b1 = (byte) l;
        System.out.println(b1);

        //float---->int会舍弃小数位
        //float---->long会舍弃小数位
        float c = 12.7f;
        int d = (int) c;
        long e = (long) c;
        short f = (short) c;
        byte g = (byte) c;
        double h = (double) c;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

        //double------>float
        double k = 12.4d;
        float m = (float) k;
        System.out.println(m);

        char a1 = 'a';
        int a2 = (int) a1;
        System.out.println(a2);

    }
}
