package net.ittimeline.java.core.api.text;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期工具类
 * 支持日期和日期字符串按照指定格式相互转换
 * @author tony 18601767221@163.com
 * @version 2025/5/11 19:41
 * @since Java21
 */
public class DateUtil {
    /**
     * 日期格式化字符串
     */

    private static final String DATE_FORMAT = "yyyy-MM-dd";
    /**
     * 日期时间格式化字符串
     */
    private static final String DATETIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

    /**
     * 按照指定日期时间格式 格式化日期
     * @param date 日期
     * @return 格式化后的日期字符串
     * @see java.text.DateFormat#format(java.util.Date)
     */
    public static String format(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat(DATETIME_FORMAT);
        return sdf.format(date);
    }


    /**
     * 将日期字符串转换为Date对象
     * @param dateStr 日期字符串
     * @return 解析后的日期对象
     * @see java.text.DateFormat#parse(java.lang.String)
     */
    public static Date parse(String dateStr) {
        // 创建一个SimpleDateFormat对象，用于解析日期字符串
        SimpleDateFormat sdf = new SimpleDateFormat(DATETIME_FORMAT);
        Date date = null;
        try {
            // 尝试解析传入的日期字符串
            date = sdf.parse(dateStr);
        } catch (ParseException e) {
            // 如果解析过程中出现异常，则抛出运行时异常
            throw new RuntimeException(e);
        }
        // 返回解析后的日期对象
        return date;
    }


}
