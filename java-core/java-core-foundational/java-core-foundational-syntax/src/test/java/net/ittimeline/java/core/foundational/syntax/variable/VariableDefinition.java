package net.ittimeline.java.core.foundational.syntax.variable;

/**
 * 变量的声明、赋值和定义
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/2 12:44
 * @since Java21
 */
public class VariableDefinition {
    public static void main(String[] args) {
        /********************************1.变量的声明、赋值********************************/
        //变量的声明语法格式：数据类型 变量名;
        int age;
        //变量的赋值语法格式：变量名 = 变量值;
        age = 19;
        /********************************2.变量的赋值********************************/
        //变量在赋值的时候除了可以赋数据类型对应的字面量值
        int value = 10;
        //还可以将另外一个变量（例如value)赋值给该变量
        int copyValue = value;
        double height = 180.0;
    }
}
