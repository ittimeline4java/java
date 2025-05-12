package net.ittimeline.java.core.api.lang;

/**
 * String构造方法测试
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/10 15:25
 * @since Java21
 */
public class StringConstructorTest {
    /**
     * 创建String对象的两种方式
     * @see String#String() 默认构造方法，创建一个空字符串
     * @see String#String(String)   通过已有字符串创建新对象
     *
     * @see String#String(char[]) 通过字符数组创建字符串
     * @see String#String(char[],int,int) 通过字符数组和起始位置及长度创建字符串
     * @see String#String(byte[]) 通过字节数组创建字符串
     *
     * @param args
     */
    public static void main(String[] args) {
        // 直接赋值创建String对象
        String name = "tony";
        System.out.println("name = " + name);

        // 通过构造方法创建String对象
        String blank = new String(); // 没有任何内容
        System.out.println("Hello" + blank + "World");

        // 通过构造方法创建String对象
        String greeting = new String("Hello");
        System.out.println("greeting = " + greeting);

        // 通过字符数组创建字符串
        String charArray1 = new String(new char[]{'H', 'e', 'l', 'l', 'o'});
        System.out.println("charArray1 = " + charArray1);

        // 通过字符数组和起始位置及长度创建字符串
        String charArray2 = new String(new char[]{'J', 'a', 'v', 'a', 'p', 'y', 't', 'h', 'o', 'n'}, 0, 4);
        System.out.println("charArray2 = " + charArray2);

        // 通过字节数组创建字符串
        String byteArray = new String(new byte[]{104, 101, 108, 108, 111});
        System.out.println("byteArray = " + byteArray);

    }

}
