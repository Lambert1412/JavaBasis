package com.java.basis.VariableTypes;

/**
 * @Author: Lambert
 * @Date: 2018/10/1 下午11:24
 * @Description:
 * java静态变量
 */
public class EmployeeTest1 {
    /**
     * salary是静态的私有变量
     */
    private static double salary;
    /**
     * DEPARTMENT是一个常量
     */
    public static final String DEPARTMENT = "开发人员";
    public static void main(String[] args){
        salary = 10000;
        System.out.println(DEPARTMENT+"平均工资:"+salary);
        System.out.println(EmployeeTest1.DEPARTMENT+"平均工资:"+EmployeeTest1.salary);
    }
}
