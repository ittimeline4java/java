package net.ittimeline.java.core.api.util;

import java.util.Date;

/**
 * Date构造方法测试
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/11 18:02
 * @since Java21
 */
public class DateConstructorTest {
    /**
     * @see Date#Date()
     * @see Date#Date(long date)
     * @param args
     */
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println("now = " + now);

        Date currentTimeMillis =new Date(System.currentTimeMillis());
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        Date startTime=new Date(0L);
        System.out.println("startTime = " + startTime);
        /*
            startTime = Thu Jan 01 08:00:00 CST 1970

            注意：中国位于东八区，需要在标准时间基础上加8个小时
         */
    }
}
