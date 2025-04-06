package net.ittimeline.java.core.foundational.syntax.type.primitive;

/**
 * 整数溢出内存原理
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/3 14:46
 * @since Java21
 */
public class IntegerTypeOverFlow {
    public static void main(String[] args) {
        /*
            ① 求补码：计算机在执行运算的时候使用补码运算
            1个字节等于8个bit
            int占据4个字节，byte占据1个字节
            135默认是int类型，(byte)135表示将int类型转换为byte类型
            135使用4个字节二进制表示方式：0000 0000 0000 0000 0000 0000 1000 0111
            135使用1个字节二进制表示方式：1000 0111
            1000 0111 最高位是1，表示是负数
            135 在内存中的二进制补码是1000 0111


            ② 根据补码求原码：查看计算机执行结果的时候使用原码
            补码：1000 0111
            反码：1000 0110
            原码：1111 1001
            ③ 原码转换为十进制
            原码：1111 1001
            1×2⁶ + 1×2⁵ + 1×2⁴ + 1×2³ + 0×2² + 0×2¹ + 1×2⁰
            = 64 + 32 + 16 + 8 + 0 + 0 + 1
            = 121
            最高位是1表示负数，原码：1111 1001转换为十进制结果是-121
         */
        byte value = (byte) 135;
        System.out.println("value = " + value);
    }
}
