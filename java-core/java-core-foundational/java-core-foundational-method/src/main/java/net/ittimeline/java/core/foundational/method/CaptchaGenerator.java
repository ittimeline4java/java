package net.ittimeline.java.core.foundational.method;

import java.util.Random;

/**
 * 方法案例：验证码
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/15 14:13
 * @since Java21
 */
public class CaptchaGenerator {
    /**
     * 生成五位数的验证码
     *
     * @return 验证码字符串
     */
    public static String generateCaptcha() {
        // 动态初始化26个大写字母和26个小写字母
        char[] letters = new char[52];
        for (int i = 0; i < 26; i++) {
            letters[i] = (char) ('A' + i); // 大写字母
            letters[26 + i] = (char) ('a' + i); // 小写字母
        }

        // 创建Random对象
        Random random = new Random();
        String captcha = "";

        // 生成5个随机数拼接字符串
        for (int i = 0; i < 5; i++) {
            if (i < 4) {
                // 前四位是大写字母或者小写字母
                int randomIndex = random.nextInt(letters.length);
                captcha += letters[randomIndex];
            } else {
                // 最后一个是数字
                captcha += random.nextInt(10);
            }
        }

        return captcha.toString();
    }

}
