package net.ittimeline.java.core.oop.intermediate.inheritance;

/**
 * 多层继承案例：电子产品分类
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 7:32
 * @since Java21
 */
public class ElectronicDevice {
    /**
     * 品牌
     */
    private String brand;

    /**
     * 型号
     */
    private String model;

    /**
     * 功耗
     */
    private double powerConsumption;

    public ElectronicDevice() {

    }

    public ElectronicDevice(String brand, String model, double powerConsumption) {
        this.brand = brand;
        this.model = model;
        this.powerConsumption = powerConsumption;
    }

    public String getBrand() {
        return brand;
    }


    public String getModel() {
        return model;
    }

    public void turnOn() {
        System.out.println(brand + model + "设备已开启，功耗" + powerConsumption + "W");
    }
}
