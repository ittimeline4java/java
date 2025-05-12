package net.ittimeline.java.core.api.lang;

/**
 * 字符串底层原理
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/10 15:49
 * @since Java21
 */
public class StringStoragePrincipleTest {
    public static void main(String[] args) {
        //直接赋值：直接赋值的方式创建字符串对象，系统会检查该字符串在串池中是否存在，
        //如果不存在则创建新的
        //如果存在则复用
        String str1 ="abc";
        String str2 ="abc";

        System.out.println("str1 == str2 = " + (str1 == str2));

        //构造器：构造器创建字符串对象，每new一次都会在堆内存开辟新的空间
        char[] chars = {'a','b','c'};
        String str3 = new String(chars);
        String str4 = new String(chars);
        //== 比较的是地址值，所以不相等
        System.out.println("str3 == str4 = " + (str3 == str4));
    }
}
