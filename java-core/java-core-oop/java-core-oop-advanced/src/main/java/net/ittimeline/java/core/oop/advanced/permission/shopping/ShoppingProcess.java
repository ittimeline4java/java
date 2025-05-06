package net.ittimeline.java.core.oop.advanced.permission.shopping;

/**
 * 权限修饰符案例：购物系统
 * 购物流程
 * @author tony 18601767221@163.com
 * @version 2025/5/6 11:17
 * @since Java21
 */
public abstract class ShoppingProcess {
    // 购物车对象
    private Cart cart = new Cart();
    // 支付方式接口引用
    private PaymentMethod paymentMethod;

    // 设置支付方式
    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    /**
     * 添加商品到购物车
     * protected 方法，子类可以访问
     * @param product
     */
    protected void addItemToCart(Product product) {
        System.out.println("正在将商品添加到购物车...");
        cart.addProduct(product);
    }


    // 查看购物车
    protected void viewCart() {
        cart.viewCart();
    }

    // 计算总金额
    protected double calculateTotalAmount() {
        System.out.println("正在计算总金额...");
        return cart.calculateTotalAmount();
    }

    // 调用支付方式
    private void processPayment(double amount) {
        if (paymentMethod != null) {
            paymentMethod.pay(amount);
        } else {
            System.out.println("未选择支付方式！");
        }
    }


    /**
     * 选择支付方式
     * 抽象方法，子类必须实现
     */
    protected abstract void selectPaymentMethod();

    /**
     * 设置发货方式
     * 抽象方法，子类必须实现
     */
    protected abstract void selectDeliveryMethod();



    // public 方法，外部可以调用
    public final void completeShopping() {
        // 查看购物车
        viewCart();
        // 计算总金额
        double totalAmount = calculateTotalAmount();
        selectPaymentMethod();
        selectDeliveryMethod();
        // 调用支付流程
        processPayment(totalAmount);
        System.out.println("购物流程已完成。");
    }

}
