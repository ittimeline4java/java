package net.ittimeline.java.core.foundational.syntax.type.primitive;

/**
 * 双精度浮点类型double精度问题
 * double类型字面量精度问题
 * double类型变量精度问题
 * double类型字面量、变量的算术运算精度问题
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/3 10:19
 * @since Java21
 */
public class DoubleTypePrecision {
    public static void main(String[] args) {
        //double的精度是15-17位十进制有效数字（从第一个非0数字开始计算，包含整数部分和小数部分，末尾的0是有效数字）
        //double类型字面量精度问题
        System.out.println("1.double类型字面量精度问题");
        System.out.println("double类型字面量 3.141592653589793 打印输出结果是" + 3.141592653589793);
        System.out.println("double类型字面量 3.14159265358979323 打印输出结果是" + 3.14159265358979323);
        System.out.println("double类型字面量 300.141592653589793 打印输出结果是" + 300.141592653589793);


        //double类型变量精度问题
        System.out.println("2.double类型变量精度问题");
        double doubleVar1 = 3.141592653589793;
        System.out.println("double类型变量 doubleVar1 打印输出结果是" + doubleVar1);
        double doubleVar2 = 3.14159265358979323;
        System.out.println("double类型变量 doubleVar2 打印输出结果是" + doubleVar2);
        double doubleVar3 = 300.141592653589793;
        System.out.println("double类型变量 doubleVar3 打印输出结果是" + doubleVar3);
        double doubleVar4 = 1234.141592653589793;
        System.out.println("double类型变量 doubleVar4 打印输出结果是" + doubleVar4); //1234.14159265359

        //double类型字面量、变量算术运算精度问题
        System.out.println("3.double类型字面量、变量算术运算精度问题");
        System.out.println("double类型字面量算术运算 1.0 - 0.9 运算结果是 " + (1.0 - 0.9));
        double doubleLeft = 1.0;
        double doubleRight = 0.9;
        double doubleResult = doubleLeft - doubleRight;
        System.out.println("double类型变量算术运算 doubleLeft - doubleRight 运算结果是 " + doubleResult);
    }
}
