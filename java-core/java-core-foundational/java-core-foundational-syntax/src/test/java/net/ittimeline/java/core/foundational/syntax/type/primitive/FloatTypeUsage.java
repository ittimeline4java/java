package net.ittimeline.java.core.foundational.syntax.type.primitive;

/**
 * 浮点类型使用
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/3 9:45
 * @since Java21
 */
public class FloatTypeUsage {
    public static void main(String[] args) {
        //十进制浮点类型字面量的两种表示方法：十进制和科学计数法
        //1.2E2 等价于 1.2 * 10 ^ 2
        System.out.println("1.浮点数使用科学计数法表示");
        System.out.println("1.2E2 -->" + 1.2E2);

        //3.141592653589793 等价于(3141592653589793E-15
        System.out.println("3.141592653589793 -->" + (3141592653589793E-15));

        System.out.println("2.浮点数使用十进制表示-单精度浮点类型");
        //浮点类型字面量3.14默认是double类型，double类型的字面量不能赋值给float类型的变量floatVar1
        //java: 不兼容的类型: 从double转换到float可能会有损失
        //float floatVar1 = 3.14;
        float floatVar2 = 3.14f;
        System.out.println("floatVar2 = " + floatVar2);
        double doubleVar = 180.0;
        System.out.println("doubleVar = " + doubleVar);
        double doubleValue = 512E-2;
        System.out.println("doubleValue = " + doubleValue);
        //可以将float类型的字面量或者变量赋值给double类型的变量
        float floatResult = 5.0f;
        double doubleResult = floatResult;
        System.out.println("doubleResult = " + doubleResult);
    }
}
