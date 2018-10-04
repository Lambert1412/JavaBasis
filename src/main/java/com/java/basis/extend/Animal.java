package com.java.basis.extend;

/**
 * @Author: Lambert
 * @Date: 2018/10/4 下午4:40
 * @Description:
 * 公共父类：
 */
public class Animal {
    private String name;
    private int id;

    public Animal(String myName, int id) {
        name = myName;
        id = id;

    }

    public void eat() {
        System.out.println(name + "正在吃");
    }

    public void sleep() {
        System.out.println(name + "正在睡");

    }

    public void introduction() {
        System.out.println("大家好！我是" + id + "号" + name + ".");
    }
}
