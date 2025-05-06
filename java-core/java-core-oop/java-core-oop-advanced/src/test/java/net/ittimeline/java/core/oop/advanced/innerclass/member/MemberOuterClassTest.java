package net.ittimeline.java.core.oop.advanced.innerclass.member;

/**
 * 成员内部类获取外部类的成员变量
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 12:13
 * @since Java21
 */
public class MemberOuterClassTest {
    public static void main(String[] args) {
        // 创建Outer类的一个实例
        MemberOuterClass.MemberInnerClass inner = new MemberOuterClass().new MemberInnerClass();
        // 调用Inner类的display方法
        inner.display();
    }
}
