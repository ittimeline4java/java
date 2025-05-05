package net.ittimeline.java.core.oop.foundational.clazz;

/**
 * 空指针异常对象内存机制
 * 测试类-NPEObjectTest
 * @author tony 18601767221@163.com
 * @version 2025/5/5 16:55
 * @since Java21
 */
public class NPEObjectTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "jack";
        p1.age = 25;
        p1.gender = "男";
        p1.height = 180;
        p1.weight = 140.0;
        Person p2 = p1;
        p2.age = 27;
        p2 = null;
        System.out.println("p1.age = " + p1.age);
        System.out.println("p2.age = " + p2.age);
    }


}
