package com.java.basis.objectOOP;

/**
 * @Author: Lambert
 * @Date: 2018/10/22 下午10:36
 * @Description: 腾讯课堂
 * 对象创建
 *  局部变量:
 * 1、局变量是定义在方法中或语句块中
 * 2、作用范围：只限于所定义的大括号。
 * 3、存储的位置：存储在栈内存中。
 * 4、默认值：无，局部变量必须赋值。
 * 5、生命周期：所属的大括号结束就消失。
 *
 * 成员变量：
 * 1、成员变量是定义在类中，也可以叫类的属性。
 * 2、作用范围：在整个类
 * 3、存储位置：堆内存
 * 4、默认值：有
 * 5、生命周期：由jvm通过垃圾回收机制来自动回收。
 */
public class Dog {
    /**
     * 属性
     */
    /**
     * 颜色
     */
    String color;
    /**
     * 重量
     */
    double weight;
    /**
     * 身高
     */
    double height;

    /**
     * 行为方法
     */
    public void protectHome() {
        System.out.println("狗正在看家");
    }

    public void sleep() {
        System.out.println("狗正在睡觉");
    }

}

class TestDog {
    public static void main(String[] args) {
        /**
         * 创建对象
         */
        Dog dog = new Dog();
        /**
         * 颜色赋值
         */
        dog.color = "黄色";
        /**
         * 体重赋值
         */
        dog.weight = 20.0;
        /**
         * 身高赋值
         */
        dog.height = 0.5;
        /**
         * 打印身高体重
         */
        System.out.println("狗的颜色是：" + dog.color + "狗的体重是:" + dog.weight + "狗的身高是：" + dog.height + "\t");

        /**
         * 多个对象
         */
        Dog dog1 = new Dog();
        dog1.color = "黑色";
        System.out.println(dog1.color);
        /**
         * 方法调用
         */
        dog.protectHome();

    }
}
