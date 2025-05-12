package net.ittimeline.java.core.api.lang;

import java.util.Scanner;

/**
 * 字符串案例：字符串反转
 * 需求：定义一个方法，实现字符串反转。键盘输入一个字符串，调用该方法后，在控制台输出结果，例如键盘输入abc，输出cba
 * 分析：略
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/11 10:25
 * @since Java21
 */
public class StringReversalTest {
    /**
     * @see String#charAt(int) 根据索引返回字符
     * @see String#length()  返回字符串的长度
     ** @param args
     */
    public static void main(String[] args) {
        // 创建Scanner对象
        // System.in表示标准输入，也就是键盘输入
        // Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = scanner.nextLine();

        System.out.println("反转之前，字符串内容为" + str);
        String reverseResult = reverse(str);
        System.out.println("反转之后，字符串内容为" + reverseResult);

        //关闭Scanner
        scanner.close();
    }


    /**
     * 反转字符串
     *
     * @param str 要反转的字符串
     */
    public static String reverse(String str) {
        String result = "";
        //反转字符串
        // 从字符串的末尾开始，逐个字符向前遍历
        for (int i = str.length() - 1; i >= 0; i--) {
            // 将每个字符追加到结果字符串中
            result += str.charAt(i);
        }
        return result;
    }

}
