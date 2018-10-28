package com.java.basis.objectOOP;

/**
 * @Author: Lambert
 * @Date: 2018/10/28 上午8:45
 * @Description: static关键字修饰方法
 */
public class Teacher {
    String name;
    int age;
    String lession;

    /**
     * 对象方法：每一个老师实力都可以使用
     */
    public void teach() {
        System.out.printf(this.name + "老师在教课");
    }

    /**
     * 类方法
     */
    public static void sleep() {
        System.out.printf("老师在睡觉");
    }
}

class TestTeacher {
    public static void main(String[] args) {
        //使用类名调用类方法（推荐使用）
        Teacher.sleep();
        System.out.printf("\n" + "-----------------" + "\n");
        //不建议使用
        Teacher teacher = new Teacher();
        teacher.name="小明";
        teacher.teach();
    }
}