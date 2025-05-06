package net.ittimeline.java.core.oop.advanced.innerclass.member;

/**
 * 获取私有成员内部类对象方式
 * 私有成员内部类
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 12:03
 * @since Java21
 */
public class PrivateMemberOuterClass {
    private String outerFiled = "Outer Field";

    //私有成员内部类
    private class PrivateMemberInnerClass {
        public void display() {
            //内部类可以直接访问外部类的私有成员
            System.out.println("Accessing outerFiled :" + outerFiled);
        }
    }

    /**
     * 获取私有成员内部类实例
     *
     * @return 私有成员内部类实例
     */
    public PrivateMemberInnerClass getPrivateMemberInnerInstance() {
        return new PrivateMemberInnerClass();
    }

    public static void main(String[] args) {
        PrivateMemberOuterClass outer = new PrivateMemberOuterClass();
        PrivateMemberInnerClass inner = outer.getPrivateMemberInnerInstance();
        inner.display();
    }

}
