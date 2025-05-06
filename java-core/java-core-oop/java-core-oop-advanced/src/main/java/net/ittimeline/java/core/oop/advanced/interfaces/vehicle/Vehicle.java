package net.ittimeline.java.core.oop.advanced.interfaces.vehicle;

/**
 * 接口案例：交通工具与可租赁、可维修接口
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 11:04
 * @since Java21
 */
public class Vehicle {
    private String brand;

    private String model;

    private double price;


    public Vehicle() {
    }

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void display() {
        System.out.println("车辆信息如下");
        System.out.println("品牌：" + brand);
        System.out.println("型号：" + model);
        System.out.println("价格：" + price);
    }

}
