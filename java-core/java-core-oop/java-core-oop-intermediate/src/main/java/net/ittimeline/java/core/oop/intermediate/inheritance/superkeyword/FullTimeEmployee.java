package net.ittimeline.java.core.oop.intermediate.inheritance.superkeyword;

/**
 * super关键字案例：员工管理系统
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 7:43
 * @since Java21
 */
public class FullTimeEmployee  extends Employee {

    /**
     * 月薪
     */
    private double monthlySalary;

    public FullTimeEmployee() {
        //调用父类无参构造器
        super();
    }


    public FullTimeEmployee(String employeeId, String name, double monthlySalary) {
        //调用父类有参构造器
        super(employeeId, name);
        this.monthlySalary = monthlySalary;
    }


    /**
     * 重写父类计算薪水方法
     *
     * @return 全职员工月薪
     */

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public void displayInfo() {
        System.out.println("********************************全职员工信息********************************");

        //调用父类displayInfo()方法
        super.displayInfo();
        System.out.println("全职员工月工资：" + monthlySalary);
    }
}
