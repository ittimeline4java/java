package net.ittimeline.java.core.oop.advanced.interfaces.notify;

/**
 * 接口案例：接口通知多种通知方式
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 11:02
 * @since Java21
 */
public class NotifierTest {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        Notifier smsNotifier = new SMSNotifier();
        Notifier pushNotifier = new PushNotifier();

        emailNotifier.sendNotification("您的订单已发货。", "alice@163.com");
        smsNotifier.sendNotification("您的验证码是123456。", "+8613800138000");
        pushNotifier.sendNotification("新消息：您有新的聊天消息。", "tony");
    }
}
