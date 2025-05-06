package net.ittimeline.java.core.oop.advanced.interfaces.notify;

/**
 * 接口案例：通知接口多种通知方式
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 11:00
 * @since Java21
 */
public interface Notifier {
    /**
     * 通知
     *
     * @param message   通知消息
     * @param recipient 收件人
     */
    void sendNotification(String message, String recipient);
}
