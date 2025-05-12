package net.ittimeline.java.core.api.lang;

import java.util.Objects;

/**
 * 员工类
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/8 12:48
 * @since Java21
 * @see Date
 */
public class Employee implements Cloneable {


    /**
     * 员工编号
     */
    private String employeeId;

    /**
     * 员工姓名
     */
    private String name;

    /**
     * 入职日期
     */
    private  Date hireDate;


    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    /**
     * 空参构造方法
     */
    public Employee() {
    }


    /**
     * 全参构造方法
     * @param employeeId 员工编号
     * @param name 员工姓名
     * @param hireDate  入职日期
     */
    public Employee(String employeeId, String name, Date hireDate) {
        this.employeeId = employeeId;
        this.name = name;
        this.hireDate = hireDate;
    }


    /**
     * 重写父类Object类的equals方法,判断两个员工对象是否相等
     * @param o  另一个员工对象
     * @return 是否相等 true表示相等 false表示不相等
     */
    @Override
    public boolean equals(Object o) {
        // 如果传入的对象为空，或者传入的对象类型与当前对象类型不一致，返回false
        if (o == null || getClass() != o.getClass()) return false;

        // 将传入的对象强制转换为Employee类型
        Employee employee = (Employee) o;

        // 判断employeeId、name和hireDate是否全部相等，如果全部相等则返回true，否则返回false
        return Objects.equals(employeeId, employee.employeeId) && Objects.equals(name, employee.name) && Objects.equals(hireDate, employee.hireDate);
    }


    /**
     * 重写父类Object类的hashCode方法
     * @return 员工对象的哈希码
     */
    @Override
    public int hashCode() {
        return Objects.hash(employeeId, name, hireDate);
    }

    /**
     * 重写父类Object类的toString方法
     * @return 员工信息字符串
     */
    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                ", hireDate=" + hireDate +
                '}';
    }


    @Override
    protected void finalize() throws Throwable {
        System.out.println("Employee对象的finalize方法被调用了"+this+"对象被回收了");
    }


    /**
     * 重写父类clone方法
     * 为了任意地方都可以使用clone方法，将权限修饰符改成public
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        //浅克隆，直接调用父类Object的clone方法即可
        //return super.clone();

        //深克隆
        //①克隆当前对象，但是入职日期还是一个引用类型，需要单独克隆
        Employee cloneEmployee = (Employee) super.clone();
        //②克隆入职日期对象，因为入职日期还是一个引用类型，需要单独克隆
        Date cloneHireDate = (Date) this.hireDate.clone();
        cloneEmployee.setHireDate(cloneHireDate);
        //返回克隆后的对象
        return cloneEmployee;

    }
}
