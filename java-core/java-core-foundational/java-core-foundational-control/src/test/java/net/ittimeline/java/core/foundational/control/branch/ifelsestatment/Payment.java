package net.ittimeline.java.core.foundational.control.branch.ifelsestatment;

import java.util.Scanner;

/**
 * 商品付款
 * 需求：假设用户在超市实际购买商品总价为13999，键盘输入一个整数表示用户实际支付金额，如果等于13999表示付款成功，否则付款失败。
 * 分析：略
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/8 10:30
 * @since Java21
 */
public class Payment {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入付款的金额");
        int amount = scanner.nextInt();
        if (amount == 13999) {
            System.out.println("付款成功");
        } else {
            System.out.println("付款失败");
        }
        //关闭Scanner
        scanner.close();
    }
}
