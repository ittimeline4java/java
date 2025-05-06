package net.ittimeline.java.core.oop.intermediate.inheritance.superkeyword;

/**
 * super关键字案例：员工管理系统
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 7:43
 * @since Java21
 */
public class PartTimeEmployee extends Employee {

    /**
     * 时薪
     */
    private double hourlyRate;

    /**
     * 工作小时
     */
    private int hoursWorked;

    public PartTimeEmployee() {
        //调用父类无参构造器
        super();
    }

    public PartTimeEmployee(String employeeId, String name, double hourlyRate, int hoursWorked) {
        //调用父类有参构造器
        super(employeeId, name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    /**
     * 重写父类计算薪水方法
     *
     * @return 兼职员工月薪
     */
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void displayInfo() {
        System.out.println("********************************全职员工信息********************************");
        //调用父类displayInfo()方法
        super.displayInfo();
        System.out.println("兼职员工时薪：" + hourlyRate);
        System.out.println("兼职员工工作时间：" + hoursWorked);
    }
}
