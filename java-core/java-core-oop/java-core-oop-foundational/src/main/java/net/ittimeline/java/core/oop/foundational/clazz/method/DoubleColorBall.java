package net.ittimeline.java.core.oop.foundational.clazz.method;

import java.util.Arrays;
import java.util.Random;

/**
 * 实例方法案例-双色球
 * 实体类-DoubleColorBall
 * @author tony 18601767221@163.com
 * @version 2025/5/5 8:29
 * @since Java21
 */
public class DoubleColorBall {
    /************************************类的成员-成员变量************************************/


    /**
     * 开奖的红色球号码
     */

    private int[] winningRedBalls;
    /**
     * 开奖的蓝色球号码
     */

    private int winningBlueBall;

    /**
     * 玩家选择的红色球号码
     */

    private int[] playerRedBalls;
    /**
     * 玩家选择的蓝色球号码
     */
    private int playerBlueBall;

    /************************************类的成员-成员方法-实例方法************************************/


    /**
     * 设置玩家选择的双色球号码
     *
     * @param redBalls 玩家选择的6个红色球号码
     * @param blueBall 玩家选择的1个蓝色球号码
     */
    public void setPlayerNumbers(int[] redBalls, int blueBall) {
        if (redBalls.length != 6 || blueBall < 1 || blueBall > 16) {
            throw new IllegalArgumentException("无效的玩家号码");
        }
        // 克隆数组防止外部修改
        this.playerRedBalls = redBalls.clone();
        this.playerBlueBall = blueBall;
    }


    /**
     * 随机生成开奖结果
     */
    public void generateWinningNumbers() {
        Random random = new Random();
        // 生成6个不重复的红色球号码
        // 红色球号码从1-33中选择
        winningRedBalls = new int[6];
        for (int i = 0; i < 6; i++) {
            int ball = random.nextInt(33) + 1;
            // 如果号码已经存在，则重新生成
            while (contains(winningRedBalls, ball)) {
                ball = random.nextInt(33) + 1;
            }
            winningRedBalls[i] = ball;
        }

        // 生成1个蓝色球号码
        //蓝色球号码从1-16中选择
        winningBlueBall = random.nextInt(16) + 1;
        System.out.println("篮球号码是" + winningBlueBall);
        System.out.println("红球号码是" + Arrays.toString(winningRedBalls));
    }

    /**
     * 检查数组中是否包含指定的值
     *
     * @param array 要检查的数组
     * @param value 要查找的值
     * @return 如果数组包含值则返回true，否则返回false
     */
    private boolean contains(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    /**
     * 计算玩家的中奖金额及获得的奖项等级。
     *
     * @return 返回一个PrizeLevel对象，其中包含了中奖金额和中奖级别描述
     */
    public PrizeLevel calculatePrizeLevel() {
        // 检查红色球匹配的数量
        int matchingRedBalls = 0;
        for (int i = 0; i < 6; i++) {
            if (contains(winningRedBalls, playerRedBalls[i])) {
                matchingRedBalls++;
            }
        }

        // 检查蓝色球是否匹配
        if (winningBlueBall == playerBlueBall) {
            // 蓝色球匹配的情况下，根据红色球匹配数量决定奖项
            switch (matchingRedBalls) {
                case 6:
                    return PrizeLevel.FIRST;
                case 5:
                    return PrizeLevel.THIRD;
                case 4:
                    return PrizeLevel.FOURTH;
                case 3:
                    return PrizeLevel.FIFTH;
                case 2:
                case 1:
                    return PrizeLevel.SIXTH;
                default:
                    return PrizeLevel.NONE;

            }
        } else {
            // 蓝色球不匹配的情况下，根据红色球匹配数量决定奖项
            switch (matchingRedBalls) {
                case 6:
                    return PrizeLevel.SECOND;
                case 5:
                    return PrizeLevel.FOURTH;
                case 4:
                    return PrizeLevel.FIFTH;
                case 1:
                    return PrizeLevel.SIXTH;
                default:
                    return PrizeLevel.NONE;
            }
        }
    }
}
