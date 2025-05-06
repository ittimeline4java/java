package net.ittimeline.java.core.oop.intermediate.encapsulation.field;

/**
 * 属性封装案例：订单管理系统
 * 实体类-Order
 * @author tony 18601767221@163.com
 * @version 2025/5/5 17:19
 * @since Java21
 */
public class Order {
    /********************************私有属性********************************/
    /**
     * 订单ID
     */
    private String orderId;
    /**
     * 客户姓名
     */
    private String customerName;
    /**
     * 订单状态
     * Pending 待处理
     * Shipped 已发货
     * Delivered 已收货
     */
    private String status;
    /********************************构造方法********************************/

    /**
     * 无参构造方法
     */
    public Order() {
        this.status = "Pending";
    }

    /**
     * 有参构造方法
     *
     * @param orderId      订单ID
     * @param customerName 客户姓名
     */
    public Order(String orderId, String customerName) {
        //调用无参构造方法
        this();
        this.orderId = orderId;
        this.customerName = customerName;

    }

    /**
     * 全参构造方法
     *
     * @param orderId      订单ID
     * @param customerName 客户姓名
     * @param status       订单状态
     */
    public Order(String orderId, String customerName, String status) {
        this(orderId, customerName);
        this.status = status;
    }

    /********************************Getter方法********************************/

    public String getOrderId() {
        return orderId;
    }


    public String getCustomerName() {
        return customerName;
    }

    public String getStatus() {
        return status;
    }


    /********************************更新订单状态的方法********************************/
    public void setStatus(String newStatus) {
        // 订单状态验证
        if (newStatus.equals("Pending") || newStatus.equals("Shipped") || newStatus.equals("Delivered")) {
            this.status = newStatus;
            System.out.println("订单状态已更新为：" + newStatus);
        } else {
            System.out.println("无效的订单状态");
        }
    }

    // 显示订单信息
    public void displayOrderInfo() {
        System.out.println("订单号: " + orderId);
        System.out.println("客户姓名: " + customerName);
        System.out.println("订单状态: " + status);
    }

}
