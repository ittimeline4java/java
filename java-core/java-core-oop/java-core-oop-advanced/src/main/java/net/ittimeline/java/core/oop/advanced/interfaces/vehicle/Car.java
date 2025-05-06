package net.ittimeline.java.core.oop.advanced.interfaces.vehicle;

/**
 * 接口案例：交通工具与可租赁、可维修接口
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 11:04
 * @since Java21
 */
public class Car extends Vehicle implements Rentable, Repairable {

    public Car() {

    }

    public Car(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void rent() {
        System.out.println(getBrand() + getModel() + "汽车正在被租赁");
    }

    @Override
    public void repair() {
        System.out.println(getBrand() + getModel() + "汽车正在维修中");
    }
}
