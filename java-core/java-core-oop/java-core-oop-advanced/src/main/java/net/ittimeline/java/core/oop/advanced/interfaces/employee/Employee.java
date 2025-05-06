package net.ittimeline.java.core.oop.advanced.interfaces.employee;

/**
 * 接口案例：员工管理系统
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 11:07
 * @since Java21
 */
public class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void displayInfo() {
        System.out.println("员工姓名: " + name + ", ID: " + id);
    }

}
