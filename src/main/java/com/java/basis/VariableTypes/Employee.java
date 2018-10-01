package com.java.basis.VariableTypes;

/**
 * @Author: Lambert
 * @Date: 2018/10/1 下午11:06
 * @Description:
 * java 变量类型
 */
public class Employee {
    /**
     * 这个实例变量对子类可见
     */
    public String name;
    /**
     * 私有变量，仅在该类可见
     */
    private double salary;

    /**
     * 在构造器中对name赋值
     *
     * @param empName
     */
    public Employee(String empName) {
        name = empName;
    }

    /**
     * 设定salary的值
     *
     * @param empSal
     */
    public void setSalary(double empSal) {
        salary = empSal;
    }

    /**
     * 打印信息
     */
    public void printEmp() {
        System.out.println("名字 : " + name);
        System.out.println("薪水 : " + salary);
    }

    public static void main(String[] args) {
        Employee empOne = new Employee("Lambert");
        empOne.setSalary(99000f);
        empOne.printEmp();
    }
}
