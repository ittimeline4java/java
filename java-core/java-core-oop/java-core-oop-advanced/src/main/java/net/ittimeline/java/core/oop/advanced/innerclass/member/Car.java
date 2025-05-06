package net.ittimeline.java.core.oop.advanced.innerclass.member;

/**
 * 获取非私有成员内部类对象方式
 * 成员内部类案例：汽车与发动机
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 12:11
 * @since Java21
 */
public class Car {
    private final String brand;
    private final String model;
    private final double price;


    public Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void display() {
        System.out.println("车辆信息如下：");
        System.out.println("品牌：" + brand);
        System.out.println("型号：" + model);
        System.out.println("价格：" + price);
    }

    /**
     * 非私有成员内部类
     * 修饰符可以使用public、protected、默认的、private
     */
    class Engine {
        /**
         * 最大扭矩转速下限
         */
        public static final int maxTorqueRpmMin = 1700;

        /**
         * 最大扭矩转速上限
         */
        public static final int maxTorqueRpmMax = 4500;

        /**
         * 最大功率转速下限
         */
        public static final int maxPowerRpmMin = 5000;
        /**
         * 最大功率转速上限
         */
        public static final int maxPowerRpmMax = 6500;


        /**
         * 型号
         */
        private final String model;
        /**
         * 功率
         */
        private final int power;

        /**
         * 扭矩
         */
        private final int torque;
        /**
         * 排量
         */
        private final double displacement;

        public Engine(String model, int power, int torque, double displacement) {
            this.model = model;
            this.power = power;
            this.torque = torque;
            this.displacement = displacement;
        }

        public void display() {
            System.out.println("发动机信息如下：");
            System.out.println("型号：" + model);
            System.out.println("功率：" + power);
            System.out.println("扭矩：" + torque);
            System.out.println("排量：" + displacement);
        }
    }
}
