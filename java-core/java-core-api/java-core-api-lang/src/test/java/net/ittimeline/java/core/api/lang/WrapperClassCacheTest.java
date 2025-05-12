package net.ittimeline.java.core.api.lang;

/**
 * 包装类缓存机制
 * Integer：缓存-128到127之间的值。
 * Byte：缓存-128到127。
 * Short：缓存-128到127。
 * Long：缓存-128到127。
 * Character：缓存0到127。
 * Boolean：缓存true和false。
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/9 14:36
 * @since Java21
 */
public class WrapperClassCacheTest {
    /**
     * @param args
     * @see Integer#valueOf(int)  将int转换为Integer 缓存范围是-128 ~ 127
     */
    public static void main(String[] args) {
        // 缓存范围
        //Integer num1= 127 等价于Integer.valueOf(127)
        Integer num1 = 127;
        Integer num2 = 127;
        System.out.println("num1 == num2 = " + (num1 == num2));//true 因为它们被缓存
        System.out.println("num1.equals(num2) = " + num1.equals(num2)); //true

        // 超出缓存范围
        Integer num3 = 128;
        Integer num4 = 128;
        System.out.println("num3 == num4 = " + (num3 == num4)); //false 因为它们没有被缓存
        System.out.println("num3.equals(num4) = " + num3.equals(num4)); //true equals判断的是整数数值是否相等，而不是地址是否相等
    }
}
