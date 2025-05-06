package net.ittimeline.java.core.oop.advanced.abstractclass;

/**
 * 抽象类案例：员工管理系统
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 10:32
 * @since Java21
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Manager manager = new Manager("张伟", 15000);
        manager.displayInfo();
        System.out.println("奖金: " + manager.calculateBonus());

        System.out.println();

        Developer developer = new Developer("李娜", 8000);
        developer.displayInfo();
        System.out.println("奖金: " + developer.calculateBonus());
    }
}
