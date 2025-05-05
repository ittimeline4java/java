package net.ittimeline.java.core.oop.foundational.clazz.method;

/**
 * 实例方法案例：卖机票
 * 实体类-Ticket
 * @author tony 18601767221@163.com
 * @version 2025/5/5 8:09
 * @since Java21
 */
public class Ticket {

    /************************************类的成员-成员变量************************************/
    /**
     * 机票原价
     */
    double originalPrice;

    /**
     * 月份
     */
    int month;

    /**
     * 舱位
     */
    String cabinClass;
    /************************************类的成员-成员方法-实例方法************************************/

    /**
     * 根据不同的折扣计算价格
     *
     * @return 根据不同的折扣计算价格
     */
    public double calculateDiscountPrice() {
        double discount = getDiscount();
        return originalPrice * discount;
    }

    /**
     * 根据不同的仓位和月份计算折扣
     *
     * @return 折扣
     */
    private double getDiscount() {
        double discount = 1.0;
        if (cabinClass.equals("first")) {
            if (month >= 5 && month <= 10) {
                // 旺季头等舱9折
                discount = 0.9;
            } else {
                // 淡季头等舱7折
                discount = 0.7;
            }
        } else if (cabinClass.equals("economy")) {
            if (month >= 5 && month <= 10) {
                // 旺季经济舱8.5折
                discount = 0.85;
            } else if (month >= 4 && month <= 11) {
                // 淡季经济舱6.5折
                discount = 0.65;
            }
        }
        return discount;
    }

}
