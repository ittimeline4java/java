package net.ittimeline.java.core.api.util;

import java.util.Date;
import java.util.Random;

/**
 * Date常用方法测试
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/11 19:00
 * @since Java21
 */
public class DateTest {
    /**
     * @see Date#getTime()
     * @see Date#setTime(long)
     * @see Random#nextInt()
     * @see Random#nextInt(int) 
     * @param args
     */
    public static void main(String[] args) {

        //需求1:打印时间原点开始一年之后的时间
        Date afterYear =new Date();
        //一年之后的时间毫秒值
        long time=1000L*3600L*24L*365L;
        afterYear.setTime(time);
        System.out.println(afterYear);

        //需求2：定义任意两个Date对象，比较一下大小
        Random random =new Random();
        Date date1 =new Date(Math.abs(random.nextInt()));
        System.out.println("date1 = " + date1);
        Date date2 =new Date(Math.abs(random.nextInt()));
        System.out.println("date2 = " + date2);

        if (date1.getTime() > date2.getTime())
            System.out.println("date1 > date2");
        else if (date1.getTime() < date2.getTime())
            System.out.println("date1 < date2");
        else
            System.out.println("date1 = date2");
    }
}
