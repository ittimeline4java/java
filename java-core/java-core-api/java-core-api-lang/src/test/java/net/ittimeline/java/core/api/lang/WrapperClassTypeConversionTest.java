package net.ittimeline.java.core.api.lang;

/**
 * 基本数据类型、包装类和字符串相互转换
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/9 19:35
 * @since Java21
 */
public class WrapperClassTypeConversionTest {

    /**
     * 字符串和基本数据类型相互转换
     * @see Integer#toString()  基本数据类型转字符串
     * @see Integer#parseInt(String) 字符串转基本数据类型
     *
     * 字符串和包装类相互转换
     * @see Integer#valueOf(String) 字符串转整数包装类
     * @see Integer#toString() 包装类转字符串
     * @param args
     */
    public static void main(String[] args) {
        //字符串和基本数据类型相互转换
        // 基本数据类型转字符串
        String hundredStr = Integer.toString(100);
        System.out.println("hundredStr = " + hundredStr);
        String hundredDoubleStr = Double.toString(100.0);
        System.out.println("hundredDoubleStr = " + hundredDoubleStr);

        //字符串转整数基本数据类型
        int thousand = Integer.parseInt("1000");
        System.out.println("thousand = " + thousand);

        double thousandDouble = Double.parseDouble("1000");
        System.out.println("thousandDouble = " + thousandDouble);

        //字符串和包装类相互转换
        // 字符串转整数包装类
        Integer thousandInteger = Integer.valueOf("1000");
        System.out.println("thousandInteger = " + thousandInteger);

        //包装类转字符串
        String thousandStr = thousandInteger.toString();
        System.out.println("thousandStr = " + thousandStr);

    }
}
