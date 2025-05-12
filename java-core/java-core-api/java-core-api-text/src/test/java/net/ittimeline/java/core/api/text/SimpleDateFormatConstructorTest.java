package net.ittimeline.java.core.api.text;

import java.text.SimpleDateFormat;

/**
 * SimpleDateFormat构造方法测试
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/11 19:32
 * @since Java21
 */
public class SimpleDateFormatConstructorTest {
    /**
     * @sse SimpleDateFormat#SimpleDateFormat()
     * @see SimpleDateFormat#SimpleDateFormat(String pattern)
     * @param args
     */
    public static void main(String[] args) {

        SimpleDateFormat empty = new SimpleDateFormat();
        System.out.println(empty);
        SimpleDateFormat byPattern = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(byPattern);
    }
}
