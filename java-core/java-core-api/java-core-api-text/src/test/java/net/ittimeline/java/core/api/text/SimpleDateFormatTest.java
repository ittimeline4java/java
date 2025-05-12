package net.ittimeline.java.core.api.text;

import java.util.Date;

/**
 * SimpleDateFormat常用方法测试
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/11 19:43
 * @since Java21
 */

public class SimpleDateFormatTest {
    /**
     * @see DateUtil#format(Date)
     * @see DateUtil#parse(String)
     * @param args
     */
    public static void main(String[] args) {
        Date now = new Date();
        String nowStr = DateUtil.format(now);
        System.out.println("当前时间是"+nowStr);

        Date date = DateUtil.parse(nowStr);
        System.out.println("解析时间是"+date);

    }
}
