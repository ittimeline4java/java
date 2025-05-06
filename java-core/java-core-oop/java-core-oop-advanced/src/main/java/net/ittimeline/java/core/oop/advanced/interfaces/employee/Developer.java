package net.ittimeline.java.core.oop.advanced.interfaces.employee;

/**
 * 接口案例：员工管理系统
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 11:07
 * @since Java21
 */
public class Developer extends Employee implements Workable, Trainable {
    public Developer(String name, int id) {
        super(name, id);
    }

    @Override
    public void work() {
        System.out.println(getName() + " 正在编写代码。");
    }

    @Override
    public void train() {
        System.out.println(getName() + " 正在参加编程培训。");
    }
}
