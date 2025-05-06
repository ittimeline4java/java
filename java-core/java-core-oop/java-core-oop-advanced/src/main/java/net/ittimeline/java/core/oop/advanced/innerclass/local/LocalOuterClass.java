package net.ittimeline.java.core.oop.advanced.innerclass.local;

/**
 * 局部内部类使用
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 12:20
 * @since Java21
 */
public class LocalOuterClass {
    private String outerField = "外部类成员变量";

    public void outerMethod() {
        final int localVar = 10;  // 局部变量需为final或等效final

        // 局部内部类定义在方法内部
        class LocalInnerClass {
            void printInfo() {
                System.out.println("访问外部类成员变量：" + outerField);
                System.out.println("访问方法局部变量：" + localVar);
            }
        }

        // 实例化局部内部类并调用方法
        LocalInnerClass inner = new LocalInnerClass();
        inner.printInfo();
    }


}
