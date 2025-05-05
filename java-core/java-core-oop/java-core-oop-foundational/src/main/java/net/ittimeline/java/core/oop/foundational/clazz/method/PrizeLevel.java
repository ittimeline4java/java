package net.ittimeline.java.core.oop.foundational.clazz.method;

/**
 * 实例方法案例-双色球
 * 枚举类-PrizeLevel
 * 双色球奖项等级枚举
 * 定义了双色球彩票的各个奖项等级及其对应奖金
 * @author tony 18601767221@163.com
 * @version 2025/5/5 8:28
 * @since Java21
 */
public enum PrizeLevel {
    /************************************类的成员-枚举实例************************************/

    /** 一等奖，奖金1000万 */
    FIRST(10000000, "一等奖"),
    /** 二等奖，奖金500万 */
    SECOND(5000000, "二等奖"),
    /** 三等奖，奖金3000元 */
    THIRD(3000, "三等奖"),
    /** 四等奖，奖金200元 */
    FOURTH(200, "四等奖"),
    /** 五等奖，奖金10元 */
    FIFTH(10, "五等奖"),
    /** 六等奖，奖金5元 */
    SIXTH(5, "六等奖"),
    /** 未中奖 */
    NONE(0, "未中奖");

    /**
     * 中奖金额
     */
    final int amount;
    /**
     * 中奖级别说明
     */
    final String description;

    /**
     * 构造方法
     * @param amount 中奖金额(单位：元)
     * @param description 中奖级别说明
     */
    PrizeLevel(int amount, String description) {
        this.amount = amount;
        this.description = description;
    }

    /************************************类的成员-getter方法************************************/

    /**
     * 获取中奖金额
     * @return 中奖金额(单位：元)
     */
    public int getAmount() {
        return amount;
    }

    /**
     * 获取中奖级别说明
     * @return 中奖级别描述
     */
    public String getDescription() {
        return description;
    }
}
