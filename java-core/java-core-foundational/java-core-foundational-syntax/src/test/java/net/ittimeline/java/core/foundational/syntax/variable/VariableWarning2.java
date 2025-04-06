package net.ittimeline.java.core.foundational.syntax.variable;

/**
 * 变量使用注意事项2：同一个作用域范围内的变量不能重复定义，例如main方法中不能定义同名的变量
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/2 13:26
 * @since Java21
 */
public class VariableWarning2 {
    public static void main(String[] args) {
        int number = 20;
        //java: 已在方法 main(java.lang.String[])中定义了变量 number
        //int number = 200;
    }
}
