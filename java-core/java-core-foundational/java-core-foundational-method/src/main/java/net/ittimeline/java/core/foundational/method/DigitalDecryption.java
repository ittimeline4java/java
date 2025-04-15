package net.ittimeline.java.core.foundational.method;

/**
 * 方法案例：数字解密
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/15 14:29
 * @since Java21
 */
public class DigitalDecryption {
    /**
     * 数字解密
     *
     * @param number 待解密的数字
     * @return 解密的结果
     */
    public static int decryption(int number) {
        if (number > 0) {
            int decryptionNumber = 0;
            int[] array = int2Array(number);
            //① 反转
            for (int i = 0, j = array.length - 1; i < j; i++, j--) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

            //由于加密是通过对10取余的方式进行获取的
            //② 每位数如果是5 ~ 9 数字不变，每位数如果是0 ~ 4 数字加10
            for (int i = 0; i < array.length; i++) {
                if (array[i] >= 0 && array[i] <= 4) {
                    array[i] = array[i] + 10;
                }
            }
            //③ 最后每位数-5
            for (int i = 0; i < array.length; i++) {
                array[i] = array[i] - 5;
            }
            //④ 将数组的每个数拼接
            for (int i = 0; i < array.length; i++) {
                decryptionNumber = decryptionNumber * 10 + array[i];
            }
            return decryptionNumber;
        } else {
            throw new IllegalArgumentException("数字必须大于0");
        }

    }


    /**
     * 将传递整数数字的每一位数字放在数组中
     *
     * @param number 整数数字
     * @return 数组
     */
    public static int[] int2Array(int number) {
        //定义临时变量存储整数数字
        int originalNumber = number;
        //① 获取数字的长度
        int length = 0;
        while (number != 0) {
            number = number / 10;
            length++;
        }

        //② 将数字的每位数放在数组中
        int[] array = new int[length];
        int index = 0;
        while (originalNumber != 0) {
            int value = originalNumber % 10;
            originalNumber = originalNumber / 10;
            array[index] = value;
            index++;
        }

        //③ 将数组元素反转
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }
}
