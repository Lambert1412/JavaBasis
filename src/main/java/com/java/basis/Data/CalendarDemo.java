package com.java.basis.Data;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @program: basis
 * @description:
 * @author: Mr.LI
 * @create: 2018-11-17 20:21
 *
 * 日历库使用
 **/

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        /**
         * java.util.GregorianCalendar[time=1542458226938,
         * areFieldsSet=true,
         * areAllFieldsSet=true,
         * lenient=true,
         * zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",
         * offset=28800000,
         * dstSavings=0,
         * useDaylight=false,
         * transitions=19,
         * lastRule=null],
         * firstDayOfWeek=1,
         * minimalDaysInFirstWeek=1,
         * ERA=1,YEAR=2018,
         * MONTH=10,
         * WEEK_OF_YEAR=46,
         * WEEK_OF_MONTH=3,
         * DAY_OF_MONTH=17,
         * DAY_OF_YEAR=321,
         * DAY_OF_WEEK=7,
         * DAY_OF_WEEK_IN_MONTH=3,
         * AM_PM=1,HOUR=8,
         * HOUR_OF_DAY=20,
         * MINUTE=37,
         * SECOND=6,
         * MILLISECOND=938,
         * ZONE_OFFSET=28800000,
         * DST_OFFSET=0]
         */
        System.out.println(calendar);
        //获得年
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);
        int month = calendar.get(Calendar.MONDAY) + 1;
        System.out.println(month);
        //获得日
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
        //获得小时
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        System.out.println(hour);
        int minute = calendar.get(Calendar.MINUTE);
        System.out.println(minute);
        int second = calendar.get(Calendar.SECOND);
        System.out.println(second);
        int millisecond = calendar.get(Calendar.MILLISECOND);
        System.out.println(millisecond);
        System.out.println(year + "年" + month + "月" + day + "日" + hour + "小时" + minute + "分" + second + "秒" + millisecond + "毫秒");


        //设置时间
        calendar.set(Calendar.YEAR, 2018);
        calendar.set(Calendar.MONDAY, 12);
        calendar.set(Calendar.DAY_OF_MONTH, 12);
        calendar.set(Calendar.HOUR_OF_DAY, 12);
        calendar.set(Calendar.MINUTE, 12);
        calendar.set(Calendar.SECOND, 12);
        calendar.set(Calendar.MILLISECOND, 12);
        System.out.println(calendar);

        //获得日历相关的毫秒数
        long tm = calendar.getTimeInMillis();
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        String str = simpleDateFormat.format(date);
        System.out.println(date);
        System.out.println(str);
    }
}
