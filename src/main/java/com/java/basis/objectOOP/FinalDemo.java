package com.java.basis.objectOOP;


/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-10-28 15:34
 * final 使用
 * 修饰在方法上将不能被重写
 **/


 class User1 {
    int username;
    int password;

    public final void login(int username, int password) {
        if (username == 123 && password == 123) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }
    }

}

class Emp extends User1 {
    int empNo;
/**
 * 加上final 就不能被冲写了
 */
//    public void login(int username, int password) {
//        System.out.println("登录成功");
//    }
}

public class FinalDemo {
    public static void main(String[] args) {
        Emp e = new Emp();
        e.login(1, 1);
    }
}
