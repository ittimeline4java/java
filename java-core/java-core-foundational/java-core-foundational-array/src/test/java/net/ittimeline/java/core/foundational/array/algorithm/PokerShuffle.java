package net.ittimeline.java.core.foundational.array.algorithm;

import java.util.Random;

/**
 * 打乱数组顺序算法-扑克牌洗牌
 * 需求：打乱54张扑克牌的顺序
 * 分析：
 * 生成54张扑克牌
 * 遍历54张牌，将每张扑克牌和随机索引对应的扑克牌进行交换，通过random.nextInt(54)生成随机索引
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/11 10:56
 * @since Java21
 */
public class PokerShuffle {
    public static void main(String[] args) {
        //1.生成54张牌
        //4种花色
        String[] colors = {"♥", "♠", "♣", "♦"};
        //11种数字
        String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        //54张牌
        String[] pokers = new String[54];

        //扑克牌索引
        int index = 0;
        //遍历花色
        for (int i = 0; i < colors.length; i++) {
            //遍历数字
            for (int j = 0; j < numbers.length; j++) {
                //拼接扑克牌
                pokers[index++] = colors[i] + numbers[j];
            }
        }
        //52号索引放大王
        pokers[52] = "大王";
        //53号索引放小王
        pokers[53] = "小王";

        //2. 遍历54张牌，将每张扑克牌和随机索引对应的扑克牌进行交换
        System.out.println("遍历扑克牌");
        Random random = new Random();
        for (int i = 0; i < pokers.length; i++) {
            //生成随机索引
            int randomIndex = random.nextInt(pokers.length);
            //将随机索引指定的元素和遍历的元素进行交换
            String temp = pokers[i];
            pokers[i] = pokers[randomIndex];
            pokers[randomIndex] = temp;
            System.out.print(pokers[i] + " ");
            //每显示13张就换行
            if ((i + 1) % 13 == 0) {
                System.out.println();
            }
        }
    }
}
