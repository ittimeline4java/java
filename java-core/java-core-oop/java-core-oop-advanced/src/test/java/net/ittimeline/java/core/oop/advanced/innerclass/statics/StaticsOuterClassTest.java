package net.ittimeline.java.core.oop.advanced.innerclass.statics;

/**
 * 静态内部类使用
 *
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 12:18
 * @since Java21
 */
public class StaticsOuterClassTest {
    public static void main(String[] args) {

        StaticsOuterClass.StaticsInnerClass staticsInnerClass = new StaticsOuterClass.StaticsInnerClass();
        //调用静态内部类的实例方法
        staticsInnerClass.displayInstanceVariable();
        //调用静态内部类的静态方法
        StaticsOuterClass.StaticsInnerClass.displayStaticVariable();
    }
}
