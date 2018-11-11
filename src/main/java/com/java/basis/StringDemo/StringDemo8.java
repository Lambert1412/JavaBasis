package com.java.basis.StringDemo;


/**
 * @program: basis
 * @description: 对比字符串
 * @author: Mr.LI
 * @create: 2018-11-11 14:13
 **/

public class StringDemo8 {
    public static void main(String[] args) {
        String str = "Helloworlld";
        //从指定索引出查找第一次出现的字符串的索引,包含开始索引本身；
        int index = str.indexOf("l", 5);
        System.out.println(index);
//        获得子字符串,包括索引本身后面的所有字符串
        String str1 = str.substring(4);
        System.out.println(str1);
        //根据开始和结束索引获得子字符串截取，包括开始索引不包括结束索引；
        String str2 = str.substring(2, 5);
        System.out.println(str2);
        //获得字符串对应的字节数组
        byte[] bs = str.getBytes();
        for (int i = 0; i < bs.length; i++) {
            System.out.println(bs[i] + "\t");
        }
        //把字符串转换成字符数组
        char[] cs = str.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            System.out.println(cs[i] + "\t");
        }
        //把布尔类型转换成字符串类型
        String str3 = String.valueOf(true);
        System.out.println(str3);
        //布尔类型
        char[] c = {'1', '2', 'g', 'h'};
        String cArray = String.valueOf(c);
        System.out.println(cArray);

        //把字符串转换成大写
        String str5="qwerertrtyuukiujhghgfgfsdsadsdsda";
        System.out.println(str5.toUpperCase());

        //把字符串转换成小写
        String str6="DFJRHFSFHSDJFDJFDJHFJDFJ";
        System.out.println(str6.toLowerCase());

        //拼接字符串
        System.out.println(str5.concat(str6));
        System.out.println(str5+str6);

    }
}
