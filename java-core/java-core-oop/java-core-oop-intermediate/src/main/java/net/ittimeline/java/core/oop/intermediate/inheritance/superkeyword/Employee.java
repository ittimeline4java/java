package net.ittimeline.java.core.oop.intermediate.inheritance.superkeyword;

/**
 * super关键字案例：员工管理系统
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 7:43
 * @since Java21
 */
public class Employee {
    private String employeeId;
    private String name;

    public Employee() {
    }

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    /**
     * 计算薪水
     *
     * @return
     */
    public double calculateSalary() {
        //基类中提供一个默认实现
        return 0.0;
    }

    public void displayInfo() {
        System.out.println("员工姓名: " + name);
        System.out.println("员工编号: " + employeeId);
    }

}
