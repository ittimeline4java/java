package net.ittimeline.java.core.oop.advanced.interfaces.employee;

/**
 * 接口案例：员工管理系统
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 11:08
 * @since Java21
 */
public class EmployeeTest {
    public static void main(String[] args) {
        // 创建一个Employee数组，包含不同类型的员工对象
        Employee[] employees = {
                new Manager("张伟", 1001),
                new Developer("李娜", 1002),
                new Designer("王强", 1003)
        };

        for (Employee emp : employees) {
            // 显示员工信息
            emp.displayInfo();
            // 判断员工是否实现了Workable接口
            if (emp instanceof Workable) {
                // 强制类型转换后调用work方法
                ((Workable) emp).work();
            }
            // 判断员工是否实现了Trainable接口
            if (emp instanceof Trainable) {
                // 强制类型转换后调用train方法
                ((Trainable) emp).train();
            }
            // 输出换行符
            System.out.println();
        }

    }
}
