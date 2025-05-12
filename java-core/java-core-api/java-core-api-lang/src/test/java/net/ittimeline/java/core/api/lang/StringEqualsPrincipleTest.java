package net.ittimeline.java.core.api.lang;

import java.util.Scanner;

/**
 * 字符串比较内存原理
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/10 16:28
 * @since Java21
 */
public class StringEqualsPrincipleTest {
    /**
     * 字符串相等性比较
     * ==  基本数据类型比较的数值是否相等，引用数据类型比较的是地址值是否相等
     * @see String#equals(Object obj)  比较的是内容是否相等
     * @see String#equalsIgnoreCase(String) 比较的是内容是否相等，忽略大小写
     * @param args
     */
    public static void main(String[] args) {
        //字符串面试题
        String str1 = "abc";
        String str2 = "abc";
        //== 比较的是地址值是否相等

        System.out.println("str1 == str2 = " + (str1 == str2));//true


        String str3 = new String("abc");
        System.out.println("str2 == str3 = " + (str2 == str3)); //false

        String str4 = new String("abc");
        System.out.println("str3 == str4 = " + (str3 == str4)); //false

        //比较字符串的内容是否相等
        String str5 = "abc";
        String str6 = "ABC";
        System.out.println("str5.equals(str6) = " + (str5.equals(str6))); //false
        System.out.println("str5.equalsIgnoreCase(str6) = " + (str5.equalsIgnoreCase(str6))); //true


        //比较键盘输入的"abc"和"abc"是否相等
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String input = scanner.next();
        //比较键盘输入的"abc"和"abc"是否相等
        System.out.println(input == "abc"); //false
        System.out.println(input.equals("abc")); //true
        System.out.println(input.equalsIgnoreCase("abc")); //true
        scanner.close();

    }
}
