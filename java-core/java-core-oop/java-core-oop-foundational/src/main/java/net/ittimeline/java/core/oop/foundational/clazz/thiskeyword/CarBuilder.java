package net.ittimeline.java.core.oop.foundational.clazz.thiskeyword;

/**
 * this关键字使用-返回当前对象
 * 实体类-CarBuilder
 * @author tony 18601767221@163.com
 * @version 2025/5/5 15:07
 * @since Java21
 */
public class CarBuilder {
    /**
     * 汽车品牌
     */
    String brand;
    /**
     * 汽车型号
     */
    String model;
    /**
     * 出厂年份
     */
    int year;
    /**
     * 车身颜色
     */
    String color;

    /**
     * 设置品牌并返回当前对象
     *
     * @param brand 汽车品牌
     */
    public CarBuilder setBrand(String brand) {
        this.brand = brand;
        return this; // 返回当前对象
    }

    /**
     * 设置型号并返回当前对象
     *
     * @param model 型号名称
     * @return 返回当前对象
     */
    public CarBuilder setModel(String model) {
        this.model = model;
        return this; // 返回当前对象
    }

    /**
     * 设置出厂年份并返回当前对象
     *
     * @param year 出厂年份
     * @return 当前对象
     */
    public CarBuilder setYear(int year) {
        this.year = year;
        // 返回当前对象
        return this;
    }

    /**
     * 设置颜色并返回当前对象
      */

    public CarBuilder setColor(String color) {
        this.color = color;
        // 返回当前对象
        return this;
    }

    /**
     * 构建汽车对象
     * @return
     */
    public Car build() {
        return new Car(this.brand, this.model, this.year, this.color);
    }
}

/**
 *  this关键字使用-返回当前对象
 *  实体类-Car
 */
class Car {
    String brand;
    String model;
    int year;
    String color;

    public Car(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    /**
     * 展示汽车信息
     */
    public void displayCarInfo() {
        System.out.println("汽车信息如下：");
        System.out.println("汽车品牌：" + this.brand);
        System.out.println("汽车型号：" + this.model);
        System.out.println("出厂年份：" + this.year);
        System.out.println("车身颜色：" + this.color);
    }
}