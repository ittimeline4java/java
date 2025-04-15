package net.ittimeline.java.core.foundational.method;

/**
 * 无参数有返回值静态方法定义和调用
 * 无参数有返回值静态方法调用
 * 需求：生成[1,100]的随机数
 * 分析：略
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/14 13:57
 * @since Java21
 */
public class RandomGeneratorTest {
    public static void main(String[] args) {
        //1打印输出调用
        //其他类中
        // System.out.println(类名.方法名());
        System.out.println("打印输出调用：生成的随机数是" + RandomGenerator.generatorInt());

        //2 赋值调用
        //其他类中
        // 数据类型 变量名 = 类名.方法名();
        int randomNumber = RandomGenerator.generatorInt();
        System.out.println("赋值调用：生成的随机数是" + randomNumber);
    }
}
