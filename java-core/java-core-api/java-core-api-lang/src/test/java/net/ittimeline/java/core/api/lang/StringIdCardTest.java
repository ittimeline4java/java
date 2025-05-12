package net.ittimeline.java.core.api.lang;

/**
 * 字符串案例：身份证信息查看
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/11 13:46
 * @since Java21
 */
public class StringIdCardTest {
    public static void main(String[] args) {
        IdCard.getInfoByIdCard("421023199502118520");
        System.out.println("----------------------");
        IdCard.getInfoByIdCard("421023199503118510");
    }
}
