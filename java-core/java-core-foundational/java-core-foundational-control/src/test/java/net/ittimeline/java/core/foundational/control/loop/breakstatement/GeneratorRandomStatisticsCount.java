package net.ittimeline.java.core.foundational.control.loop.breakstatement;

import java.util.Random;

/**
 * 生成指定随机数并统计次数
 * 需求：随机生成[1,100]的随机整数，直到生成随机数88，统计用了多少次
 * 分析：略
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/9 10:57
 * @since Java21
 */
public class GeneratorRandomStatisticsCount {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber;
        //计数器
        int count = 0;
        while (true) {
            //随机生成[1,100]的随机整数
            randomNumber = random.nextInt(100) + 1;
            //计数器累加
            count++;
            //随机数是88，那么终止循环
            if (randomNumber == 88) {
                break;
            }
        }
        System.out.printf("生成随机数%d一共用了%d次\n", randomNumber, count);
    }
}
