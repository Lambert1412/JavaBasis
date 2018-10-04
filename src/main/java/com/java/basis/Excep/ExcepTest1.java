package com.java.basis.Excep;

/**
 * @Author: Lambert
 * @Date: 2018/10/4 下午4:36
 * @Description:
 * finally关键字
 * finally 关键字用来创建在 try 代码块后面执行的代码块。
 * 无论是否发生异常，finally 代码块中的代码总会被执行。
 * 在 finally 代码块中，可以运行清理类型等收尾善后性质的语句。
 * finally 代码块出现在 catch 代码块最后，语法如下：
 */
public class ExcepTest1 {
    public static void main(String args[]){
        int a[] = new int[2];
        try{
            System.out.println("Access element three :" + a[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown  :" + e);
        }
        finally{
            a[0] = 6;
            System.out.println("First element value: " +a[0]);
            System.out.println("The finally statement is executed");
        }
    }
}
