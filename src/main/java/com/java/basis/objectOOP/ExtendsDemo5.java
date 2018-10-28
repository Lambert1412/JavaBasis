package com.java.basis.objectOOP;

/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-10-28 15:14
 **/
class Teacher3 {
    String name = "张三";
    int age;

    public void sleep() {
        System.out.println("老师在睡觉");
    }
}

/**
 * 子类定义
 */
class JavaTeacher3 extends Teacher3 {
    String name = "李四";

    public void teachJava() {
        System.out.println(this.name + "老师正在教java" + "年龄" + age);
        System.out.println(super.name + "老师正在教java" + "年龄" + age);
        super.sleep();
    }
}

public class ExtendsDemo5 {
    public static void main(String[] args) {
        JavaTeacher3 javaTeacher3 = new JavaTeacher3();
        javaTeacher3.teachJava();
        javaTeacher3.sleep();
    }
}
