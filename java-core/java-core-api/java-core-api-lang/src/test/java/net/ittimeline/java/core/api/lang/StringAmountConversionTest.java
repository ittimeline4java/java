package net.ittimeline.java.core.api.lang;

import java.util.Scanner;

/**
 * 字符串案例：金额转换
 * 需求：将整数金额转换为大写金额，例如整数2135转换为大写零百零拾零万贰千壹佰叁拾伍元
 * 分析：① 将数字转换为大写金额  ②前面补零 ③插入单位
 * @author tony 18601767221@163.com
 * @version 2025/5/11 13:11
 * @since Java21
 */
public class StringAmountConversionTest {
    public static void main(String[] args) {
        // 创建Scanner对象
        // System.in表示标准输入，也就是键盘输入
        // Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入转换的金额，0-99999999之间：");
        int amount = scanner.nextInt();
        String result = AmountConversion.amountConversion(amount);
        System.out.println("金额"+amount+"转换成汉字金额为："+result);
        //关闭Scanner
        scanner.close();
    }
}
