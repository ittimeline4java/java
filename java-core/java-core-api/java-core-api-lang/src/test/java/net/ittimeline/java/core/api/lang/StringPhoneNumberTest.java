package net.ittimeline.java.core.api.lang;

/**
 * 字符串案例：手机号脱敏
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/11 13:29
 * @since Java21
 * @see PhoneNumber
 */
public class StringPhoneNumberTest {
    public static void main(String[] args) {
        String originalPhoneNumber = "18601767221";
        String desensitization = PhoneNumber.desensitization(originalPhoneNumber);
        System.out.println("原手机号：" + originalPhoneNumber+" 脱敏后："+desensitization);

    }
}
