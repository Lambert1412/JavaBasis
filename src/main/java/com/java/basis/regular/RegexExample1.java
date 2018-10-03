package com.java.basis.regular;

import java.util.regex.Pattern;

/**
 * @Author: Lambert
 * @Date: 2018/10/3 下午7:00
 * @Description:
 * Pattern 类：
 * pattern 对象是一个正则表达式的编译表示。
 * Pattern 类没有公共构造方法。要创建一个 Pattern 对象，你必须首先调用其公共静态编译方法，它返回一个 Pattern 对象。该方法接受一个正则表达式作为它的第一个参数。
 */
public class RegexExample1 {
    public static void main(String[] args) {
        String content="I am noob"+ "from runoob.com.";
        String pattern=".*runoob.*";
        boolean isMatch = Pattern.matches(pattern,content);
        System.out.println("字符串中是否包含了 'runoob' 子字符串? "+isMatch);
    }
}
