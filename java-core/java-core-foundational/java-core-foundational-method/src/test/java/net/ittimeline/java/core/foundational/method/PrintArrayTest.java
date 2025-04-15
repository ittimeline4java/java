package net.ittimeline.java.core.foundational.method;

/**
 * 有参无返回值静态方法定义和调用
 * 有参无返回值静态方法调用
 * 需求：打印输出数组内容
 * 分析：略
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/14 13:50
 * @since Java21
 */
public class PrintArrayTest {
    public static void main(String[] args) {
        //在PrintArrayTest的main方法中调用有参无返回值静态方法
        //在其他类中调用有参无返回值静态方法：类名.方法名(实参列表)
        PrintArray.printArray(null);
        PrintArray.printArray(new int[10]);
        int[] array = {10, 20, 30, 40, 50};
        PrintArray.printArray(array);
    }
}
