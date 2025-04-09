package net.ittimeline.java.core.foundational.control.branch.ifelseifelsestatement;

import java.util.Scanner;

/**
 * 自动驾驶
 * 需求：汽车无人驾驶时需要使用大量的判断：红灯停、绿灯行、黄灯亮了等一等
 * 分析：略
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/8 14:42
 * @since Java21
 */
public class Autopilot {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);

        //1.键盘输入红灯、绿灯、黄灯的状态
        //true表示亮  false表示熄灭
        System.out.println("请输入红灯状态，true表示亮，false表示熄灭");
        boolean isRightRed = scanner.nextBoolean();

        System.out.println("请输入绿灯状态，true表示亮，false表示熄灭");
        boolean isRightGreen = scanner.nextBoolean();

        System.out.println("请输入黄灯状态，true表示亮，false表示熄灭");
        boolean isRightYellow = scanner.nextBoolean();

        //2.判断 红灯停、绿灯行、黄灯亮了等一等
        if (isRightRed) {
            System.out.println("红灯停");
        } else if (isRightGreen) {
            System.out.println("绿灯行");
        } else if (isRightYellow) {
            System.out.println("黄灯亮了等一等");
        }
        //关闭Scanner
        scanner.close();
    }
}
