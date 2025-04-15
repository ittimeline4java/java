package net.ittimeline.java.core.foundational.method;

/**
 * 方法案例：数字解密
 * 测试类DigitalDecryptionTest
 * 需求：某系统的数字加密的密码大于0，例如8346，采用如下规则进行解密，得到一串新数1983
 * 规则如下：先得到每位数，然后反转，再每位数如果是5~9数字不变，每位数如果是0~4数字加10，最后每位数-5
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/15 14:29
 * @since Java21
 */
public class DigitalDecryptionTest {
    public static void main(String[] args) {
        //待解密的数字
        int number = 8346;
        int decryptionNumber = DigitalDecryption.decryption(number);
        System.out.printf("数字%d解密之后的数字是%d\n", number, decryptionNumber);
    }

}
