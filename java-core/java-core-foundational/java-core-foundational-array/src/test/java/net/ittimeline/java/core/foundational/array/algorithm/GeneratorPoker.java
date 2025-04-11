package net.ittimeline.java.core.foundational.array.algorithm;

/**
 * 数组元素赋值算法-生成扑克牌
 * 需求：生成并遍历54张扑克牌
 * 分析：略
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/11 9:30
 * @since Java21
 */
public class GeneratorPoker {
    public static void main(String[] args) {
        //1.准备一副牌
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

        System.out.println("遍历扑克牌");
        for (int i = 0; i < pokers.length; i++) {
            System.out.print(pokers[i] + " ");
            //每显示13张就换行
            if ((i + 1) % 13 == 0) {
                System.out.println();
            }
        }
    }
}
