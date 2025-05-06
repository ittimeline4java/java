package net.ittimeline.java.core.oop.advanced.innerclass.member;

/**
 * 获取私有成员内部类对象方式
 * 私有成员内部类测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 12:08
 * @since Java21
 */
public class PrivateMemberOuterClassTest {
    public static void main(String[] args) {
        PrivateMemberOuterClass outer = new PrivateMemberOuterClass();
        //编译错误；其他类中无法访问外部类的私有成员内部类
        //PrivateMemberOuterClass.PrivateMemberInnerClass inner = outer.new PrivateMemberInnerClass();
        System.out.println("outer.getPrivateMemberInnerInstance() = " + outer.getPrivateMemberInnerInstance());
    }
}
