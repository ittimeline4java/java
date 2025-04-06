package net.ittimeline.java.core.foundational.syntax.variable;

/**
 * 变量使用注意事项3：变量只能在定义的作用域范围内使用
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/2 13:32
 * @since Java21
 */
public class VariableWarning3 {
    public static void main(String[] args) {
        //局部代码块
        {
            //定义变量
            int age = 19;
            //使用变量
            System.out.println("age = " + age);
        }
        //超过age所在的作用域范围
        //age只能在局部代码块内使用
        //java：找不到符号 变量 age
        //System.out.println("age = " + age);
    }
}
