package com.java.basis.objectOOP;

/**
 * @Author: Lambert
 * @Date: 2018/10/22 下午11:19
 * @Description: 匿名对象
 */
class Car {
    /**
     * 定义颜色
     */
    String color;

    double displacement;

    String brand;

    public void run() {
        System.out.println(brand + "车在跑");
    }

    public void introduce() {
        System.out.println("我是一款" + brand + "的排量是" + displacement + "L" + color + "的车");
    }
}

class TestCar {

    public static void main(String[] args) {
        /**
         * 在堆内存中创建了一个car的对象，但是在栈内存中没有变量引用他。
         */
        new Car().brand = "兰博基尼";
        /**
         * 又在内存中创建了一个匿名对象;
         */
        new Car().color = "黄色";
        new Car().introduce();
    }

}
