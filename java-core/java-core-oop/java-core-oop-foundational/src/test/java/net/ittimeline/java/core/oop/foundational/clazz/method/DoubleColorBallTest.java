package net.ittimeline.java.core.oop.foundational.clazz.method;

import java.util.Scanner;

/**
 * 实例方法案例：双色球
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/5 8:31
 * @since Java21
 */
public class DoubleColorBallTest {
    public static void main(String[] args) {
        DoubleColorBall doubleColorBall = new DoubleColorBall();

        //1 随机生成开奖结果
        doubleColorBall.generateWinningNumbers();


        //2 用户输入双色球：6个红球和1个篮球

        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入蓝球号码");
        int blueBall = scanner.nextInt();


        int[] redBalls = new int[6]; // 示例玩家选择的红色球号码
        for (int i = 0; i < redBalls.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个红球");
            redBalls[i] = scanner.nextInt();
        }

        doubleColorBall.setPlayerNumbers(redBalls, blueBall);

        //3 计算玩家的中奖金额及获得的奖项等级
        PrizeLevel result = doubleColorBall.calculatePrizeLevel();
        System.out.println("您中得了: " + result.getDescription() + "，奖金为: " + result.getAmount() + "元");

        //关闭Scanner
        scanner.close();
    }
}
