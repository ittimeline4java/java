package net.ittimeline.java.core.oop.intermediate.encapsulation.constructor;


/**
 * 构造器封装案例：单例模式
 * 测试类-SingletonTest
 * @author tony 18601767221@163.com
 * @version 2025/5/5 17:29
 * @since Java21
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        // true，确保是同一个实例
        System.out.println(s1 == s2);
    }

}
