package net.ittimeline.java.core.oop.advanced.annotation.repeat;

/**
 * 带参数注解
 * 使用带参数自定义注解
 * @author tony 18601767221@163.com
 * @version 2025/5/6 13:00
 * @since Java21
 */
public class RepeatAnnotationUsage {
    @Repeat(times = 3) //使用带参数自定义注解
    public void sayHello() {
        System.out.println("Hello");
    }
}
