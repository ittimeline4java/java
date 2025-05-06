package net.ittimeline.java.core.oop.intermediate.encapsulation.field;

/**
 * 属性封装案例：员工管理系统
 * 实体类-Employee
 * @author tony 18601767221@163.com
 * @version 2025/5/5 17:21
 * @since Java21
 */
public class Employee {
    /********************************私有属性********************************/

    /**
     * 员工ID
     */
    private String employeeId;
    /**
     * 员工姓名
     */
    private String name;
    /**
     * 员工薪水（月薪）
     */
    private double salary;
    /**
     * 员工部门
     */
    private String department;

    /********************************构造方法********************************/

    /**
     * 全参构造器
     *
     * @param employeeId 员工ID
     * @param name 员工姓名
     * @param salary 员工薪水（月薪）
     * @param department 员工部门
     */
    public Employee(String employeeId, String name, double salary, String department) {
        this.employeeId = employeeId;
        this.name = name;
        setSalary(salary); // 使用setter确保薪水有效
        this.department = department;
    }

    /********************************Getter 和 Setter 方法********************************/

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("薪水不能为负数");
        }
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // 计算年终奖金（假设为2倍月薪）
    public double calculateYearlyBonus() {
        return this.salary * 2;
    }

    // 显示员工信息
    public void displayEmployeeInfo() {
        System.out.println("员工ID: " + employeeId);
        System.out.println("姓名: " + name);
        System.out.println("薪水: " + salary);
        System.out.println("部门: " + department);
    }

}
