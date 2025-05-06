package net.ittimeline.java.core.oop.advanced.annotation.test;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 简单标记注解
 * TestMethod注解定义
 * @author tony 18601767221@163.com
 * @version 2025/5/6 12:56
 * @since Java21
 */
@Retention(RetentionPolicy.RUNTIME)//表示该注解会在运行时也保留，可被反射机制读取
public @interface TestMethod {
}
