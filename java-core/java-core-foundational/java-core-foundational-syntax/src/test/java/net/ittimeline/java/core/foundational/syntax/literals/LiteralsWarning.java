package net.ittimeline.java.core.foundational.syntax.literals;

/**
 * Java字面量使用注意事项
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/2 11:42
 * @since Java21
 */
public class LiteralsWarning {
    public static void main(String[] args) {
        //打印输出null
        //System.out.println(null);

        /*
            null的使用场景：给引用类型赋值
            String是Java的一个类，类是引用数据类型
            str是一个变量名，更具体的说是对象名
            =表示将右边的null复制给左边的变量str

         */
        String str = null;
        System.out.println(str);
        //如果要打印输出null，那么只能使用字符串类型字面量打印输出
        System.out.println("null");
    }
}
