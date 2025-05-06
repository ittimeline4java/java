package net.ittimeline.java.core.oop.advanced.interfaces.notify;

/**
 * 接口案例：通知接口多种通知方式
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 11:01
 * @since Java21
 */
public class SMSNotifier implements Notifier {
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("发送短信给 " + recipient + "：");
        System.out.println("内容: " + message);
    }
}
