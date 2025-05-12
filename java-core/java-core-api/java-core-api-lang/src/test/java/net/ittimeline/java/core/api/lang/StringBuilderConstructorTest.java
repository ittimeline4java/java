package net.ittimeline.java.core.api.lang;

/**
 * StringBuilder构造方法测试
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/11 14:37
 * @since Java21
 */
public class StringBuilderConstructorTest {
    /**
     * @see StringBuilder#StringBuilder()
     * @see StringBuilder#StringBuilder(String)
     * @param args
     */
    public static void main(String[] args) {
        StringBuilder empty = new StringBuilder();
        System.out.println(empty);

        StringBuilder string=new StringBuilder("Hello");
        System.out.println(string);
    }
}
