package net.ittimeline.java.core.foundational.control.branch.switchstatement;

import java.util.Scanner;

/**
 * 根据日期计算天数
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/8 18:49
 * @since Java21
 */
public class GetDaysByDateV2 {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in 标准输入 也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入年份");
        int year = scanner.nextInt();
        System.out.println("请输入月份（这年的第几个月）");
        int month = scanner.nextInt();
        System.out.println("请输入天数（这个月第几天）");
        int day = scanner.nextInt();
        int sumDays = 0;

        /*
            一三五七八十腊，三十一天永不差”的下一句是：“四六九冬三十整，惟有二月二十八，闰年还要把一日加
            1，3，5，7，8，10，12 31天
            4，6，9，11 30天
            2 平年28天 闰年29天
         */

        //获取二月份的天数
        //获取2月份的天数 可能是28天，也可能是29天
        //闰年条件1：年份可以被4整除，但是不可以被100整除
        //闰年条件2：年份可以被400整除
        int februaryDay = 28;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            februaryDay = 29;
        }

        switch (month) {
            case 12:
                sumDays += 30;
            case 11:
                sumDays += 31;
            case 10:
                sumDays += 30;
            case 9:
                sumDays += 31;
            case 8:
                sumDays += 31;
            case 7:
                sumDays += 30;
            case 6:
                sumDays += 31;
            case 5:
                sumDays += 30;
            case 4:
                sumDays += 31;
            case 3:
                sumDays += februaryDay;
            case 2:
                sumDays += 31;
            case 1:
                sumDays += day;
                break;

        }
        System.out.printf("%d年%d月%d日是%d年的第%d天\n", year, month, day, year, sumDays);
        //关闭Scanner
        scanner.close();
    }
}
