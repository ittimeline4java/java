package net.ittimeline.java.core.foundational.method;

/**
 * 方法调用执行流程案例2
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/15 14:45
 * @since Java21
 */
public class MethodInvocationExecutionFlow2 {
    public static void main(String[] args) {
        System.out.println("a");
        //看到方法会进入方法，执行完毕后会回到调用处继续往下执行
        method1();
        System.out.println("b");
    }

    public static void method1() {
        //看到方法会进入方法，执行完毕后会回到调用处继续往下执行
        method2();
        System.out.println("c");
    }

    public static void method2() {
        System.out.println("d");
        System.out.println("e");
    }

}
