package com.java.basis.regular;

/**
 * @Author: Lambert
 * @Date: 2018/10/3 下午7:37
 * @Description:
 * 下面是一个对单词 "cat" 出现在输入字符串中出现次数进行计数的例子：
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches1
{
    private static final String REGEX = "\\bcat\\b";
    private static final String INPUT =
            "cat cat cat cattie cat";

    public static void main( String args[] ){
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT); // 获取 matcher 对象
        int count = 0;

        while(m.find()) {
            count++;
            System.out.println("Match number "+count);
            System.out.println("start(): "+m.start());
            System.out.println("end(): "+m.end());
        }
    }
}
