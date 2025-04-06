package net.ittimeline.java.core.foundational.syntax.type.primitive;

/**
 * 转义字符使用
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/3 12:59
 * @since Java21
 */
public class CharacterTypeEscapeUsage {
    public static void main(String[] args) {
        /*
            System.out.print() 打印输出后不会换行
            System.out.println()打印输出后会换行
         */
        System.out.print("Hello");
        // \n表示换行
        char newLine = '\n';
        System.out.print(newLine);
        System.out.print("World");
        System.out.print('\n');
        //\t表示制表符
        System.out.println("Hello\tJava");
        // \\表示\
        String widowsPath = "D:\\projects\\ittimeline4java";
        System.out.println("widowsPath = " + widowsPath);
        String macPath = "/Users/liuguanglei/Documents/projects/ittimeline4java/java";
        System.out.println("macPath = " + macPath);
        //\"表示"
        System.out.println("\"跟光磊学Java从小白到架构师\"");
        // \'表示'
        System.out.println("\'跟光磊学Java从小白到架构师\'");
    }
}