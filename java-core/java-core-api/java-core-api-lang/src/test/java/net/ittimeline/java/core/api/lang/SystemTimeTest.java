package net.ittimeline.java.core.api.lang;

import java.util.concurrent.TimeUnit;

/**
 * system获取时间和计时方法测试
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/9 9:39
 * @since Java21
 */
public class SystemTimeTest {
    /**
     *
     * @param args
     * @see System#currentTimeMillis() 返回当前时间的毫秒数（从 1970 年 1 月 1 日 UTC 开始计算），常用于计算程序执行时间、生成时间戳等。
     * @see System#nanoTime() 返回当前时间的纳秒数，用于高精度计时。
     */
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        // 模拟耗时操作
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long endTime = System.currentTimeMillis();
        long time = endTime - startTime;
        System.out.println("程序耗时: " + time + " 毫秒");

    }
}
