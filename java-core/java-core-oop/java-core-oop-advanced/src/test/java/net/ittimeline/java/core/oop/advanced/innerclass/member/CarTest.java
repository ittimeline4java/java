package net.ittimeline.java.core.oop.advanced.innerclass.member;

/**
 * 获取非私有成员内部类对象方式
 * 成员内部类案例：汽车与发动机
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 12:12
 * @since Java21
 */
public class CarTest {
    public static void main(String[] args) {
        // 创建一个Car对象 Car是外部类
        Car car = new Car("奥迪", "A6L", 500000);
        // 调用Car对象的display方法
        car.display();
        //获取内部类对象的语法格式：外部类名.内部类名 对象名 = 外部类对象.内部类对象;

        // 创建一个Engine对象，Engine是Car类的成员内部类
        Car.Engine engine = car.new Engine("EA888", 200, 400, 2.0);
        // 调用Engine对象的display方法
        engine.display();
    }
}
