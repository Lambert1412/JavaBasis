package com.java.basis.Override;

/**
 * @Author: Lambert
 * @Date: 2018/10/4 下午5:25
 * @Description:
 *
 * Super关键字的使用
 */

class Animal1{
    public void move(){
        System.out.println("动物可以移动");
    }
}

class Dog1 extends Animal1{
    public void move(){
        // 应用super类的方法
        super.move();
        System.out.println("狗可以跑和走");
    }
}

public class TestDog1 {
    public static void main(String[] args) {

        // Dog 对象
        Animal1 b =new Dog1();
        //执行 Dog类的方法
        b.move();
    }
}
