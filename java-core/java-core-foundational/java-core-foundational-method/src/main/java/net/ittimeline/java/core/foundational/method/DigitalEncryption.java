package net.ittimeline.java.core.foundational.method;

/**
 * 方法案例：数字加密
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/15 14:22
 * @since Java21
 */
public class DigitalEncryption {
    /**
     * 数字加密
     *
     * @param number 加密之前的数字
     * @return 加密之后的数字
     */
    public static int encryption(int number) {
        //① 把整数里面的每一位放到数组中
        //先得到每位数
        //int[] array = {1, 9, 8, 3};
        int[] array = int2Array(number);
        //System.out.println("【encryption】1.加密之前数组元素内容是" + Arrays.toString(array));

        //② 数字加密
        //然后每位数加上5
        for (int i = 0; i < array.length; i++) {
            array[i] += 5;
        }
        //System.out.println("【encryption】2.每位数加上5数组元素内容是" + Arrays.toString(array));


        //再每位数对10取余
        for (int i = 0; i < array.length; i++) {
            array[i] %= 10;
        }
        //System.out.println("【encryption】3.每位数对10取余数组元素内容是" + Arrays.toString(array));

        //最后将所有的数字反转
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        //System.out.println("【encryption】4.所有的数字反转数组元素内容是" + Arrays.toString(array));


        //③ 把数组里面的每个数字进行拼接，变成加密之后的结果
        int encryptionNumber = 0;
        for (int i = 0; i < array.length; i++) {
            /*
                假设加密前的数字是1983
                加密后的数字就是8346
                第一次循环：0 * 10 + 8 encryptionNumber等于8
                第二次循环：8 * 10 + 3 encryptionNumber等于83
                第三次循环：83 * 10 + 4  encryptionNumber等于834
                第四次循环：834 * 10 + 6 encryptionNumber等于8346
             */
            encryptionNumber = encryptionNumber * 10 + array[i];
            //System.out.println("encryptionNumber = " + encryptionNumber);
        }

        return encryptionNumber;
    }


    /**
     * 将传递的整数的每位数放到数组中
     * 例如number=1234，那么数组是{4,3,2,1}
     *
     * @param number 数字
     * @return 数组
     */
    public static int[] int2Array(int number) {
        if (number > 0) {
            //定义变量临时记录number的值，就是为了③使用
            int originalNumber = number;

            int length = 0;
            //① 计算数值的长度
        /*
            假设number是1983
            1983 / 10 = 198
            198 / 10 = 19
            19 / 10 = 1
            1 / 10 = 0
         */
            while (number != 0) {
                //每次循环就去掉右边的一个数字
                number = number / 10;
                //去掉一位，长度自增一次
                length++;
            }
            //System.out.printf("【int2Array】1.数值%d的长度是%d\n", originalNumber, length);
            //动态初始化数组
            int[] array = new int[length];

            //② 把整数的每一位添加到数组中
            /*
                假设originalNumber是1983 获取originalNumber的每一位数字分别是  3 8  9 1

                1983 % 10 = 3
                1983 / 10 =198

                198 % 10 = 8
                198 / 10 = 19

                19 % 10 = 9
                19 / 10 = 1

                1 % 10 = 1
                1 / 10 = 0

             */
            int index = 0;
            //先得到整数的每一位
            while (originalNumber != 0) {
                //获取originalNumber的每一位数字  3 8  9 1
                int value = originalNumber % 10;
                //再去掉右边的数字
                originalNumber = originalNumber / 10;
                //把当前获取到的个位添加到数组中
                array[index] = value;
                index++;
            }
            //System.out.println("【int2Array】2.得到整数的每一位之后数组元素内容是" + Arrays.toString(array));
            //③ 反转数组
            for (int i = 0, j = array.length - 1; i < j; i++, j--) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            //System.out.println("【int2Array】3.反转之后数组元素内容是" + Arrays.toString(array));

            return array;
        } else {
            throw new IllegalArgumentException("数字必须大于0");
        }
    }
}
