package net.ittimeline.java.core.oop.intermediate.statickeyword;

/**
 * static关键字修饰成员变量案例
 * 测试类-StudentTest
 * @author tony 18601767221@163.com
 * @version 2025/5/5 17:37
 * @since Java21
 */
public class StudentTest {
    public static void main(String[] args) {
        //静态变量可以直接通过类名访问
        //静态变量会被所有对象共享
        Student.school = "清华";
        Student s1 = new Student("tony", 18);
        Student s2 = new Student("tiffany", 19);
        s1.display();
        s2.display();
    }

}
