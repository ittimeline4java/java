package net.ittimeline.java.core.api.lang;

/**
 * StringBuilder和String对比
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/11 14:27
 * @since Java21
 */
public class StringBuilderStringTest {

    private static final int COUNT = 10_0000;

    public static void main(String[] args) {


        stringBuilderAppend();
        stringAppend();
    }

    static void stringBuilderAppend() {
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < COUNT; i++) {
            sb.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("String拼接耗时：" + (end - start) + "ms");
    }


    static void stringAppend() {
        long start = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < COUNT; i++) {
            str += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("StringBuilder拼接耗时：" + (end - start) + "ms");
    }
}
