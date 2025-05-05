package net.ittimeline.java.core.oop.foundational.clazz;

/**
 * 测试类-类的实例化
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/5 7:22
 * @since Java21
 */
public class ClassNewInstanceTest {
    public static void main(String[] args) {
        //类的实例化/创建类的对象/创建类的实例
        //对象创建：ClassName objectName = new ClassName([arguments]);
        //创建Phone对象
        //phone是对象名，new Phone()才是真正的Phone对象
        Phone phone = new Phone();
        //打印对象名就是打印对象的类名、@符号和对象的哈希码的无符号十六进制表示的字符串
        System.out.println("phone = " + phone);

    }


}
