package net.ittimeline.java.core.oop.intermediate.encapsulation.field;

/**
 * 属性封装案例：订单管理系统
 * 需求：创建一个订单类，封装订单号、客户姓名、订单状态等属性，并提供更新订单状态的方法
 * 分析：略
 * 测试类-OrderTest
 * @author tony 18601767221@163.com
 * @version 2025/5/5 17:19
 * @since Java21
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order("311981070822", "李萌");

        order.displayOrderInfo();

        order.setStatus("Shipped");
        order.displayOrderInfo();

        order.setStatus("Delivered");
        order.displayOrderInfo();

        // 尝试设置无效状态
        order.setStatus("Cancelled");
    }

}
