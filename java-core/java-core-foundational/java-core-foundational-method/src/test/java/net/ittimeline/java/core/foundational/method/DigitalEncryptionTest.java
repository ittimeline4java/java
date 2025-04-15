package net.ittimeline.java.core.foundational.method;

/**
 * 方法案例：数字加密
 * 需求：某系统的数字密码大于0，例如1983，采用加密的方式进行传输。
 * 规则如下：先得到每位数，然后每位数加上5，再对10求余数，最后将所有的数字反转，得到一串新数8346
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/15 14:23
 * @since Java21
 */
public class DigitalEncryptionTest {
    public static void main(String[] args) {
        //待加密的数字
        int number = 1983;
        int encryptionNumber = DigitalEncryption.encryption(number);
        System.out.printf("数字%d加密之后的数字是%d\n", number, encryptionNumber);

    }
}
