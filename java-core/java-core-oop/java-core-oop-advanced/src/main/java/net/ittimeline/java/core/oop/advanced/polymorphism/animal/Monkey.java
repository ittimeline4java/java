package net.ittimeline.java.core.oop.advanced.polymorphism.animal;

/**
 * 多态案例：动物园喂食系统
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 10:47
 * @since Java21
 */
public class Monkey extends Animal {

    @Override
    public void eat() {
        System.out.println("猴子在吃香蕉");
    }
}
