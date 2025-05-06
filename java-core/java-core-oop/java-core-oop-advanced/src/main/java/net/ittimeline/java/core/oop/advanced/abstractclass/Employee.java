package net.ittimeline.java.core.oop.advanced.abstractclass;

/**
 * 抽象类案例：员工管理系统
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 10:31
 * @since Java21
 */
public abstract class Employee {
    private String name;

    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    /**
     * 计算奖金
     *
     * @return 奖金
     */
    public abstract double calculateBonus();

    // 具体方法：显示员工信息
    public void displayInfo() {
        System.out.println("姓名: " + name);
        System.out.println("工资: " + salary);
    }

    // Getter 方法
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
