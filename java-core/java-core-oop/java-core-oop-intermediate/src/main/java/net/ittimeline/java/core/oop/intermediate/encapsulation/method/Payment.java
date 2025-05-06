package net.ittimeline.java.core.oop.intermediate.encapsulation.method;

/**
 * 方法封装案例：支付
 * 实体类-Payment
 * @author tony 18601767221@163.com
 * @version 2025/5/5 17:24
 * @since Java21
 */
public class Payment {

    /**
     * 私有方法：支付宝支付
     *
     * @param amount 支付金额
     * @return true 支付成功  false 支付失败
     */
    private boolean payByAlipay(double amount) {
        System.out.println("调用支付宝API...");
        return true;
    }


    /**
     * 私有方法：微信支付
     *
     * @param amount 支付金额
     * @return true 支付成功  false 支付失败
     */
    private boolean payByWeChat(double amount) {
        System.out.println("调用微信支付API...");
        return true;
    }

    /**
     * 公共方法：统一支付接口
     * 每种支付方式的具体实现被封装在私有方法中。
     * 未来新增支付方式只需修改 pay() 方法，不影响调用方。
     *
     * @param paymentType 支付类型
     * @param amount      支付金额
     * @return true 支付成功  false 支付失败
     */
    public boolean pay(String paymentType, double amount) {
        System.out.println("支付金额：" + amount);
        switch (paymentType) {
            case "Alipay":
                return payByAlipay(amount);
            case "WeChat":
                return payByWeChat(amount);
            default:
                throw new IllegalArgumentException("不支持的支付方式");
        }
    }
}
