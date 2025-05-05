package net.ittimeline.java.core.oop.foundational.clazz.constructor;

/**
 * 构造器案例
 * 实体类-Car
 * @author tony 18601767221@163.com
 * @version 2025/5/5 14:32
 * @since Java21
 */
public class Car {
    /**
     * 品牌
     */
    String brand;

    /**
     * 型号
     */
    String model;
    /**
     * 价格
     */
    int price;

    /**
     * 无参构造器
     */
    public Car() {
        this.brand = "未知品牌";
        this.model = "未知型号";
        this.price = 300000;

    }

    /**
     * 有参构造器
     *
     * @param carBrand 汽车品牌
     * @param carModel 汽车型号
     * @param carPrice 汽车年份
     */
    public Car(String carBrand, String carModel, int carPrice) {
        brand = carBrand;
        model = carModel;
        price = carPrice;
    }

    /**
     * 显示汽车信息
     */
    public void displayInfo() {
        System.out.println("汽车信息如下：");
        System.out.println("汽车品牌：" + brand);
        System.out.println("汽车型号：" + model);
        System.out.println("汽车价格（单位：元）：" + price);
    }
}
