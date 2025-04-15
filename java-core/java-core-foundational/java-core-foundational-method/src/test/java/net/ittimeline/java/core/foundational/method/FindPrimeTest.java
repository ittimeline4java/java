package net.ittimeline.java.core.foundational.method;

/**
 * 方法案例：查找质数
 * 需求：判断101~200之间有多少个质数，并且输出所有质数
 * 质数：只能被1和自身整除的数
 * 需求变更：判断1001~2000之间有多少个质数，并且输出所有质数，每行输出5个
 * 分析： ① 实现判断一个数是否是质数 ②实现指定范围内的数是否是质数，如果是保存到数组 ③遍历数组，每行输出5个
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/15 11:16
 * @since Java21
 */
public class FindPrimeTest {
    public static void main(String[] args) {
        //需求：101~200之间有多少个质数，并且输出所有质数
        int[] primeNumberArray = FindPrime.statisticsPrimeNumber(101, 200);
        System.out.println("******************101~200之间有" + primeNumberArray.length + "个质数******************");
        FindPrime.printPrimeNumber(primeNumberArray);
        //需求变更：1001~2000之间有多少个质数，并且输出所有质数
        primeNumberArray = FindPrime.statisticsPrimeNumber(1001, 2000);
        System.out.println("******************1001~2000之间有" + primeNumberArray.length + "个质数******************");
        FindPrime.printPrimeNumber(primeNumberArray);

    }
}
