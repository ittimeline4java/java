package net.ittimeline.java.core.oop.advanced.innerclass.member;

/**
 * 成员内部类获取外部类的成员变量
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 12:13
 * @since Java21
 */
public class MemberOuterClass {
    //外部类成员变量
    private int value = 100;

    class MemberInnerClass {
        //成员变量
        private int value = 200;

        /**
         * 访问各种变量
         */
        void display() {
            //局部变量
            int value = 300;
            System.out.println("内部类访问局部变量：" + value);
            // 内部类访问成员变量：使用this关键字
            System.out.println("内部类访问成员变量：" + this.value);
            // Outer.this获取外部类对象的引用，然后访问外部类的成员变量
            System.out.println("内部类访问外部类的成员变量：" + MemberOuterClass.this.value);
        }
    }
}
