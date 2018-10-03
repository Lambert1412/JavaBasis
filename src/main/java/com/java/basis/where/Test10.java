package com.java.basis.where;

/**
 * @Author: Lambert
 * @Date: 2018/10/3 下午4:03
 * @Description:
 *
 * switch case 执行时，一定会先进行匹配，
 * 匹配成功返回当前 case 的值，再根据是否有 break，判断是否继续输出，或是跳出判断。
 */
public class Test10 {
    public static void main(String args[]){
        //char grade = args[0].charAt(0);
        char grade = 'C';

        switch(grade)
        {
            case 'A' :
                System.out.println("优秀");
                break;
            case 'B' :
            case 'C' :
                System.out.println("良好");
                break;
            case 'D' :
                System.out.println("及格");
            case 'F' :
                System.out.println("你需要再努力努力");
                break;
            default :
                System.out.println("未知等级");
        }
        System.out.println("你的等级是 " + grade);
    }
}
