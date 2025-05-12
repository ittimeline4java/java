package net.ittimeline.java.core.api.lang;

/**
 * 字符串案例：手机号脱敏
 * 手机号类
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/11 13:25
 * @since Java21
 */
public class PhoneNumber {

    /**
     * 手机号脱敏
     * 18601767221 -> 186****7221
     * @param phoneNumber 手机号
     * @return 脱敏后的手机号
     * @see String#substring(int)
     * @see String#substring(int, int)
     */
    public static String desensitization(String phoneNumber) {
        if (null != phoneNumber && phoneNumber.length() == 11) {
            return phoneNumber.substring(0, 3) + "****" + phoneNumber.substring(7);
        }
        else{
            throw new IllegalArgumentException("手机号格式不正确");
        }
    }
}
