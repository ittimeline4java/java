package net.ittimeline.java.core.api.lang;

/**
 * system获取环境方法测试
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/9 9:34
 * @since Java21
 */
public class SystemEnvironmentTest {
    /**
     * @see System#getenv(String) 获取指定名称的环境变量值
     * @see System#getenv() 获取所有环境变量
     * @param args
     */
    public static void main(String[] args) {
        //获取环境变量JAVA_HOME的值
        System.out.println("获取环境变量JAVA_HOME的值："+System.getenv("JAVA_HOME"));

        //获取环境变量PATH的值
        System.out.println("获取环境变量PATH的值:"+System.getenv("PATH"));
    }
}
