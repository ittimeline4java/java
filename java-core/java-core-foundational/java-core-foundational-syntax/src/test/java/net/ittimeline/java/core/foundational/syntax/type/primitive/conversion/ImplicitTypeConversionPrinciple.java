package net.ittimeline.java.core.foundational.syntax.type.primitive.conversion;

/**
 * 自动类型转换内存原理
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/5 14:49
 * @since Java21
 */
public class ImplicitTypeConversionPrinciple {
    public static void main(String[] args) {
         /*
            一个字节的整数10在内存的二进制补码表示方式为0000 1010
            byte自动提升为int后占据4个字节
            因此在内存的二进制补码表示方式为0000 0000 0000 0000 0000 0000 0000 1010
        */

        byte byteVar = 10;
        //byte自动提升为int后占据4个字节
        int intVar = byteVar;
        System.out.println("intVar = " + intVar);
    }
}
