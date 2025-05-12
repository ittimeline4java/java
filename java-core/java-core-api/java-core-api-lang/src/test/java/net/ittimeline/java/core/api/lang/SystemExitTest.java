package net.ittimeline.java.core.api.lang;

/**
 * system exit()方法测试
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/9 9:51
 * @since Java21
 */
public class SystemExitTest {
    /**
     * @see System#exit(int) 0 表示正常退出程序，非0 表示异常退出
     * @param args
     */
    public static void main(String[] args) {
        // 正常退出程序
        // System.exit(0);

        // 异常退出程序
        System.exit(130);

    }
}
