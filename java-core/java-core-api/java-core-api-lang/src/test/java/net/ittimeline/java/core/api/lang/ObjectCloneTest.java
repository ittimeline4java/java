package net.ittimeline.java.core.api.lang;

/**
 * Object clone()方法测试
 * 浅克隆和深克隆
 * @author tony 18601767221@163.com
 * @version 2025/5/8 14:43
 * @since Java21
 */
public class ObjectCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee employee= new Employee("tb0001", "Tony",new Date(2025, 5, 8));
        System.out.println("employee = " + employee);
        // 调用clone方法进行克隆并强制类型转换为Employee类型
        Employee employeeClone = (Employee)employee.clone();
        System.out.println("employeeClone = " + employeeClone);

        System.out.println("修改Employee克隆对象关联Date对象的year属性为2024");
        // 修改Employee克隆对象关联Date对象的year属性
        employeeClone.getHireDate().setYear(2024);
        System.out.println("employee = " + employee);
        System.out.println("employeeClone = " + employeeClone);

    }
}
