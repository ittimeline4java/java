package net.ittimeline.java.core.oop.intermediate.codeblock;

/**
 * 静态代码块
 * 实体类-Product
 * @author tony 18601767221@163.com
 * @version 2025/5/5 17:46
 * @since Java21
 */
public class Product {
    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品价格
     */
    private double price;


    public static String countryOfOrigin;

    //静态代码块
    //作用：初始化
    static {
        System.out.println("静态代码块执行了");
        countryOfOrigin = "中国";
        System.out.println("产地：" + countryOfOrigin);
    }



    //构造代码块
    //写在成员位置的代码块
    //作用：抽取构造方法中重复的代码
    //执行时机：调用任意构造方法时，最先执行
    {
        //System.out.println("开始创建商品对象");
    }


    private void initDesc() {
        System.out.println("开始创建商品对象");
    }

    public Product() {
        initDesc();
        System.out.println("开始执行空参构造器");
    }


    public Product(String name, double price) {
        initDesc();
        System.out.println("开始执行有参构造器");
        this.name = name;
        this.price = price;
    }
}
