package com.java.basis.DesignPatterns;

/**
 * @Author: Lambert
 * @Date: 2018/10/28 上午11:07
 * @Description:
 * 单例模式（懒汉模式）
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    /**
     * 创建私有构造器
     */
    private Singleton() {

    }

    /**
     * 提供一个共外界来获得当前类的一个实例的类方法
     * 注意：类方法所访问的类的属性一定是类属性
     */
    public static Singleton getInstance() {
        return singleton;
    }
}


class TestSingleton {

    public static void main(String[] args) {

        Singleton s = Singleton.getInstance();
        System.out.println(s);
        Singleton s1 = Singleton.getInstance();
        System.out.println(s1);
    }
}
