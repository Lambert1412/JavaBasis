package com.java.basis.Data;

import java.util.Date;

/**
 * @Author: Lambert
 * @Date: 2018/10/3 下午6:23
 * @Description:
 * printf 方法可以很轻松地格式化时间和日期。使用两个字母格式，它以 %t 开头并且以下面表格中的一个字母结尾。
 * c :包括全部日期和时间信息
 * F :"年-月-日"格式
 * D :"月/日/年"格式
 * r :"HH:MM:SS PM"格式（12时制）
 * T :"HH:MM:SS"格式（24时制）
 * R :"HH:MM"格式（24时制)
 */
public class DateDemo3 {
    public static void main(String[] args) {
        // 初始化 Date 对象
        Date date =new Date();

        //c的使用
        System.out.printf("全部日期和时间信息：%tc%n",date);
        //f的使用
        System.out.printf("年-月-日格式：%tF%n",date);
        //d的使用
        System.out.printf("月/日/年格式：%tD%n",date);
        //r的使用
        System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n",date);
        //t的使用
        System.out.printf("HH:MM:SS格式（24时制）：%tT%n",date);
        //R的使用
        System.out.printf("HH:MM格式（24时制）：%tR",date);

    }
}
