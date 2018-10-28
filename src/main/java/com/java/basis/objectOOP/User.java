package com.java.basis.objectOOP;

/**
 * @Author: Lambert
 * @Date: 2018/10/28 上午8:18
 * @Description:
 * static语法使用
 * 语法：public static 返回值（void） 方法名（数据类型1 变量1，数据类型2 变量2，….）{
 * 	方法体
 * 	[return 结果]
 * }
 *
 * Static修饰在方法上就是类方法。
 */
public class User {
    String username;
    String password;

    /**
     * 类属性
     */
    static int userCount;

    public void introduce() {
        System.out.printf("用户名" + username + "密码" + password);
    }
}

class TestUser {
    /**
     * 类 ：模板
     * 对象：样本
     *
     * @param args
     */
    public static void main(String[] args) {
        User user = new User();
        //把类属性做变更
        User.userCount++;
        System.out.printf("人数" + User.userCount);
    }
}