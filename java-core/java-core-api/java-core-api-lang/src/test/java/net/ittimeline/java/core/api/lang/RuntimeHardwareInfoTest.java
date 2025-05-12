package net.ittimeline.java.core.api.lang;

/**
 * Runtime获取硬件信息测试
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/9 10:53
 * @since Java21
 */
public class RuntimeHardwareInfoTest {
    /**
     * @see Runtime#availableProcessors() 获取CPU核心数
     * @see Runtime#freeMemory() 获取空闲内存大小
     * @see Runtime#maxMemory() 获取最大内存大小
     * @see Runtime#totalMemory() 获取总内存大小
     * @param args
     */
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("CPU核心数：" + runtime.availableProcessors());
        System.out.println("空闲内存大小：" + runtime.freeMemory() / 1024 / 1024 + "MB");
        System.out.println("最大内存大小：" + runtime.maxMemory()/ 1024 / 1024 + "MB");
        System.out.println("总内存大小：" + runtime.totalMemory()/ 1024 / 1024 + "MB");
    }
}
