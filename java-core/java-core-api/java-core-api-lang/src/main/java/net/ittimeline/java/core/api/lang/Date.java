package net.ittimeline.java.core.api.lang;

import java.util.Objects;

/**
 * 实体类-Date
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/8 12:49
 * @since Java21
 */
public class Date implements Cloneable{

    /**
     * 年份
     */
    private  int year;
    /**
     * 月份
     */
    private int month;
    /**
     * 日期（一个月的第几天）
     */
    private int day;


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    /**
     * 空参构造方法
     */
    public Date(){


    }



    /**
     * 全参构造方法
     * @param year 年份
     * @param month 月份
     * @param day 日期（一个月的第几天）
     */
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }


    /**
     * 重写父类Object类的equals方法，默认比较两个对象的地址是否相等
     * 重写比较两个对象的属性是否相等
     * @param o 对象
     * @return 是否相等 true表示相等 false表示不相等
     *
     */
    @Override
    public boolean equals(Object o) {
        // 如果传入的对象为null，或者传入对象的类型与当前对象类型不一致，直接返回false
        if (o == null || getClass() != o.getClass()) return false;
        // 将传入的对象强制转换为Date类型
        Date date = (Date) o;
        // 比较两个Date对象的属性是否相等，包括年、月、日
        // 如果三个属性都相等，则返回true，否则返回false
        return year == date.year && month == date.month && day == date.day;
    }


    /**
     * 重写父类Object类的hashCode方法
     * @return Date对象的哈希码
     */
    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    /**
     * 重写父类Object类的toString方法
     * @return 日期字符串
     */
    @Override
    public String toString() {
        return "Date{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 直接调用父类Object的clone方法，实现对象的浅拷贝
        return super.clone();
    }
}
