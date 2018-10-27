package com.java.basis.objectOOP;

/**
 * @Author: Lambert
 * @Date: 2018/10/23 上午8:59
 * @Description: 封装用法
 */
public class Student1 {
    /**
     * 姓名
     */
    private String name;
    /**
     * 性别
     */
    private char gender;
    /**
     * 年龄
     */
    private int age;

    /**
     * 通过public私有方法属性值赋值
     *
     * @param name
     */
    // this后的name是属性
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 通过get方法获取值
     *
     * @return
     */
    public String getName() {
        return this.name;
    }

    public char getGender() {
        return this.gender;
    }

    public int getAge() {
        return this.age;
    }

    public void study() {
        System.out.println(name + "在学习");
    }

    /**
     * 介绍方法
     */
    public void introduce() {
        System.out.println("我叫" + name + "性别" + gender + "年龄" + age);
    }
}

class TestStu1 {
    /**
     * public公共的所有类都能访问
     *
     * @param args
     */
    public static void main(String[] args) {
        Student1 student1 = new Student1();
        student1.setName("张三");
        student1.setAge(1);
        student1.setGender('男');

        student1.introduce();

        String name = student1.getName();
        char gender = student1.getGender();
        int age = student1.getAge();
        System.out.println("名字" + name);
        System.out.println("性别" + gender);
        System.out.println("年龄" + age);

    }
}
