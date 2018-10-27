package com.java.basis.objectOOP;

/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-10-27 21:31
 * <p>
 * 构造器
 **/

public class Person {
    String name;
    int age;
    char gender;

    /**
     * 构造器的特点：
     * 1、方法名和类名一致；
     * 2、方法没有返回值没有void；
     * 3、参数可有可无；
     * 4、如果类中没有参数的构造器，可有使用隐藏的默认构造器来创造对象
     *
     * @param name
     */

    /**
     * 有参构造器
     *
     * @param name
     */
    public Person(String name) {
        System.out.println("一个人被创建");
        this.name = name;
    }

    /**
     * 两个方法一样说明方法重载
     *
     * @param name
     * @param age
     */
    public Person(String name, int age) {
//        this.name = name;
        this(name);
        this.age = age;
    }

    public Person(String name, int age, char gender) {
//        this.name = name;
//        this.age = age;
        //调用两个参数的构造器
        this(name, age);
        this.gender = gender;
    }

    /**
     * 无参构造器
     */
    public Person() {
    }

    public void introuce() {
        System.out.println("我是" + name + "年龄" + age + "性别" + gender);
    }
}

class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("张三");
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println("----------------------------");
        System.out.println("第二个构造器使用");
        Person person1 = new Person("李四", 23);
        System.out.println(person1.name);
        System.out.println(person1.age);

    }
}
