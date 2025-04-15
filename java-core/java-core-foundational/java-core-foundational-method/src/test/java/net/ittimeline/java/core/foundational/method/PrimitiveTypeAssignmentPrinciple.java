package net.ittimeline.java.core.foundational.method;

/**
 * 基本类型赋值原理
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/14 18:26
 * @since Java21
 */
public class PrimitiveTypeAssignmentPrinciple {
    public static void main(String[] args) {
        //基本数据类型 变量存储的是真实数据
        int number = 100;
        System.out.println("number = " + number);

        //基本数据类型 赋值给其他变量，也是赋真实的数据值
        int value = number;
        System.out.println("value = " + value);
    }
}
