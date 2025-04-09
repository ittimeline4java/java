package net.ittimeline.java.core.foundational.control.branch.ifelseifelsestatement;

import java.util.Scanner;

/**
 * 高铁计费系统
 * 需求：实现根据用户输入的身份计算高铁票的价格，输出他的身份以及高铁票价格
 * 高铁票价格计算规则
 * ● 原价580
 * ● 军人免费
 * ● 学生半价
 * ● 其他人原价
 * 分析：① 获取用户输入的身份  ② 根据不同的身份计算票价
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/8 14:49
 * @since Java21
 */
public class HighSpeedRailBillingSystem {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);

        //1.获取用户输入的身份
        System.out.println("请输入你的身份 (1 军人  2 学生  3 普通人)");
        int identity = scanner.nextInt();
        //2.根据不同的身份计算票价
        //原票价
        double basePrice = 580.0;
        //实际票价
        double actualPrice;
        if (identity == 1) {
            //军人免费
            actualPrice = 0;
        } else if (identity == 2) {
            //学生打五折
            actualPrice = basePrice * 0.5;
        } else {
            //普通人原价
            actualPrice = basePrice;
        }
        String identityStr = identity == 1 ? "军人" : identity == 2 ? "学生" : "普通人";
        System.out.println("你的身份是" + identityStr + " 实际高铁票价格是" + actualPrice);

        //关闭Scanner
        scanner.close();
    }
}
