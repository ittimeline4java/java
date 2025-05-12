package net.ittimeline.java.core.api.lang;

import java.util.Random;

/**
 * Object finalize()方法测试
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/8 14:50
 * @since Java21
 */
public class ObjectFinalizeTest {
    /**
     * @see Object#finalize() 方法在垃圾回收时会被调用，但不一定每次都会被调用
     * @param args
     */
    public static void main(String[] args) {
        Random randomMonth = new Random();

        for (int i = 0; i < 100_0000; i++) {
            String employeeId = String.valueOf(i+1);
            // 生成随机年份
            int year = randomMonth.nextInt(25) + 2000;
            // 生成随机月份
            int month = randomMonth.nextInt(12) + 1;
            // 生成随机日期
            int day = randomMonth.nextInt(27) + 1;
            // 创建员工对象
            Employee employee = new Employee(employeeId, "Tony", new Date(year, month, day));
            // 每1000次循环后手动触发垃圾回收
            if (i % 1000 == 0) {
                // 手动触发垃圾回收
                System.gc();
            }
        }
    }

}
