package net.ittimeline.java.core.oop.foundational.clazz.constructor;

/**
 * 构造器重载
 * 测试类-ConstructorOverloadingTest
 * @author tony 18601767221@163.com
 * @version 2025/5/5 14:31
 * @since Java21
 */
public class ConstructorOverloadingTest {
    public static void main(String[] args) {
        //当new对象时，直接通过构造器指定名字和年龄
        Person person1 = new Person("tony", 32);
        System.out.println("person1信息如下：");
        System.out.println("姓名：" + person1.name);
        System.out.println("年龄：" + person1.age);

        //当new对象时，直接通过构造器指定名字
        Person person2 = new Person("jack");
        System.out.println("person2信息如下：");
        System.out.println("姓名：" + person2.name);
        System.out.println("年龄：" + person2.age);
    }
}
