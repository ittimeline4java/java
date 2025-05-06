package net.ittimeline.java.core.oop.advanced.polymorphism.animal;

/**
 * 多态案例：动物园喂食系统
 * @author tony 18601767221@163.com
 * @version 2025/5/6 10:48
 * @since Java21
 */
public class Zookeeper {
    /**
     * 饲养动物
     *
     * @param animal 动物 形参多态
     */
    public void feed(Animal animal) {
        // 打印提示信息
        System.out.println("饲养员准备喂食");

        // 调用动物的进食方法
        animal.eat();
    }

}
