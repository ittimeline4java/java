package net.ittimeline.java.core.api.lang;

/**
 * System类标准输入输出操作方法测试
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/9 9:09
 * @since Java21
 */
public class SystemStandardIOTest {
    /**
     * @see System#err System 标准错误输出流
     * @see System#in  System 标准输入流
     * @see System#out System 标准输出流
     * @param args
     */
    public static void main(String[] args) {
        //输出到控制台
        System.out.println("This is standard output");
        //输出错误信息到控制台
        System.err.println("This is an error output");
    }
}
