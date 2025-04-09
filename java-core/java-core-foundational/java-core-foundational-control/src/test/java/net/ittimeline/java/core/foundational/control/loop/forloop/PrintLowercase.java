package net.ittimeline.java.core.foundational.control.loop.forloop;

/**
 * 打印26个小写字母
 * 需求：控制台打印输出26个小写字母
 * 分析：略
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/8 19:36
 * @since Java21
 */
public class PrintLowercase {
    public static void main(String[] args) {
        System.out.println("********************************打印26个小写字母实现方式1********************************");
        //A的ASCII编码是65
        //a的ASCII编码是97

        for (int i = 97; i < 97 + 26; i++) {
            System.out.print((char) i + "\t");
        }
        //换行
        System.out.println();
        System.out.println("********************************打印26个小写字母实现方式2********************************");

        for (int i = 'a'; i <= 'z'; i++) {
            System.out.print((char) i + "\t");
        }
        //换行
        System.out.println();

        System.out.println("********************************打印26个小写字母实现方式3********************************");

        for (int i = 0; i < 26; i++) {
            System.out.print((char) (i + 97) + "\t");
        }
        //换行
        System.out.println();

    }
}
