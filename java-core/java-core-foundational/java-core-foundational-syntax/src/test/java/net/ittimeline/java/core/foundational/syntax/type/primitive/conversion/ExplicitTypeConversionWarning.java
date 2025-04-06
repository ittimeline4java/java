package net.ittimeline.java.core.foundational.syntax.type.primitive.conversion;

/**
 * 强制类型转换注意事项
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/5 15:54
 * @since Java21
 */
public class ExplicitTypeConversionWarning {
    public static void main(String[] args) {
        //double强制转换为int的精度损失问题
        System.out.println("1.double强制转换为int的精度问题");
        double doubleVar = 5.8;
        System.out.println("double强制转换为int之前 doubleVar = " + doubleVar);

        int intVar = (int) doubleVar;
        System.out.println("double强制转换为int之后 intVar = " + intVar);

        //int强制转换为byte内存溢出的问题
        System.out.println("2.int强制转换为byte内存溢出问题");
        int intValue = 128;
        System.out.println("int强制转换为byte之前 intValue = " + intValue);
        //128超过byte的存储范围，因此结果为-128，因此底层二进制补码是1000 0000
        byte byteValue = (byte) intValue;
        System.out.println("int强制转换为byte之后 byteValue = " + byteValue);

    }
}
