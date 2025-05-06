package net.ittimeline.java.core.oop.advanced.annotation.repeat;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 带参数注解
 * 自定义注解Repeat
 * @author tony 18601767221@163.com
 * @version 2025/5/6 12:59
 * @since Java21
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Repeat {
    /**
     * 重复次数
     * 默认重复一次
     * @return 次数
     */
    int times() default 1;

}
