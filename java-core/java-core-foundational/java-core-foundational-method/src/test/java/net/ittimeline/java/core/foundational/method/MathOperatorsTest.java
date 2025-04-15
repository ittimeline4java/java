package net.ittimeline.java.core.foundational.method;

/**
 * 有参有返回值静态方法定义与调用
 * 有参有返回值静态方法调用
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/14 14:05
 * @since Java21
 */
public class MathOperatorsTest {
    public static void main(String[] args) {

        //实际参数是字面量
        //有参有返回值静态方法调用语法格式
        //其他类中
        //打印输出调用
        //System.out.println(类名.方法名(实参列表));
        System.out.println("实参是字面量，100和200相加的结果是：" + MathOperators.sum(100, 200));

        //实际参数是变量
        int left = 1000;
        int right = 2000;
        //有参有返回值静态方法调用语法格式
        //其他类中
        //赋值调用
        //数据类型 变量名 = 类名.方法名(实参列表);
        long variableResult = MathOperators.sum(left, right);
        System.out.println("实参是变量，1000和2000相加的结果是：" + variableResult);
    }
}
