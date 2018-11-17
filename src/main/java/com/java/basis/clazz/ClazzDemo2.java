package com.java.basis.clazz;

/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-11-17 17:13
 *
 * int是基本数据类型，Integer 是包装类，包装类提供了对整数的操作方法，int和Integer直接可以自动的装箱和拆箱
 *  int的默认值是0
 *  Integer的默认值是null
 **/

public class ClazzDemo2 {
    public static void main(String[] args) {
        Person person =new Person();
        System.out.println(person.getId());
        System.out.println(person.getAge());

        //Integer使用前要判断是否为空
//        Integer i=person.getAge()+10;
    }
}
