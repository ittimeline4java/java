package net.ittimeline.java.core.foundational.control.loop.infiniteloop;

/**
 * while循环死循环使用
 * 需求：使用while循环死循环每隔一秒打印好好学习
 * 分析：略
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/9 13:16
 * @since Java21
 */
public class WhileInfiniteLoop {
    public static void main(String[] args) {
        //while循环无限循环
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("好好学习");
        }
        //死循环后不能有执行语句
        //编译错误：无法访问的语句
        //System.out.println("天天向上");
    }
}
