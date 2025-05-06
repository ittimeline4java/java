package net.ittimeline.java.core.oop.intermediate.inheritance;

/**
 * 多层继承案例：电子产品分类
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 7:33
 * @since Java21
 */
public class Laptop extends Computer {
    /**
     * 屏幕尺寸
     */
    private double screenSize;

    public Laptop(String brand, String model, double powerConsumption, int ram, double screenSize) {
        super(brand, model, powerConsumption, ram);
        this.screenSize = screenSize;
    }

    public void fold() {
        System.out.println(getBrand() + getModel() + "笔记本电脑折叠，屏幕尺寸" + screenSize + "英寸");
    }
}
