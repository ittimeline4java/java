package net.ittimeline.java.core.oop.advanced.innerclass.statics;

/**
 * 静态内部类使用
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 12:15
 * @since Java21
 */
public class StaticsOuterClass {
    int value;
    static String country = "China";

    //静态内部类
    static class StaticsInnerClass {

        /**
         * 查看外部类实例变量
         */
        void displayInstanceVariable() {
            // 静态内部类无法直接访问外部类的实例变量
            // System.out.println("value = " + value);
            //可以通过创建外部类对象
            StaticsOuterClass outer = new StaticsOuterClass();
            //访问外部类的实例变量
            System.out.println("value = " + outer.value);
        }

        /**
         * 查看外部类静态变量
         */
        static void displayStaticVariable() {
            //静态内部类静态方法可以直接访问外部类的静态变量
            System.out.println("country = " + country);
        }

    }
}
