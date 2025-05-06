package net.ittimeline.java.core.oop.advanced.interfaces.vehicle;

/**
 * 接口案例：交通工具与可租赁、可维修接口
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 11:05
 * @since Java21
 */
public class VehicleTest {
    public static void main(String[] args) {
        // 创建Car对象，车型为"小米 SU7 Max"
        Car car = new Car("小米", "SU7 Max");
        // 设置汽车价格
        car.setPrice(300000);
        // 显示汽车信息
        car.display();
        // 租车
        car.rent();
        // 修车
        car.repair();
    }
}
