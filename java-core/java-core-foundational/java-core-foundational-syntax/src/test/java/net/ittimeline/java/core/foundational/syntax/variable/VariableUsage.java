package net.ittimeline.java.core.foundational.syntax.variable;

/**
 * 变量的三种使用方式
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/2 12:53
 * @since Java21
 */
public class VariableUsage {
    public static void main(String[] args) {
        /********************************变量的使用方式1：打印输出********************************/

        //声明整数变量age，初始化赋值为18
        int age = 18;
        //打印变量age就是打印变量存储的值

        System.out.println(age);
        //不过为了让程序的运行结果更加直观，建议使用【字符串拼接打印】
        System.out.println("age = " + age);
        //声明浮点类型的变量height并且初始化赋值为180.0
        double height = 180.0;
        System.out.println(height);
        System.out.println("height = " + height);
        /********************************变量的使用方式2.修改变量存储的值********************************/

        //修改变量存储的值
        int number = 10;
        System.out.println("初始化赋值：number = " + number);
        //修改变量的值
        number = 20;
        System.out.println("修改之后：number = " + number);
        /********************************变量的使用方式3.参与运算********************************/

        //定义两个变量并且分别赋值10和20 ，10和20是整数字面量
        int left = 10;
        int right = 20;
        //将两个整数相加的结果赋值给result，left + right 是算术表达式
        int result = left + right;
        System.out.println("result = " + result);

    }
}
