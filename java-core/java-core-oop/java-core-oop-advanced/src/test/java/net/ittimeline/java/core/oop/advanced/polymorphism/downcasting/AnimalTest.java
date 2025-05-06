package net.ittimeline.java.core.oop.advanced.polymorphism.downcasting;

/**
 * 多态的弊端与向下转型
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 10:55
 * @since Java21
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal dog = new Dog();
        // 创建了一个Dog对象
        //多态的弊端：不能访问子类特有的功能
        //animal.lookHome();
        // 不能访问子类特有的功能，因为animal是一个Animal类型的引用，它只能访问Animal类中定义的方法

        // 向下转型
        // 判断dog是否是Dog类的实例
        if (dog instanceof Dog) {
            // 将dog对象向下转型为Dog类型
            Dog dogObject = (Dog) dog;
            // 调用Dog类中特有的方法
            dogObject.lookHome();
        }

        Animal cat = new Cat();
        // 创建了一个Cat对象
        // 判断cat是否是Cat类的实例
        if (cat instanceof Cat) {
            // 将cat对象向下转型为Cat类型
            Cat catObject = (Cat) cat;
            // 调用Cat类中特有的方法
            catObject.catchMouse();
        }
    }
}
