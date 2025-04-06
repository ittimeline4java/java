package net.ittimeline.java.core.foundational.syntax.type.primitive.conversion;

/**
 * 自动类型转换注意事项
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/5 14:37
 * @since Java21
 */
public class ImplicitTypeConversionWarning {
    public static void main(String[] args) {
        //1. byte,short和char之间不会进行自动类型转换
        byte byteVar = 10;
        short shortVar = 20;
        char charVar = 'a';
        //java: 不兼容的类型: 从byte转换到char可能会有损失
        //charVar = byteVar;
        //java: 不兼容的类型: 从char转换到short可能会有损失
        //shortVar = charVar;

        //当byte,short,char类型的变量之间进行运算时，都会先提升为 int 类型再进行处理，运算结果也是int类型
        int intResult = byteVar + shortVar + charVar;
        System.out.println("intResult = " + intResult);

        //2.有多种类型的数据混合运算时，系统首先自动将所有数据转换为取值范围最大的数据类型再进行计算
        //运算结果的数据类型也是所有数据中取值范围最大的数据类型
        byte byteValue = 10;
        short shortValue = 10;
        int intValue = 10;
        long longValue = 10L;
        float floatValue = 10.0f;
        double doubleValue = 10.0;
        double doubleResult = byteValue + shortValue + intValue + longValue + floatValue + doubleValue;
        System.out.println("doubleResult = " + doubleResult);

        //整数字面量1默认是int类型 因此结果是int类型
        intResult = byteVar + 1;
        System.out.println("byte类型和整数字面量进行加法运算 intResult = " + intResult);

        //小数字面量3.14默认是double类型，因此结果是double类型
        doubleResult = byteVar + 3.14;
        System.out.println("byte类型和浮点类型字面量进行加法运算 doubleResult = " + doubleResult);

        //为什么变量不能是数字开头? 因为变量赋值 123L无法区分是标识符还是数字
        /*
            int 123L=100;
            long value=123L;
        */
    }
}
