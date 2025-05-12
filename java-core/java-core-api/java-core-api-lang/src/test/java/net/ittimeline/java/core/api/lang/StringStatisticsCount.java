package net.ittimeline.java.core.api.lang;

import java.util.Scanner;

/**
 * 字符串案例：统计字符次数
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/11 10:33
 * @since Java21
 */
public class StringStatisticsCount {
    /**
     * 统计字符串中大写字母、小写字母和数字的个数
     * @see String#charAt(int) 根据索引返回字符
     * @see String#length()  返回字符串的长度
     * @see Character#isUpperCase(char) 判断字符是否为大写
     * @see Character#isLowerCase(char) 判断字符是否为小写
     * @see Character#isDigit(char) 判断字符是否为数字
     ** @param args
     */
    public static void main(String[] args) {
        // 创建Scanner对象
        // System.in表示标准输入，也就是键盘输入
        // Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = scanner.nextLine();

        //定义三个计数器
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int digitCount = 0;

        // 遍历字符串的每个字符
        for (int i = 0; i < str.length(); i++) {
            Character character = str.charAt(i);
            // 判断字符是否为大写字母
            if (Character.isUpperCase(character)) {
                upperCaseCount++;
            }
            // 判断字符是否为小写字母
            if (Character.isLowerCase(character)) {
                lowerCaseCount++;
            }
            // 判断字符是否为数字
            if (Character.isDigit(character)) {
                digitCount++;
            }
        }

        // 输出统计结果
        System.out.printf("字符串%s 大写字母个数：%d，小写字母个数：%d，数字个数：%d\n", str, upperCaseCount, lowerCaseCount, digitCount);

        // 关闭Scanner
        scanner.close();
    }

}
