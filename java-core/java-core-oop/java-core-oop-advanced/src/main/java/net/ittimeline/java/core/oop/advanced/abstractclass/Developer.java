package net.ittimeline.java.core.oop.advanced.abstractclass;

/**
 * 抽象类案例：员工管理系统
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 10:32
 * @since Java21
 */
public class Developer extends Employee {
    /**
     * 奖金比例
     */
    private double bonusRate = 0.10;

    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return getSalary() * bonusRate;
    }
}
