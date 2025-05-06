package net.ittimeline.java.core.oop.advanced.polymorphism.downcasting;

/**
 * 多态的弊端与向下转型
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 10:54
 * @since Java21
 */
public class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("小猫吃鱼");
    }

    public void catchMouse() {
        System.out.println("小猫抓老鼠");
    }
}
