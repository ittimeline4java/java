package net.ittimeline.java.core.oop.foundational.clazz.method;

import java.util.Scanner;

/**
 * 实例方法案例：购物车系统
 * 需求：设计一个简单的购物车系统，要求用户登录之后，才能添加商品到购物车，并查看购物车商品
 * 分析：
 *  用户有用户名和密码两个属性用于登录，还有个登录方法
 *  商品有名称和价格两个属性用于购物车展示
 *  购物车有商品列表和索引两个属性用于存储商品，还有添加商品和展示商品两个方法
 * 测试类-ShoppingCartTest
 * @author tony 18601767221@163.com
 * @version 2025/5/5 8:17
 * @since Java21
 */
public class ShoppingCartTest {
    public static void main(String[] args) {
        //创建用户：模拟正确的用户名和密码
        UserInfo userInfo = new UserInfo();
        userInfo.userName = "test";
        userInfo.password = "123456";

        //键盘输入用户名和密码
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        String inputUserName = scanner.next();
        System.out.println("请输入密码");
        String inputPassword = scanner.next();
        //关闭Scanner
        scanner.close();
        //判断用户是否等成功
        boolean isSuccess = userInfo.login(inputUserName, inputPassword);
        //用户登录成功后，才能添加商品到购物车以及显示购物车的商品信息
        if (isSuccess) {
            System.out.println("用户登录成功");

            //创建购物车
            ShoppingCart shoppingCart = new ShoppingCart();

            //创建一些商品
            Product product1 = new Product();
            product1.name = "iPhone16 Pro Max";
            product1.price = 13999;

            Product product2 = new Product();
            product2.name = "MacBook Pro";
            product2.price = 46999;

            //添加商品到购物车
            shoppingCart.addProduct(product1);
            shoppingCart.addProduct(product2);

            //显示购物车的商品信息
            shoppingCart.displayShoppingCart();
        } else {
            System.out.println("用户名或密码错误，登录失败");
        }
    }
}
