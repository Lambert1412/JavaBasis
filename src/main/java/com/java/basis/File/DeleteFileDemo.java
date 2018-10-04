package com.java.basis.File;

import java.io.File;

/**
 * @Author: Lambert
 * @Date: 2018/10/4 下午3:34
 * @Description:
 * 删除目录
 */
public class DeleteFileDemo {
    public static void main(String args[]) {
        File folder = new File("/Users/lizhen/Documents/bin/");
        deleteFolder(folder);
    }

    // 删除文件及目录
    public static void deleteFolder(File folder) {
        File[] files = folder.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    deleteFolder(f);
                } else {
                    f.delete();
                }
            }
        }
        folder.delete();
    }
}
