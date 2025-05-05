package net.ittimeline.java.core.oop.foundational.clazz.field;

/**
 * 成员变量访问测试用例
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/5 7:34
 * @since Java21
 */
public class FieldTest {
    public static void main(String[] args) {
        //类的实例化/创建类的对象/创建类的实例
        //对象创建：ClassName objectName = new ClassName([arguments]);
        //创建Phone对象
        //iphone是对象名，new Phone()才是真正的Phone对象
        Phone iphone = new Phone();
        //对象.属性 访问对象的属性
        //属性赋值
        iphone.modelName = "iPhone 16 pro max";
        iphone.brand = "苹果";
        iphone.price = 11999.0;
        iphone.color = "黑色";


        System.out.println("********************************苹果手机信息：********************************");
        //对象.属性 访问对象的属性
        //字符串拼接打印输出属性值
        System.out.println("型号名称：" + iphone.modelName);
        System.out.println("品牌：" + iphone.brand);
        System.out.println("价格：" + iphone.price);
        System.out.println("颜色：" + iphone.color);
        System.out.println("电池容量：" + iphone.batteryCapacity);
        System.out.println("是否有NFC：" + iphone.hasNFC);
    }
}
