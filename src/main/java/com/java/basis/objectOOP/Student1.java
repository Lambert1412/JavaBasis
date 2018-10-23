package com.java.basis.objectOOP;

/**
 * @Author: Lambert
 * @Date: 2018/10/23 上午8:59
 * @Description:
 */
public class Student1 {
    /**
     * 姓名
     */
    private String name;
    /**
     * 性别
     */
    char gender;
    /**
     * 年龄
     */
    int age;

    public void setName(String a) {
        name = a;
    }


    public void study() {
        System.out.println(name + "在学习");
    }

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
    }
}
