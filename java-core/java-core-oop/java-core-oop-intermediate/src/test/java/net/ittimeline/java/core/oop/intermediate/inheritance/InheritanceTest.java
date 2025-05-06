package net.ittimeline.java.core.oop.intermediate.inheritance;

/**
 * 单继承的使用
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 7:31
 * @since Java21
 */
public class InheritanceTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        //访问父类的属性（非私有）
        dog.name = "Buddy";
        //继承自父类的方法
        dog.eat();
        //子类自己的方法
        dog.bark();
    }
}
