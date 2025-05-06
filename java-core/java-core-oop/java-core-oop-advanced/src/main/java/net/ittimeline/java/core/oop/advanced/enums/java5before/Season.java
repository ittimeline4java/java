package net.ittimeline.java.core.oop.advanced.enums.java5before;

/**
 * Java5之前枚举实现方式
 * 手动实现枚举
 * @author tony 18601767221@163.com
 * @version 2025/5/6 12:31
 * @since Java21
 */
public class Season {

    /********************************2.声明当前类的对象的实例变量********************************/

    /**
     * 季节名称
     */
    private final String seasonName;

    /**
     * 季节描述
     */
    private final String seasonDescription;


    /********************************1.私有化构造器********************************/

    /**
     * 私有化构造器
     */
    private Season(String seasonName, String seasonDescription) {
        this.seasonName = seasonName;
        this.seasonDescription = seasonDescription;
    }

    /********************************3.提供getter方法********************************/

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDescription() {
        return seasonDescription;
    }

    /********************************4.创建当前类的实例********************************/
    public static final Season SPRING = new Season("春天", "春暖花开");
    public static final Season SUMMER = new Season("夏天", "夏日炎炎");
    public static final Season AUTUMN = new Season("秋天", "秋高气爽");
    public static final Season WINTER = new Season("冬天", "白雪皑皑");

}
