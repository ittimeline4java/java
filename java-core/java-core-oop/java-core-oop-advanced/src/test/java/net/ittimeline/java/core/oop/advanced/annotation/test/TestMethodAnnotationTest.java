package net.ittimeline.java.core.oop.advanced.annotation.test;

import java.lang.reflect.Method;

/**
 * 简单标记注解
 * TestMethod注解使用
 * @author tony 18601767221@163.com
 * @version 2025/5/6 12:58
 * @since Java21
 */
public class TestMethodAnnotationTest {
    public static void main(String[] args) {
        // 创建 TestMethodAnnotationUsage 类的实例
        TestMethodAnnotationUsage testMethodAnnotationUsage = new TestMethodAnnotationUsage();

        // 遍历 TestMethodAnnotationUsage 类的所有声明的方法
        for (Method method : testMethodAnnotationUsage.getClass().getDeclaredMethods()) {
            // 检查方法是否带有 TestMethod 注解
            if (method.isAnnotationPresent(TestMethod.class)) {
                // 输出找到的测试方法名称及其是否带有 TestMethod 注解的信息
                System.out.println("找到测试方法；" + method.getName() + "，是否带有自定义注解TestMethod：" + method.isAnnotationPresent(TestMethod.class));

                try {
                    // 调用测试方法
                    method.invoke(testMethodAnnotationUsage);
                } catch (Exception e) {
                    // 如果调用方法时发生异常，则抛出运行时异常
                    throw new RuntimeException(e);
                }
            }
        }
    }

}
