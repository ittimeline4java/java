package net.ittimeline.java.core.foundational.method;

/**
 * 方法案例：查找质数
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/15 11:12
 * @since Java21
 */
public class FindPrime {

    /**
     * 判断一个数字是否是质数
     *
     * @param number 数字
     * @return true是质数 false不是质数
     */
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 1和负数不是质数
        }
        if (number == 2 || number == 3) {
            return true; // 2和3是最小的质数
        }
        if (number % 2 == 0) {
            return false; // 排除2的倍数
        }
        // 从3开始，每次增加2，跳过所有偶数
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 统计指定范围的质数个数
     *
     * @return 质数列表（数组）
     */
    public static int[] statisticsPrimeNumber(int start, int end) {
        int[] tempArray = new int[end - start + 1];

        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                tempArray[count++] = i;
            }
        }
        int[] primeNumberArray = new int[count];
        System.arraycopy(tempArray, 0, primeNumberArray, 0, count);
        return primeNumberArray;
    }

    /**
     * 打印质数数组的元素
     * 每行显示5个
     *
     * @param primeNumberArray 质数数组
     */
    public static void printPrimeNumber(int[] primeNumberArray) {
        if (null != primeNumberArray && primeNumberArray.length > 0) {
            for (int i = 0; i < primeNumberArray.length; i++) {
                System.out.print(primeNumberArray[i]);
                if ((i + 1) % 5 == 0 || i == primeNumberArray.length - 1) {
                    System.out.println();
                } else {
                    System.out.print(",");
                }
            }
        }

    }


}
