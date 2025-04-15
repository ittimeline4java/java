package net.ittimeline.java.core.foundational.method;

/**
 * 有参无返回值静态方法定义和调用
 * 有参无返回值静态方法定义
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/14 13:46
 * @since Java21
 */
public class PrintArray {

    /**
     * 定义一个有参无返回值静态方法
     * 打印数组元素内容
     *
     * @param array 形式参数，整型类型数组
     */
    public static void printArray(int[] array) {
        if (null == array) {
            System.out.println(array);
            //结束当前方法
            return;
        }
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            //最后一个元素打印元素
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                //非最后一个元素打印元素再拼接一个,
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("]");
    }
}
