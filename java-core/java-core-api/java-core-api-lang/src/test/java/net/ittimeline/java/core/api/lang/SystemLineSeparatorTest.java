package net.ittimeline.java.core.api.lang;

/**
 * system lineSeparator()方法测试
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/9 10:31
 * @since Java21
 */
public class SystemLineSeparatorTest {

    /**
     * @see System#lineSeparator() 获取系统换行符
     * @param args
     */
    public static void main(String[] args) {
        // 获取系统换行符
        String lineSeparator = System.lineSeparator();
        // 构建文本，使用换行符连接 "Hello" 和 "World"
        String text = "Hello" + lineSeparator + "World";
        // 输出文本
        System.out.println(text);
    }

}
