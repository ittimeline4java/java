package net.ittimeline.java.core.oop.intermediate.statickeyword;

/**
 * static修饰成员方法案例
 * 测试类-ArrayUtilsTest
 * @author tony 18601767221@163.com
 * @version 2025/5/5 17:40
 * @since Java21
 */
public class ArrayUtilsTest {
    public static void main(String[] args) {
        int[] scores = {70, 80, 90};
        System.out.println("数组元素内容是" + ArrayUtils.toString(scores));
        System.out.println("数组求和结果是" + ArrayUtils.sum(scores));
        System.out.println("数组最大值是" + ArrayUtils.max(scores));
        System.out.println("数组最小值是" + ArrayUtils.min(scores));
        System.out.println("数组平均值是" + ArrayUtils.avg(scores));
    }
}
