package net.ittimeline.java.core.oop.foundational.clazz.field;

/**
 * 成员变量案例-商品类与对象
 * 需求：做一个商品信息管理系统，目前需要展示的是商品的编号、名称、价格、库存等信息，请设计商品类，并创建几个商品对象来展示其信息
 * 分析：略
 * 测试类
 * @author tony 18601767221@163.com
 * @version 2025/5/5 7:36
 * @since Java21
 */
public class ProductTest {
    public static void main(String[] args) {
        Product javaBook = new Product();
        javaBook.id = "13122155";
        javaBook.title = "Java语言核心技术";
        javaBook.price = 162.26;
        javaBook.stock = 2000;


        Product goBook = new Product();
        goBook.id = "13521160";
        goBook.title = "Go语言设计与实现";
        goBook.price = 69.90;
        goBook.stock = 10000;

        //打印标题
        System.out.println("商品编号\t\t\t\t商品名称\t\t\t\t\t商品价格\t\t\t商品库存");
        //打印输出两个Product对象的属性值
        System.out.println(javaBook.id + "\t\t\t" + javaBook.title + "\t\t\t" + javaBook.price + "\t\t\t" + javaBook.stock);
        System.out.println(goBook.id + "\t\t\t" + goBook.title + "\t\t\t" + goBook.price + "\t\t\t" + goBook.stock);
    }
}
