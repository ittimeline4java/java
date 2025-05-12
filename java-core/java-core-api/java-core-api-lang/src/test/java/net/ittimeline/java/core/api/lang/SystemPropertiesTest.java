package net.ittimeline.java.core.api.lang;

/**
 * system获取系统属性方法测试
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/9 9:23
 * @since Java21
 */
public class SystemPropertiesTest {
    /**
     * @see System#getProperty(String) 获取指定键的系统属性值
     * @see System#getProperties()  获取系统属性集
     * @see System#setProperty(String, String) 设置系统属性
     * @param args
     */
    public static void main(String[] args) {
        // 获取操作系统名称和Java版本号
        String osName = System.getProperty("os.name");
        String javaVersion = System.getProperty("java.version");
        System.out.println("操作系统名称：" + osName);
        System.out.println("Java版本号：" + javaVersion);

        // 获取系统属性集并打印输出到控制台
        System.getProperties().list(System.out);
    }
}
