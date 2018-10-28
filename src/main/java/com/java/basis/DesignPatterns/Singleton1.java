package com.java.basis.DesignPatterns;

/**
 * @Author: Lambert
 * @Date: 2018/10/28 上午11:07
 * @Description: 单例模式（饿汉模式）
 */
public class Singleton1 {
    private static Singleton1 Singleton1;

    /**
     * 创建私有构造器
     */
    private Singleton1() {

    }

    /**
     * 提供一个共外界来获得当前类的一个实例的类方法
     * 注意：类方法所访问的类的属性一定是类属性
     */
    public static Singleton1 getInstance() {
        if (Singleton1 == null) {
            Singleton1 = new Singleton1();
        }
        return Singleton1;
    }
}


class TestSingleton1 {

    public static void main(String[] args) {

        Singleton1 s = Singleton1.getInstance();
        System.out.println(s);
        Singleton1 s1 = Singleton1.getInstance();
        System.out.println(s1);
    }
}