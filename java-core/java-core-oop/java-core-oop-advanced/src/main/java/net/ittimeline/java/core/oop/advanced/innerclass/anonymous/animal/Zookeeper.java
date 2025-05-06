package net.ittimeline.java.core.oop.advanced.innerclass.anonymous.animal;

/**
 * 匿名内部类案例-方法参数是抽象类
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 12:23
 * @since Java21
 */
public class Zookeeper {
    /**
     * 给动物喂食
     * 方法参数是抽象类
     *
     * @param animal 动物
     */
    public void feed(Animal animal) {
        animal.eat();
    }

}
