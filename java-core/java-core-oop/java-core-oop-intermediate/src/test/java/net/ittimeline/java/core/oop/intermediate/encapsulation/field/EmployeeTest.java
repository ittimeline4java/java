package net.ittimeline.java.core.oop.intermediate.encapsulation.field;

/**
 * 属性封装案例：员工管理系统
 * 需求：创建一个员工类，封装员工ID、姓名、薪水和部门等属性，并提供计算年终奖金的方法。
 * 分析：略
 * 测试类-EmployeeTest
 * @author tony 18601767221@163.com
 * @version 2025/5/5 17:21
 * @since Java21
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("YF00001", "刘光磊", 50000, "研发部");

        employee.displayEmployeeInfo();
        System.out.println("年终奖金: " + employee.calculateYearlyBonus());

        // 修改薪水
        employee.setSalary(60000.00);
        System.out.println("更新后的年终奖金: " + employee.calculateYearlyBonus());

        // 尝试设置负薪水
        employee.setSalary(-100000.0);
    }

}
