package net.ittimeline.java.core.oop.advanced.annotation.test;

/**
 * 简单标记注解
 * TestMethod注解使用
 * @author tony 18601767221@163.com
 * @version 2025/5/6 12:57
 * @since Java21
 */
public class TestMethodAnnotationUsage {
    @TestMethod //自定义注解的使用
    public void test1() {
        System.out.println("反射读取注解，调用方法");
        System.out.println("这是测试方法1");
    }

    public void test2() {
        System.out.println("这是普通方法");
    }

}
