package net.ittimeline.java.core.oop.advanced.annotation.repeat;

import java.lang.reflect.Method;

/**
 * 带参数注解
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 13:00
 * @since Java21
 */
public class RepeatAnnotationTest {
    public static void main(String[] args) throws Exception {
        // 创建一个RepeatAnnotationUsage的实例
        RepeatAnnotationUsage repeatAnnotationUsage = new RepeatAnnotationUsage();

        // 获取RepeatAnnotationUsage类中名为sayHello的方法
        Method sayHelloMethod = repeatAnnotationUsage.getClass().getMethod("sayHello");

        // 获取sayHello方法上的Repeat注解
        Repeat repeat = sayHelloMethod.getAnnotation(Repeat.class);

        // 根据Repeat注解中的times属性，循环调用sayHello方法
        for (int i = 0; i < repeat.times(); i++) {
            // 调用sayHello方法
            sayHelloMethod.invoke(repeatAnnotationUsage);
        }
    }
}
