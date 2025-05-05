package net.ittimeline.java.core.oop.foundational.clazz.constructor;

/**
 * 无参构造器与有参构造器
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/5 14:42
 * @since Java21
 */
public class MultiConstructorTest {
    public static void main(String[] args) {
        //有参构造器
        Student studentWithArgs = new Student("tony", 100);

        //无参构造器
        Student studentWithoutArgs = new Student();
    }
}
