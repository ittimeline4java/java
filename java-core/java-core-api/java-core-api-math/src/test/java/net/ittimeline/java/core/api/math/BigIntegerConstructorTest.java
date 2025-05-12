package net.ittimeline.java.core.api.math;

import java.math.BigInteger;
import java.util.Random;

/**
 * BigInteger常用构造方法测试
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/9 20:46
 * @since Java21
 */
public class BigIntegerConstructorTest {

    /**
     * @see BigInteger#BigInteger(String): 获取指定的大整数
     * @see BigInteger#BigInteger(int, java.util.Random) ：获取随即大整数，范围：[0 ~ 2的num次方减1]
     * @see BigInteger#BigInteger(String, int) ：获取指定进制大整数
     *
     * @see BigInteger#valueOf(long)：获取在long范围内的BigInteger对象
     *
     * @param args
     */
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            //0~15之间的随机数
            BigInteger bi1=new BigInteger(4,new Random());
            System.out.println(bi1);
        }

        //获取指定大整数
        //字符串只能是数字，不能有空格等字符，否则会抛出NumberFormatException异常
        BigInteger bi2=new BigInteger("123456789");
        System.out.println("bi2 = " + bi2);

        //获取指定进制的大整数
        //字符串只能是数字，不能有空格等字符，否则会抛出NumberFormatException异常
        //字符串中的数据必须是该进制下的数字，否则会抛出NumberFormatException异常
        BigInteger bi3=new BigInteger("100", 16);
        System.out.println("bi3 = " + bi3);


        //获取指定大整数
        //大整数只能在long类型的范围内

        BigInteger bi4=BigInteger.valueOf(123456789000000000L);
        System.out.println("bi4 = " + bi4);

        //在内部对常用的数字：-16 ~ 16 进行了缓存，可以直接获取到对应的BigInteger对象，节省内存空间
        BigInteger bi5=BigInteger.valueOf(16);
        BigInteger bi6=BigInteger.valueOf(16);

        System.out.println("bi5 == bi6 = " + (bi5 == bi6));
        BigInteger bi7=BigInteger.valueOf(17);
        BigInteger bi8=BigInteger.valueOf(17);
        System.out.println("bi7 == bi8 = " + (bi7 == bi8));


        BigInteger bi9=new BigInteger("100000");
        BigInteger bi10=new BigInteger("200000");
        //两个BigInteger对象相加，会创建一个新的BigInteger对象来保存结果
        BigInteger result = bi9.add(bi10);
        System.out.println("result = " + result);

        //对象一旦创建，就不能修改
        System.out.println("bi9 == result = " + (bi9 == result));
        System.out.println("bi10 == result = " + (bi10 == result));
    }
}
