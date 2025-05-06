package net.ittimeline.java.core.oop.advanced.polymorphism.vehicle;

/**
 * 多态案例：交通工具
 * 子类Airplane
 * @author tony 18601767221@163.com
 * @version 2025/5/6 10:35
 * @since Java21
 */
public class Airplane extends Vehicle {
    @Override
    public void move() {
        System.out.println("The airplane flies in the sky.");

    }
}
