package net.ittimeline.java.core.oop.intermediate.codeblock;

/**
 * 局部代码块使用
 * 测试类-LocalCodeBlockTest
 * @author tony 18601767221@163.com
 * @version 2025/5/5 17:43
 * @since Java21
 */
public class LocalCodeBlockTest {
    public static void main(String[] args) {
        //局部代码块
        {
            int number =10;
            System.out.println("number = " + number);
        }
        // 局部变量出了大括号后失效 编译错误
        // System.out.println("number = " + number);

    }
}
