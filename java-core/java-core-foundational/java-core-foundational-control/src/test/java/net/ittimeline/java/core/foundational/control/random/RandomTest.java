package net.ittimeline.java.core.foundational.control.random;

import java.util.Random;

/**
 * Random类生成随机数使用
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/8 9:16
 * @since Java21
 */
public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();
        //生成0~9之间的随机数
        //[ 或者 ]表示包含
        // (或者 )表示不包含
        int randomNumber = random.nextInt(10);
        System.out.println("生成[0,9]之间的随机整数：" + randomNumber);

        //生成指定范围的随机数
        //获取指定范围[a,b]随机公式：random.nextInt(b - a + 1) + a
        System.out.println("生成10个[10,20]的随机数");
        for (int i = 10; i <= 20; i++) {
            randomNumber = random.nextInt(20 - 10 + 1) + 10;
            System.out.print(randomNumber + "\t");
        }
    }
}
