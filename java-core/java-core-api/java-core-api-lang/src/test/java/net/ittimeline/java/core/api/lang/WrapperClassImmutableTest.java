package net.ittimeline.java.core.api.lang;

/**
 * 包装类不可变特性
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/9 15:02
 * @since Java21
 */
public class WrapperClassImmutableTest {
    public static void main(String[] args) {
        Integer i = 10;
        System.out.println("change before i = " + i);
        change(i);
        System.out.println("change after i = " + i);
    }

    /**
     * 改变i的值，但是并不会影响原来的值
     * @param i 包装类Integer对象
     */
    private static void change(Integer i) {
        //让方法内的局部变量 i 指向了一个新的 Integer 对象，原来的 i 对象没有被改变。
        i = 200;
    }
}
