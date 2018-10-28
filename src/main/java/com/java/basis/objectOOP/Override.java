package com.java.basis.objectOOP;

/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-10-28 15:14
 **/
class Teacher4 {
    String name = "张三";
    int age;

    public void sleep() {
        System.out.println("老师在睡觉");
    }
}

/**
 * 子类定义
 */
class JavaTeacher4 extends Teacher4 {
    String name = "李四";

    public void teachJava() {
        System.out.println(this.name + "老师正在教java" + "年龄" + age);
        System.out.println(super.name + "老师正在教java" + "年龄" + age);
        super.sleep();
    }
}

public class Override {
    public static void main(String[] args) {
        JavaTeacher3 javaTeacher3 = new JavaTeacher3();
        javaTeacher3.sleep();
    }
}
