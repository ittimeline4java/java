package net.ittimeline.java.core.foundational.method;

/**
 * 方法调用执行流程案例1
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/15 14:41
 * @since Java21
 */
public class MethodInvocationExecutionFlow1 {

    public static void main(String[] args) {
        System.out.println("a");
        //看到方法会进入方法，执行完毕后会回到调用处继续往下执行
        doSomething();
        System.out.println("b");
    }


    public static void doSomething() {
        System.out.println("c");
        System.out.println("d");
    }

     /*
        程序运行结果
        a
        c
        d
        b
     */

}
