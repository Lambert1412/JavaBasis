package com.java.basis.modifier;

/**
 * @Author: Lambert
 * @Date: 2018/10/1 下午11:41
 * @Description:
 * 私有访问修饰符-private
 *
 * 私有访问修饰符是最严格的访问级别，所以被声明为 private 的方法、变量和构造方法只能被所属类访问，并且类和接口不能声明为 private。
 * 声明为私有访问类型的变量只能通过类中公共的 getter 方法被外部类访问。
 * Private 访问修饰符的使用主要用来隐藏类的实现细节和保护类的数据。
 */
public class Logger {
    private String format;
    public String getFormat() {
        return this.format;
    }
    public void setFormat(String format) {
        this.format = format;
    }
}
