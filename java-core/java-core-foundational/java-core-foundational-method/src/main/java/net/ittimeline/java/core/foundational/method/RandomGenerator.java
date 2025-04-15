package net.ittimeline.java.core.foundational.method;

import java.util.Random;

/**
 * 无参有返回值静态方法定义和调用
 * 无参有返回值静态方法定义
 * 随机数生成器
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/14 13:55
 * @since Java21
 */
public class RandomGenerator {

    /**
     * 定义一个无参有返回值静态方法
     * 生成1~100之间的随机数
     *
     * @return 返回1~100之间的随机数
     */
    public static int generatorInt() {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        return randomNumber;
    }
}
