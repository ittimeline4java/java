package net.ittimeline.java.core.oop.advanced.interfaces.employee;

/**
 * 接口案例：员工管理系统
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 11:07
 * @since Java21
 */
public class Designer extends Employee implements Workable, Trainable {
    public Designer(String name, int id) {
        super(name, id);
    }

    @Override
    public void work() {
        System.out.println(getName() + " 正在设计界面。");
    }

    @Override
    public void train() {
        System.out.println(getName() + " 正在参加设计软件培训。");
    }
}
