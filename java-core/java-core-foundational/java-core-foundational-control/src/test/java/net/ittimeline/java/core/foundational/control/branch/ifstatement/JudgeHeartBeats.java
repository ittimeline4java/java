package net.ittimeline.java.core.foundational.control.branch.ifstatement;

import java.util.Scanner;

/**
 * 体检
 * 需求：成年人心率的正常范围是每分钟60~100次，体检时如果心率不在此范围，则提示需要做进一步检查
 * 分析：略
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/8 10:06
 * @since Java21
 */
public class JudgeHeartBeats {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入每分钟心跳的次数");
        int heartBeats = scanner.nextInt();
        //如果体检不在[60,100]范围内
        if (heartBeats < 60 || heartBeats > 100) {
            System.out.println("你需要做进一步检查");
        }

        //关闭Scanner
        scanner.close();
        System.out.println("体检结束");
    }
}
