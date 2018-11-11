package com.java.basis.StringDemo;


/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-11-11 14:13
 * 字符串处理:替换，去掉空格、在给定索引倒叙查找第二个索引
 **/

public class StringDemo13 {
    public static void main(String[] args) {
//        字符串中的单个字符替换
        String str = "3000-3999-uuu-huu-ghdfsh";
        String str1 = str.replaceAll("-", "|");
        System.out.println(str1);
//        字符串中的子字符串替换
        String str2 = str.replace("999", "888");
        System.out.println(str2);

        //trim 去掉空格
        String str3 = "    jhfaaabbbaaawe   ";
        String str4 = str3.trim();
        System.out.println("--" + str4 + "--");
//       从后面开始查找第一次出现的w
        int index = str3.lastIndexOf("w");
        System.out.println(index);
//在给定索引倒叙查找第二个索引
        int index1 = str3.indexOf('a', 2);
        System.out.println(index1);
    }
}
