package net.ittimeline.java.core.oop.advanced.annotation.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 字段校验注解
 * 字段校验注解定义
 * @author tony 18601767221@163.com
 * @version 2025/5/6 13:01
 * @since Java21
 */
@Retention(RetentionPolicy.RUNTIME)//注解的有效期是运行时
@Target(ElementType.FIELD)//注解用于修饰成员变量
public @interface MaxLength {
    int value() default 10;
}
