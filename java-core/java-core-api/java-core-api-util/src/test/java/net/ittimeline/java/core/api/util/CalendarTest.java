package net.ittimeline.java.core.api.util;

import java.util.Calendar;
import java.util.Date;

/**
 * Calendar常用方法测试
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/11 20:38
 * @since Java21
 */
public class CalendarTest {
    /**
     * @param args
     * @see Calendar#getInstance()
     * @see Calendar#getTime()
     * @see Calendar#setTime(Date)
     * @see Calendar#getTimeInMillis()
     * @see Calendar#setTimeInMillis(long)
     * @see Calendar#get(int)
     * @see Calendar#set(int, int)
     * @see Calendar#add(int, int)
     */
    public static void main(String[] args) {
        //1.获取日历对象
        //Calendar是一个抽象类，不能直接实例化，需要通过getInstance()方法获取实例
        //会根据系统的不同时区来获取不同的日历对象
        //会把时间中的纪元、年、月、日、时、分、秒等都放到一个数组中

        Calendar calendar = Calendar.getInstance();
        System.out.println("当前时间日历信息：" + calendar);

        //2.修改日历代表的时间
        // 月份：0-11 ，如果获取出来的是0，表示1月，以此类推
        // 星期：在老外的眼里，星期日是一周中的第一天，1（星期日）、2（星期一）、3（星期二）...
        Date start = new Date(0L);
        calendar.setTime(start);
        System.out.println("设置指定时间后：" );

        //3.获取日历代表的时间
        // 0： 纪元
        // 1： 年
        // 2： 月
        // 3： 一年中的第几周
        // 4： 一个月中的第几周
        // 5： 一个月中的第几天（日期）
        // ...
        int year = calendar.get(1);
        // 月份是从0开始的，所以要+1
        int month = calendar.get(2) + 1;
        int day = calendar.get(5);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println("年份：" + year + "，月份：" + (month) + "，日期：" + day + "，星期：" + getWeek(dayOfWeek));


        //4.修改日历代表的时间
        calendar.set(Calendar.YEAR, 2025);
        calendar.set(Calendar.MONTH, 7);
        calendar.set(Calendar.DAY_OF_MONTH, 8);
        System.out.println("修改之后：");
        displayCalendar(calendar);

        //5.给日历代表的时间增加或减少时间
        calendar.add(Calendar.MONTH, 2);
        System.out.println("添加月份后：");
        displayCalendar(calendar);

    }

    /**
     * 星期数组，用来获取星期的名称
     */
    private static final String[] WEEK_DAYS = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};

    /**
     * 获取星期的名称
     *
     * @param dayOfWeek
     * @return
     */
    public static String getWeek(int dayOfWeek) {
        // 返回WEEK_DAYS数组中对应的星期名称
        return WEEK_DAYS[dayOfWeek - 1];
    }

    /**
     * 显示日历信息
     * @param calendar
     */
    public static void displayCalendar(Calendar calendar) {
        int year = calendar.get(Calendar.YEAR);
        // 月份是从0开始的，所以要+1
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println("年份：" + year + "，月份：" + (month) + "，日期：" + day + "，星期：" + getWeek(dayOfWeek));
    }
}
