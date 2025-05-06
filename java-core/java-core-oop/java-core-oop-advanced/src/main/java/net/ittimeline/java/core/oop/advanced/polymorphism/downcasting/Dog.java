package net.ittimeline.java.core.oop.advanced.polymorphism.downcasting;

/**
 * 多态的弊端与向下转型
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 10:54
 * @since Java21
 */
public class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("小狗吃骨头");
    }

    public void lookHome() {
        System.out.println("小狗看家");
    }
}
