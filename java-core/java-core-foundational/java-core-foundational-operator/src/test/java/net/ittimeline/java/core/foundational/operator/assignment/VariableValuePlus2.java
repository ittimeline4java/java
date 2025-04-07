package net.ittimeline.java.core.foundational.operator.assignment;

/**
 * 赋值运算符案例
 * 实现变量值加2
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/7 14:46
 * @since Java21
 */
public class VariableValuePlus2 {
    public static void main(String[] args) {
        //实现变量值加2有两种方式
        //方式1：推荐
        int type1 = 1;
        type1 += 2;
        System.out.println("type1 = " + type1);
        //方式2：
        int type2 = 1;
        type2 = type2 + 2;
        System.out.println("type2 = " + type2);
    }
}
