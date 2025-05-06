package net.ittimeline.java.core.oop.advanced.annotation.validator;

import java.lang.reflect.Field;

/**
 * 用户校验
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 13:03
 * @since Java21
 */
public class UserValidation {
    /**
     * 校验用户
     *
     * @param user
     * @throws Exception
     */
    public static void validate(User user) throws Exception {
        // 获取User类中的userName字段
        Field userNameFiled = user.getClass().getDeclaredField("userName");

        // 检查userName字段上是否有MaxLength注解
        if (userNameFiled.isAnnotationPresent(MaxLength.class)) {
            // 获取MaxLength注解的实例
            MaxLength maxLengthAnnotation = userNameFiled.getAnnotation(MaxLength.class);
            // 将userName字段设置为可访问
            userNameFiled.setAccessible(true);
            // 获取userName字段的值
            String value = (String) userNameFiled.get(user);
            // 检查userName的值是否不为空且长度超过MaxLength注解的值
            if (value != null && value.length() > maxLengthAnnotation.value()) {
                // 抛出异常，提示userName长度不能超过MaxLength注解的值
                throw new Exception(userNameFiled.getName() + "长度不能超过" + maxLengthAnnotation.value());
            }
        }
    }

}
