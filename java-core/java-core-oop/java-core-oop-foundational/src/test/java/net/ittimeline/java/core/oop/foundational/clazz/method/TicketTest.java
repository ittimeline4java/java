package net.ittimeline.java.core.oop.foundational.clazz.method;

import java.util.Scanner;

/**
 * 实例方法案例：卖机票
 * 需求：机票价格按照淡季、旺季、头等舱和经济舱收费，输入机票原价，月份和头等舱或者经济舱
 * 按照如下规则计算机票价格：
 * 旺季（5月-10月）头等舱9折，经济舱8.5折
 * 淡季（11月到来年4月） 头等舱7折，经济舱6.5折
 * 分析：略
 * 测试类-TicketTest
 * @author tony 18601767221@163.com
 * @version 2025/5/5 8:10
 * @since Java21
 */
public class TicketTest {
    public static void main(String[] args) {
        //① 键盘输入机票原价、月份、舱位等级
        //创建Scanner对象
        //System.in 标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入机票原价");
        double originPrice = scanner.nextDouble();

        System.out.println("请输入月份 1~12");
        int month = scanner.nextInt();

        System.out.println("请输入舱位等级 first头等舱 economy经济舱");
        String cabinClass = scanner.next();

        Ticket ticket = new Ticket();
        ticket.originalPrice = originPrice;
        ticket.month = month;
        ticket.cabinClass = cabinClass;

        double discountPrice = ticket.calculateDiscountPrice();
        System.out.printf("机票原价是" + originPrice + "机票折扣价是" + discountPrice);

        //关闭Scanner
        scanner.close();
    }
}
