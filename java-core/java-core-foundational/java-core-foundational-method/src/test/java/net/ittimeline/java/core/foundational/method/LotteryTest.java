package net.ittimeline.java.core.foundational.method;

/**
 * 方法案例：抽奖
 * 测试类LotteryTest
 * 需求：一个大V直播抽奖，奖品是现金红包，分别有{2,588,888,1000,10000}五个奖金，
 * 请使用程序实现模拟抽奖，打印出每个奖项，奖项出现的顺序要随机且不重复。
 * 分析：①先打乱数组元素  ②遍历数组
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/15 14:10
 * @since Java21
 */
public class LotteryTest {
    public static void main(String[] args) {
        //模拟抽奖
        Lottery.drawPrizes();
    }
}
