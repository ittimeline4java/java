package net.ittimeline.java.core.foundational.method;

import java.util.Random;

/**
 * 方法案例：抢红包
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/15 14:05
 * @since Java21
 */
public class Lottery {


    /**
     * 打乱数组元素的顺序
     *
     * @param prizes 要打乱顺序的数组
     */
    public static void shuffleArray(int[] prizes) {
        if (null == prizes) {
            throw new IllegalArgumentException("数组不能为空");
        }
        Random random = new Random();
        for (int i = 0; i < prizes.length; i++) {
            int randomIndex = random.nextInt(prizes.length);
            int temp = prizes[i];
            prizes[i] = prizes[randomIndex];
            prizes[randomIndex] = temp;

        }
    }

    /**
     * 模拟抽奖
     */
    public static void drawPrizes() {
        //定义奖品金额数组
        int[] prizes = {2, 588, 888, 1000, 10000};
        //打乱奖品的顺序
        shuffleArray(prizes);

        //打印每个奖项
        for (int i = 0; i < prizes.length; i++) {
            System.out.println(prizes[i] + "的奖金已经被抽中");
        }
    }
}
