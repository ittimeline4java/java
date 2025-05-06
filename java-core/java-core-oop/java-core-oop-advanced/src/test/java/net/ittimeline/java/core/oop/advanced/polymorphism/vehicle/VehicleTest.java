package net.ittimeline.java.core.oop.advanced.polymorphism.vehicle;

/**
 * 多态案例：交通工具
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 10:36
 * @since Java21
 */
public class VehicleTest {
    public static void main(String[] args) {
        // 父类引用指向不同的子类对象
        Vehicle myVehicle1 = new Car();
        Vehicle myVehicle2 = new Airplane();

        // 调用多态方法
        myVehicle1.move();  // 输出: The car drives on the road.
        myVehicle2.move();  // 输出: The airplane flies in the sky.
    }

}
