package com.java.basis.objectOOP;

/**
 * @Author: Lambert
 * @Date: 2018/10/23 上午8:44
 * @Description: private 封装
 * 使用private关键字完成属性私有化，这种属性只有本类能访问。
 */
public class Student {
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


    public void study() {
        System.out.println(name + "在学习");
    }

    public void introduce() {
        System.out.println("我叫" + name + "性别" + gender + "年龄" + age);
    }
}

class TestStu {
    /**
     * public公共的所有类都能访问
     * @param args
     */
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "我叫张三";
    }
}
