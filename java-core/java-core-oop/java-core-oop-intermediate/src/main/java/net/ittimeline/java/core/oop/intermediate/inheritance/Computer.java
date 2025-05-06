package net.ittimeline.java.core.oop.intermediate.inheritance;

/**
 * 多层继承案例：电子产品分类
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 7:32
 * @since Java21
 */
public class Computer extends ElectronicDevice {
    private int ram;

    public Computer() {
    }

    public Computer(String brand, String model, double powerConsumption, int ram) {
        super(brand, model, powerConsumption);
        this.ram = ram;
    }

    /**
     * 计算
     */
    public void compute() {
        System.out.println(getBrand() + getModel() + "计算机正在计算，内存" + ram + "GB");

    }
}
