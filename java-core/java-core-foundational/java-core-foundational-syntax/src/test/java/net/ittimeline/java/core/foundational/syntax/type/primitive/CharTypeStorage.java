package net.ittimeline.java.core.foundational.syntax.type.primitive;

/**
 * 字符在内存中的存储
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/6 16:31
 * @since Java21
 */
public class CharTypeStorage {
    /**
     * @param args
     * @see Integer#toBinaryString(int)
     * @see Integer#toHexString(int)
     */
    public static void main(String[] args) {
        char c = 'A';
        System.out.println("字符'A' 的二进制: " + Integer.toBinaryString(c));
        System.out.println("字符'A' 的十六进制: 0x" + Integer.toHexString(c));

        char chinese = '中';
        System.out.println("字符'中'的二进制: " + Integer.toBinaryString(chinese));
        System.out.println("字符'中'的二进制: 0x" + Integer.toHexString(chinese));

        /*
            字符'A' 的二进制: 1000001    // 'A' 的二进制（实际存储为 16 位：00000000 01000001）
            字符'A' 的十六进制: 0x41          // 'A' 的十六进制
            字符'中'的二进制: 100111000101101 // '中' 的二进制（实际存储：01001110 00101101）
            字符'中'的二进制: 0x4e2d        // '中' 的十六进制
         */

    }
}
