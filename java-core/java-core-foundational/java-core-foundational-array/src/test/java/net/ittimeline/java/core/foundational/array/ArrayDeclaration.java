package net.ittimeline.java.core.foundational.array;

/**
 * 数组声明
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/10 8:15
 * @since Java21
 */
public class ArrayDeclaration {
    public static void main(String[] args) {
        // 变量的声明语法格式：  数据类型名  变量名;
        int age;

        //变量的初始化语法格式：  变量名 =  变量值;
        //初始化指的是第一次赋值
        age = 18;

        //数组声明的语法格式：数据类型[] 数组名;
        //声明基本类型元素的数组
        int[] numbers;
        double[] prices;
        char[] chars;

        //声明引用类型元素的数组
        String[] cities;
    }
}
