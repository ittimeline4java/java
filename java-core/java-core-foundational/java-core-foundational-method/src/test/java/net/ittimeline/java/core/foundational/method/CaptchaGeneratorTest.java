package net.ittimeline.java.core.foundational.method;

/**
 * 方法案例：验证码
 * 需求：定义方法实现随机长生一个五位验证码，验证码的格式如下
 * 长度为5
 * 前四位是大写字母或者小写字母
 * 最后一个是数字
 * 分析：略
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/15 14:15
 * @since Java21
 */
public class CaptchaGeneratorTest {
    public static void main(String[] args) {
        System.out.println("生成的5位验证码是" + CaptchaGenerator.generateCaptcha());
    }
}
