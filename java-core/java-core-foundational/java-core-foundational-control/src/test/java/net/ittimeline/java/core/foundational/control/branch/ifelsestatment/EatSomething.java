package net.ittimeline.java.core.foundational.control.branch.ifelsestatment;

import java.util.Scanner;

/**
 * 吃网红餐厅还是沙县小吃
 * 需求：键盘输入身上的钱（用整数表示），如果大于20000，就吃高端大气上档次的米其林餐厅，否则就吃经济实惠的沙县小吃
 * 分析：略
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/8 10:26
 * @since Java21
 */
public class EatSomething {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入身上的钱");
        int money = scanner.nextInt();
        if (money >= 20000) {
            System.out.println("吃高端大气上档次的米其林餐厅");
        } else {
            System.out.println("吃经济实惠的沙县小吃");
        }
        //关闭Scanner
        scanner.close();
    }
}
