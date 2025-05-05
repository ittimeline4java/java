package net.ittimeline.java.core.oop.foundational.clazz.method;

/**
 * 实例方法定义与调用
 * 实体类-Phone
 * 实例方法定义
 * @author tony 18601767221@163.com
 * @version 2025/5/5 7:54
 * @since Java21
 */
public class Phone {
    /************************************类的成员-成员方法-实例方法************************************/


    /**
     * 给指定的手机号打电话
     *
     * @param number 手机号
     */
    public void call(long number) {
        System.out.println("给" + number + "打电话");
    }

    /**
     * 给指定的手机号发送指定的短信
     *
     * @param number  手机号
     * @param message 短信息
     */
    public void sendMessage(long number, String message) {
        System.out.println("给" + number + "发送短信，短信内容是" + message);
    }
}
