package net.ittimeline.java.core.oop.intermediate.statickeyword;

/**
 * static关键字修饰成员变量案例
 * 实体类-Student
 * @author tony 18601767221@163.com
 * @version 2025/5/5 17:36
 * @since Java21
 */
public class Student {
    //私有属性
    private String name;

    private int age;

    static String school;

    //空参构造方法
    public Student() {
    }

    //有参构造方法
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 显示学生信息
     */
    public void display() {
        System.out.println("********************************学生信息如下********************************");
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        //实例方法可以访问静态成员
        //在静态区查找school变量，找到了就直接使用
        System.out.println("学校：" + school);
    }
}
