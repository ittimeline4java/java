package net.ittimeline.java.core.foundational.method;

/**
 * 无参无返回值静态方法定义与调用
 * 无参无返回值静态方法调用
 * 需求：打印Hello Friend!
 * 分析：略
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/14 13:35
 * @since Java21
 */
public class GreetingTest {
    public static void main(String[] args) {
        //在GreetingTest的main方法中调用无参无返回值静态方法
        //其它类中调用无参无返回值静态方法：类名.方法名()
        Greeting.sayHello();
    }
}
