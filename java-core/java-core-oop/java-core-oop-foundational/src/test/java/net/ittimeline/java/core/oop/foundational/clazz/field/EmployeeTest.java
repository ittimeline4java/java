package net.ittimeline.java.core.oop.foundational.clazz.field;

/**
 * 成员变量案例-员工类与对象
 * 测试类-EmployeeTest
 * @author tony 18601767221@163.com
 * @version 2025/5/5 7:51
 * @since Java21
 */
public class EmployeeTest {
    public static void main(String[] args) {
        //创建类的实例（创建类的对象、类的实例化）
        Employee employee1 = new Employee();
        System.out.println("employee1 = " + employee1);
        System.out.println("******************employee1员工默认初始化信息******************");
        System.out.println("员工编号：" + employee1.id);
        System.out.println("员工姓名：" + employee1.name);
        System.out.println("员工年龄：" + employee1.age);
        System.out.println("员工薪水：" + employee1.salary);
        System.out.println("员工生日：" + employee1.birthday);

        employee1.id = 100001;
        employee1.name = "tony";
        employee1.age = 26;
        employee1.salary = 40000;
        MyDate birthday = new MyDate();
        birthday.year = 1993;
        birthday.month = 1;
        birthday.day = 1;
        employee1.birthday = birthday;
        System.out.println("******************employee1员工显示初始化信息******************");
        System.out.println("员工编号：" + employee1.id);
        System.out.println("员工姓名：" + employee1.name);
        System.out.println("员工年龄：" + employee1.age);
        System.out.println("员工薪水：" + employee1.salary);
        System.out.println("员工生日：" + employee1.birthday);

        //创建类的实例（创建类的对象、类的实例化）
        Employee employee2 = new Employee();
        System.out.println("employee2 = " + employee2);
        System.out.println("******************employee2员工默认初始化信息******************");
        System.out.println("员工编号：" + employee2.id);
        System.out.println("员工姓名：" + employee2.name);
        System.out.println("员工年龄：" + employee2.age);
        System.out.println("员工薪水：" + employee2.salary);
        System.out.println("员工生日：" + employee2.birthday);

        employee2.id = 100002;
        employee2.name = "tiffany";
        employee2.age = 22;
        employee2.salary = 12000;
        MyDate birthday2 = new MyDate();
        birthday2.year = 1997;
        birthday2.month = 2;
        birthday2.day = 2;
        employee2.birthday = birthday2;
        System.out.println("******************employee2员工显示初始化信息******************");
        System.out.println("员工编号：" + employee2.id);
        System.out.println("员工姓名：" + employee2.name);
        System.out.println("员工年龄：" + employee2.age);
        System.out.println("员工薪水：" + employee2.salary);
        System.out.println("员工生日：" + employee2.birthday.year + "年" + employee2.birthday.month + "月" + employee2.birthday.day + "日");
    }
}
