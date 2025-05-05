package net.ittimeline.java.core.oop.foundational.clazz.thiskeyword;

/**
 * this关键字使用-返回当前对象
 * 测试类-ThisKeywordReturnThisTest
 * @author tony 18601767221@163.com
 * @version 2025/5/5 15:10
 * @since Java21
 */
public class ThisKeywordReturnThisTest {
    public static void main(String[] args) {
        Car car = new CarBuilder()
                .setBrand("Audi")
                .setModel("A6L 2025款 改款 55 TFSI quattro 尊享动感型")
                .setYear(2025)
                .setColor("Black")
                .build();
        car.displayCarInfo();
    }
}
