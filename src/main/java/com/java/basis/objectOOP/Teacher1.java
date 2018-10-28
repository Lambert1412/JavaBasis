package com.java.basis.objectOOP;

/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-10-28 14:26
 * <p>
 * super 使用
 * Super的特点
 **/

/**
 * 父类
 */
public class Teacher1 {
    String name;
    int age;

    public Teacher1() {
        System.out.println("父类被调用");
    }

    public Teacher1(String name) {

    }

    public void sleep() {
        System.out.println("老师在睡觉");
    }
}

/**
 * 子类定义
 * class 子类 extends 父类
 */
class JavaTeacher extends Teacher1 {
    public JavaTeacher() {
        //在子类的构造器中隐藏了调用super
        super();
        System.out.println("子类构造器被调用");
    }

    public void teachJava() {
        System.out.println(name + "老师正在教java" + "年龄：" + age);
    }
}

class ExtendsDemo4 {
    public static void main(String[] args) {
        JavaTeacher javaTeacher = new JavaTeacher();

    }
}