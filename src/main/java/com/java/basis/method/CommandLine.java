package com.java.basis.method;

/**
 * @Author: Lambert
 * @Date: 2018/10/4 下午1:42
 * @Description:
 * 命令行参数的使用
 * javac CommandLine.java
 * java CommandLine this is a command line 200 -100
 */
public class CommandLine {
    public static void main(String args[]){
        for(int i=0; i<args.length; i++){
            System.out.println("args[" + i + "]: " + args[i]);
        }
    }
}
