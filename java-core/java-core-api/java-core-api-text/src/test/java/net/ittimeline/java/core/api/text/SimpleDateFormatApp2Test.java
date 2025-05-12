package net.ittimeline.java.core.api.text;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SimpleDateFormat案例2：秒杀活动
 * 需求：秒杀开始时间：2024年11月11日 0:00:00   秒杀结束时间：2024年11月11日 0:10:0
 *      小刘下单并付款的时间为：2024年11月11日 0:01:00
 *      小张下单并付款的时间为：2024年11月11日 0:11:0
 *      编程实现：这两位哥们有没有参加上秒杀活动
 * 分析：略
 * @author tony 18601767221@163.com
 * @version 2025/5/11 20:09
 * @since Java21
 */
public class SimpleDateFormatApp2Test {
    public static void main(String[] args) throws ParseException {
        // 秒杀开始时间、结束时间
        String startTimeStr = "2024年11月11日 0:0:0";
        String endTimeStr = "2024年11月11日 00:10:0";


        // 秒杀开始时间、结束时间的解析成Date对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        Date startTime = simpleDateFormat.parse(startTimeStr);
        Date endTime = simpleDateFormat.parse(endTimeStr);


        // 小刘下单并付款的时间
        String xiaoLiuDateStr = "2024年11月11日 0:01:00";
        // 小刘下单并付款的时间格式化
        Date xiaoLiuDate = simpleDateFormat.parse(xiaoLiuDateStr);

        // 小张下单并付款的时间
        String xiaoZhangDateStr = "2024年11月11日 00:11:0";

        // 小张下单并付款的时间格式化
        Date xiaoZhangDate = simpleDateFormat.parse(xiaoZhangDateStr);


        // 判断小刘是否参加秒杀活动
        if (xiaoLiuDate.getTime() >= startTime.getTime() && xiaoLiuDate.getTime() <= endTime.getTime()) {
            System.out.println("小刘参加了秒杀活动");
        } else {
            System.out.println("小刘没有参加秒杀活动");
        }

        // 判断小张是否参加秒杀活动
        if (xiaoZhangDate.getTime() >= startTime.getTime() && xiaoZhangDate.getTime() <= endTime.getTime()) {
            System.out.println("小张参加了秒杀活动");
        } else {
            System.out.println("小张没有参加秒杀活动");
        }
    }
}
