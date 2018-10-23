package com.java.basis.objectOOP;

/**
 * @Author: Lambert
 * @Date: 2018/10/23 上午8:35
 * @Description:
 * java语言封装是针对属性
 * 关键字private
 * 封装上了就不允许使用
 */
public class Test1 {
    String test1;
    private  int test2;
    double test3;
    boolean test4;
    long test5;

}

class Test2{
    public static void main(String[] args) {
        Test1 test1 =new Test1();
        test1.test1="我长得帅";
        test1.test2=1;
        System.out.println(test1.test1);
    }
}
