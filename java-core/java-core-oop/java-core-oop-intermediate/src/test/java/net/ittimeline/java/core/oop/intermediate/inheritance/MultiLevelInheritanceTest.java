package net.ittimeline.java.core.oop.intermediate.inheritance;

/**
 * 多层继承案例：电子产品分类
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 7:33
 * @since Java21
 */
public class MultiLevelInheritanceTest {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Rog", "幻X", 90.0, 64, 13.4);
        laptop.turnOn();
        laptop.compute();
        laptop.fold();
    }
}
