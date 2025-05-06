package net.ittimeline.java.core.oop.intermediate.javabean;

/**
 * JavaBean测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/5 17:34
 * @since Java21
 */
public class UserTest {
    public static void main(String[] args) {
        User user = new User("tiffany", 18);
        //打印对象，会调用对象的toString()方法
        System.out.println(user);

    }
}
