package net.ittimeline.java.core.foundational.syntax.variable;

/**
 * 变量使用注意事项1：变量在使用前必须要定义，也就是必须要声明和赋值
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/2 13:11
 * @since Java21
 */
public class VariableWarning1 {
    public static void main(String[] args) {
        //java: 找不到符号 符号 变量 age
        //System.out.println("age = " + age);
        int number;
        //java: 可能尚未初始化变量number
        //System.out.println("number = " + number);
    }
}
