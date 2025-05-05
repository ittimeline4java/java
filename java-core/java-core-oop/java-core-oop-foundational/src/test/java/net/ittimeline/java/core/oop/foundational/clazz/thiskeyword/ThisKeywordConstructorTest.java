package net.ittimeline.java.core.oop.foundational.clazz.thiskeyword;

/**
 * this关键字使用-调用构造器
 * 测试类-ThisKeywordConstructorTest
 * @author tony 18601767221@163.com
 * @version 2025/5/5 15:03
 * @since Java21
 */
public class ThisKeywordConstructorTest {
    public static void main(String[] args) {
        User user = new User("tony", "888888");
        user.displayInfo();
    }
}
