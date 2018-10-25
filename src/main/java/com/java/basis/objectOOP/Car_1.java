package com.java.basis.objectOOP;

/**
 * @Author: Lambert
 * @Date: 2018/10/25 上午8:47
 * @Description:
 *
 * this关键字
 * 在每一个方法中都包含一个this关键字，代表调用当前调用方法的对象的自身。
 * This在set方法中可以区分同名的变量，加this是成员变量，没有this就是局部变量。
 */
public class Car_1 {
    String color;
    int carNo;

    String name;

    public void run() {
//        System.out.println(name + "车在跑");
        System.out.println("run-----"+this);
    }

    /**
     * 介绍
     */
    public void introduce() {
        System.out.println("我是一辆" + color + "车牌是" + carNo + name + "车");
    }
}

class TestCar_1 {
    public static void main(String[] args) {
        Car_1 car1 =new Car_1();
        /**
         * 打印对象
         */
        System.out.println("main------"+car1);
        //调用run方法
        car1.run();

    }
}