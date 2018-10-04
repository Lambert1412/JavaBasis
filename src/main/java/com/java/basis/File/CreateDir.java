package com.java.basis.File;

import java.io.File;

/**
 * @Author: Lambert
 * @Date: 2018/10/4 下午3:15
 * @Description:
 * 创建目录
 */
public class CreateDir {
    public static void main(String[] args) {
        String dirname="/Users/lizhen/Documents/bin";
        File d =new File(dirname);
        //创建目录
//        d.mkdir();
        System.out.println(d.mkdir());
     }
}
