package com.java.basis.VariableTypes;

/**
 * @Author: Lambert
 * @Date: 2018/10/1 下午10:57
 * @Description: java局部变量1
 * 局部变量声明在方法、构造方法或者语句块中；
 * 在以下实例中age是一个局部变量。定义在pupAge()方法中，它的作用域就限制在这个方法中。
 */
public class VariableTest {
    public void pupAge() {
        int age = 0;
        age = age + 7;
        System.out.println("小狗的年龄是: " + age);
    }

    public static void main(String[] args) {
        VariableTest variableTest = new VariableTest();
        variableTest.pupAge();
    }
}
