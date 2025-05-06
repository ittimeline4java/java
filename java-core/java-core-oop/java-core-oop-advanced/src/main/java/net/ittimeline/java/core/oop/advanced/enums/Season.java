package net.ittimeline.java.core.oop.advanced.enums;

/**
 * 季节枚举
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 12:33
 * @since Java21
 */
public enum Season {
    //常量对象列表
    //1.必须在枚举类的开头声明多个对象，对象之间使用逗号隔开，最后一个对象后面使用分号结束
    SPRING("春天", "穿暖花开"),
    SUMMER("夏天", "夏日炎炎"),
    AUTUMN("秋天", "秋高气爽"),
    WINTER("冬天", "白雪皑皑");

    //对象的实例变量列表
    //2.声明当前类的对象的实例变量，使用private final修饰
    private final String seasonName;
    private final String seasonDescription;

    /**
     * 3.私有构造器
     *
     * @param seasonName        季节名称
     * @param seasonDescription 季节描述
     */
    private Season(String seasonName, String seasonDescription) {
        this.seasonName = seasonName;
        this.seasonDescription = seasonDescription;
    }

    //4.getter方法

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDescription() {
        return seasonDescription;
    }


}
