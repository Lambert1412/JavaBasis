package com.java.basis.File;

import java.io.File;

/**
 * @Author: Lambert
 * @Date: 2018/10/4 下午3:24
 * @Description:
 * 判断是文件还是目录
 */
public class DirList {
    public static void main(String[] args) {
        String dirname="/Users/lizhen/Documents";
        File f1 =new File(dirname);
        if (f1.isDirectory()){
            System.out.println("目录 " + dirname);
            String s[]=f1.list();
            for (int i = 0; i <s.length ; i++) {
                File f=new File(dirname+"/"+s[i]);
                if (f.isDirectory()){
                    System.out.println(s[i] + " 是一个目录");
                }else {
                    System.out.println(s[i] + " 是一个文件");
                }
            }
        }else {
            System.out.println(dirname + " 不是一个目录");
        }
    }
}
