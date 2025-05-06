package net.ittimeline.java.core.oop.advanced.annotation.validator;

/**
 * 字段校验注解
 * 字段校验注解使用
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 13:02
 * @since Java21
 */
public class User {
    @MaxLength(15) //使用自定义注解
    private String userName;

    public User() {
    }

    public User(String userName) {
        this.userName = userName;
    }
}
