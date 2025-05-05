package net.ittimeline.java.core.oop.foundational.clazz.constructor;

/**
 * 构造器使用
 * 实体类-Person
 * @author tony 18601767221@163.com
 * @version 2025/5/5 14:25
 * @since Java21
 */
public class Person {
    /**
     * 名字
     */
    String name;
    /**
     * 年龄
     */
    int age;


    /**
     * 有参构造器
     * ● 构造器的修饰符可以是public、protected、默认的和private
     * ● 构造器没有返回值
     * ● 方法名和类名一样
     * ● 形参列表和成员方法的形参列表规则一样
     *
     * @param personName 姓名
     * @param personAge  年龄
     */
    Person(String personName, int personAge) {
        System.out.println("【2个参数】有参构造器被调用，完成对象成员变量的初始化");
        name = personName;
        age = personAge;
    }


    /**
     * 有参构造器
     * ● 构造器的修饰符可以是public、protected、默认的和private
     * ● 构造器没有返回值
     * ● 方法名和类名一样
     * ● 形参列表和成员方法的形参列表规则一样
     * @param personName 姓名
     */
    Person(String personName) {
        System.out.println("【1个参数】有参构造器被调用，完成对象成员变量的初始化");
        name = personName;
    }

}
