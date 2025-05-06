package net.ittimeline.java.core.oop.advanced.annotation.validator;

/**
 * 校验注解
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 13:05
 * @since Java21
 */
public class MaxLengthAnnotationTest {
    public static void main(String[] args) throws Exception {
        User user = new User("花果山水帘洞美猴王齐天大圣孙悟空");
        UserValidation.validate(user);
    }

}
