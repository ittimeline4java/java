package net.ittimeline.java.core.oop.foundational.clazz.method;

/**
 * 实例方法案例：购物车系统
 * 实体类-ShoppingCart
 * @author tony 18601767221@163.com
 * @version 2025/5/5 8:16
 * @since Java21
 */
public class ShoppingCart {
    /************************************类的成员-成员变量************************************/

    /**
     * 商品列表
     * 购物车最多添加100件商品
     */
    Product[] productList = new Product[100];

    /**
     * 商品索引
     */
    int index;

    /************************************类的成员-成员方法-实例方法************************************/

    /**
     * 添加商品到购物车
     *
     * @param product 商品
     */
    public void addProduct(Product product) {
        productList[index] = product;
        index++;
        System.out.println(product.name + "成功添加到购物车");
    }

    /**
     * 显示购物车的商品信息
     */
    public void displayShoppingCart() {
        if (null==productList  || productList.length == 0) {
            System.out.println("当前购物车为空");
        } else {
            System.out.println("******************购物车商品明细如下******************");
            System.out.printf("%-36s%-36s\n", "商品名称", "商品价格");
            for (int i = 0; i < productList.length; i++) {
                Product product = productList[i];
                if (null != product) {
                    System.out.printf("%-36s %-36.0f\n", product.name, product.price);
                }
            }
        }
    }

}
