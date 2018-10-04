package com.java.basis.Excep;

/**
 * @Author: Lambert
 * @Date: 2018/10/4 下午4:23
 * @Description:
 *
 * 用非法索引访问数组时抛出的异常。如果索引为负或大于等于数组大小，则该索引为非法索引。
 */
public class ExcepTest {
    public static void main(String[] args) {
        try {
            int a[]=new int[2];
            System.out.println("Access element three :" + a[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown  :" + e);
        }
        System.out.println("Out of the block");
    }
}
