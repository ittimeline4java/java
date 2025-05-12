package net.ittimeline.java.core.api.text;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SimpleDateFormat案例1: 日期字符串与Date对象转换
 * 需求：假设你初恋的出生日期为 2000-11-11，请用字符串表示这个日期，并将日期转换为2000年11月11日
 * 分析：略
 * @author tony 18601767221@163.com
 * @version 2025/5/11 19:57
 * @since Java21
 */
public class SimpleDateFormatApp1Test {
    public static void main(String[] args) throws ParseException {
        //第一步：将字符串转换为Date对象
        String dateStr = "2000-11-11";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday = simpleDateFormat1.parse(dateStr);

        //第二步：将Date对象转换为字符串
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy年MM月dd日");
        String dateFormat = simpleDateFormat2.format(birthday);
        System.out.println("你初恋的出生年月"+dateFormat);

    }
}
