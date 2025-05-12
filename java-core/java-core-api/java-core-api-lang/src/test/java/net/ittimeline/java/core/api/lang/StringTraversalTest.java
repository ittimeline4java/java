package net.ittimeline.java.core.api.lang;

import java.util.Scanner;

/**
 * 字符串遍历
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/11 10:17
 * @since Java21
 */
public class StringTraversalTest {
    /**
     * @see String#charAt(int) 根据索引返回字符
     * @see String#length()  返回字符串的长度
     *
     * @see String#toCharArray() 将字符串转换为字符数组
     * @param args
     */
    public static void main(String[] args) {
        // 创建Scanner对象
        // System.in表示标准输入，也就是键盘输入
        // Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入字符串");
        String str = scanner.nextLine();
        System.out.println("********************************字符串遍历方式1********************************");

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        System.out.println("********************************字符串遍历方式2********************************");
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }


        //关闭Scanner
        scanner.close();
    }
}
