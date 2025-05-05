package net.ittimeline.java.core.oop.foundational.clazz.constructor;

/**
 * 构造器案例
 * 测试类-CarTest
 * @author tony 18601767221@163.com
 * @version 2025/5/5 14:33
 * @since Java21
 */
public class CarTest {
    public static void main(String[] args) {
        //无参构造器
        Car carWithoutArgs = new Car();
        carWithoutArgs.displayInfo();

        //有参构造器
        Car carWithArgs = new Car("奥迪", "A6L 2025款 改款 55 TFSI quattro 尊享动感型", 446600);
        carWithArgs.displayInfo();
    }

}
