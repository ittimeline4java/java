package net.ittimeline.java.core.oop.intermediate.inheritance.override;

import net.ittimeline.java.core.oop.intermediate.inheritance.superkeyword.FullTimeEmployee;
import net.ittimeline.java.core.oop.intermediate.inheritance.superkeyword.PartTimeEmployee;

/**
 * super关键字案例：员工管理系统
 * 需求：在一个公司管理系统中，有不同类型的员工，如全职员工和兼职员工。他们都有共同的属性（如姓名、员工编号）和方法（如计算工资、展示员工信息），但具体的工资计算方式不同。
 * 分析：略
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 7:44
 * @since Java21
 */
public class EmployeeTest {
    public static void main(String[] args) {
        // 创建一个全职员工对象
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("TB00001", "tony", 50000);
        // 创建一个兼职员工对象
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("TB00002", "jack", 50, 220);

        // 显示全职员工信息
        fullTimeEmployee.displayInfo();
        // 打印全职员工薪水
        System.out.println("全职员工薪水：" + fullTimeEmployee.calculateSalary());

        // 显示兼职员工信息
        partTimeEmployee.displayInfo();
        // 打印兼职员工薪水
        System.out.println("兼职员工薪水：" + partTimeEmployee.calculateSalary());

    }
}
