package net.ittimeline.java.core.api.lang;

/**
 * 包装类整数进制操作相关方法测试
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/9 20:17
 * @since Java21
 */
public class WrapperClassIntegerBinaryTest {
    /**
     * 查看整数的二进制、八进制、十六进制补码表示方式
     * @see Integer#toBinaryString(int)  查看整数二进制
     * @see Integer#toOctalString(int)  查看整数八进制
     * @see Integer#toHexString(int)   查看整数十六进制
     *
     * @param args
     */
    public static void main(String[] args) {
        //正整数25和负整数-25在内存中的存储
        //Integer类提供静态方法public static String toBinaryString(int i)查看整数的二进制表示方式
        System.out.println("正整数25的二进制补码方式是" + Integer.toBinaryString(25));
        System.out.println("负整数-25的二进制补码方式是" + Integer.toBinaryString(-25));

        //查看整数的二进制、八进制、十六进制补码表示方式
        int intNumber = 25;
        System.out.println("四个字节整数类型25的二进制补码表示方式为" + Integer.toBinaryString(intNumber));
        System.out.println("四个字节整数类型25的八进制补码表示方式为" + Integer.toOctalString(intNumber));
        System.out.println("四个字节整数类型25的十六进制补码表示方式为" + Integer.toHexString(intNumber));

        intNumber = -25;
        System.out.println("四个字节整数类型-25的二进制补码表示方式为" + Integer.toBinaryString(intNumber));
        System.out.println("四个字节整数类型-25的八进制补码表示方式为" + Integer.toOctalString(intNumber));
        System.out.println("四个字节整数类型-25的十六进制补码表示方式为" + Integer.toHexString(intNumber));
    }
}
