package net.ittimeline.java.core.foundational.syntax.type.primitive;

/**
 * 整数类型使用
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/2 15:41
 * @since Java21
 */
public class IntegerTypeUsage {
    public static void main(String[] args) {
        /********************************1.byte类型变量定义与使用********************************/
        System.out.println("1.byte类型变量定义与使用");
        //整数字面量12是int类型，但是在byte的取值范围内，因此赋值成功
        byte byteSmall = 12;
        System.out.println("byteSmall = " + byteSmall);

        //整数字面量128默认是int类型，但是不在byte的取值范围内，因此赋值失败
        //java: 不兼容的类型: 从int转换到byte可能会有损失
        //byte byteBig = 128;

        /********************************2.short类型变量定义与使用********************************/
        System.out.println("2.short类型变量定义与使用");
        //整数字面量12000是int类型，但是在short的取值范围内，因此赋值成功
        short shortSmall = 12000;
        System.out.println("shortSmall = " + shortSmall);

        //整数字面量32768是int类型，但是不在short的取值范围，因此赋值失败
        //java: 不兼容的类型: 从int转换到short可能会有损失
        //short shortBig = 32768;

        /********************************3.int类型变量定义与使用********************************/
        System.out.println("3.int类型变量定义与使用");

        //整数字面量1200000000是int类型，并且在int的取值范围内，因此赋值成功
        int intSmall = 1200000000;
        System.out.println("intSmall = " + intSmall);
        //整数字面量12000000000是int类型，但是不在int的取值范围内，因此赋值失败
        //java: 整数太大
        //int intBig = 12000000000;
        /********************************4.long类型变量定义与使用********************************/
        System.out.println("4.long类型变量定义与使用");
        //整数字面量120000000000000默认是int类型，加上L后缀变成long类型，并且在long的取值范围内，因此赋值成功
        long longSmall = 120000000000000L;
        System.out.println("longSmall = " + longSmall);
        //整数字面量12000000000000000000L默认是long类型，但是超过long的取值范围，因此赋值失败
        // java: 整数太大
        //long longBig = 12000000000000000000L;


    }
}
