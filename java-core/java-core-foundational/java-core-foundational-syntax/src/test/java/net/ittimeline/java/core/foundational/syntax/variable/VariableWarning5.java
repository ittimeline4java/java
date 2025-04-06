package net.ittimeline.java.core.foundational.syntax.variable;

/**
 * 变量使用注意事项5：一条语句可以定义多个数据类型相同的变量，但是不推荐使用 ，因为读性比较差
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/2 14:41
 * @since Java21
 */
public class VariableWarning5 {
    public static void main(String[] args) {
        int left = 10, middle = 20, right = 20;
        System.out.println("left = " + left);
        System.out.println("middle = " + middle);
        System.out.println("right = " + right);
    }
}
