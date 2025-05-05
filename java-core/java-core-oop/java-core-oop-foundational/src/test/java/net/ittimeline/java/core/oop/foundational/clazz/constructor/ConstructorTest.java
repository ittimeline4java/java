package net.ittimeline.java.core.oop.foundational.clazz.constructor;

/**
 * 构造器使用
 * 测试类-ConstructorTest
 * @author tony 18601767221@163.com
 * @version 2025/5/5 14:25
 * @since Java21
 */
public class ConstructorTest {
    public static void main(String[] args) {
        //当new对象时，直接通过构造器指定名字和年龄
        Person person = new Person("tony", 32);
        System.out.println("person信息如下：");
        System.out.println("姓名：" + person.name);
        System.out.println("年龄：" + person.age);
    }
}
