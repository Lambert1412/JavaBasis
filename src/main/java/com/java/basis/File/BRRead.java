package com.java.basis.File;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: Lambert
 * @Date: 2018/10/4 下午2:26
 * @Description:
 * 控制台打印字符解析
 */
public class BRRead {
    public static void main(String[] args) throws IOException {
        char c;
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符, 按下 'q' 键退出。");
        do {
            c=(char) br.read();
            System.out.println(c);
        }while (c !='q');
    }
}
