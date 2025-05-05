package net.ittimeline.java.core.oop.foundational.clazz;

/**
 * 多个对象内存机制
 * 测试类-MultiObjectTest
 * @author tony 18601767221@163.com
 * @version 2025/5/5 16:53
 * @since Java21
 */
public class MultiObjectTest {
    public static void main(String[] args) {
        //创建对象
        Person p1 = new Person();
        //通过对象调用属性
        p1.name = "tony";
        p1.age = 31;
        p1.gender = "男";
        p1.height = 180;
        p1.weight = 140.0;
        System.out.println("p1 = " + p1);
        System.out.println("******************p1个人信息******************");
        System.out.println("姓名：" + p1.name);
        System.out.println("年龄：" + p1.age);
        System.out.println("性别：" + p1.gender);
        System.out.println("身高：" + p1.height);
        System.out.println("体重：" + p1.weight);


        //创建对象
        Person p2 = new Person();
        p2.name = "tiffany";
        p2.age = 18;
        p2.gender = "女";
        p2.height = 168;
        p2.weight = 100.0;
        System.out.println("p2 = " + p2);
        System.out.println("******************p2个人信息******************");
        System.out.println("姓名：" + p2.name);
        System.out.println("年龄：" + p2.age);
        System.out.println("性别：" + p2.gender);
        System.out.println("身高：" + p2.height);
        System.out.println("体重：" + p2.weight);

        System.out.println("******************修改名称为p1的Person对象的age属性值******************");
        p1.age = 26;
        System.out.println("p1.age = " + p1.age);
        System.out.println("p2.age = " + p2.age);
    }

}
