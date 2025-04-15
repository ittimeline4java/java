package net.ittimeline.java.core.foundational.method;

/**
 * 方法参数传递机制内存原理-基本类型
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/14 18:44
 * @since Java21
 */
public class MethodArgsTransferPrimitiveType {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用change()方法之前  number = " + number);
        change(number);
        System.out.println("调用change()方法之后  number = " + number);
    }

    /**
     * 修改number的值
     *
     * @param number 整数
     */
    public static void change(int number) {
        //在change方法内将number改成200
        number = 200;
    }
}
