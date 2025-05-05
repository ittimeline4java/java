package net.ittimeline.java.core.oop.foundational.clazz.method;

/**
 * 实例方法定义和调用
 * 实例方法调用
 * @author tony 18601767221@163.com
 * @version 2025/5/5 7:56
 * @since Java21
 */
public class InstanceMethodInvocationTest {
    public static void main(String[] args) {
        //对象创建：类名 对象名 = new 类名();
        //创建Phone对象
        //iPhone是对象名，new Phone()才是真正的Phone对象
        Phone iPhone = new Phone();
        // 对象.方法 访问对象的方法
        iPhone.call(18601752216L);
        iPhone.sendMessage(18601752216L, "你在哪?");

        //对象创建：类名 对象名 = new 类名();
        //创建Phone对象
        //huawei是对象名，new Phone()才是真正的Phone对象
        Phone huawei = new Phone();
        huawei.call(18601767221L);
        huawei.sendMessage(18601767221L, "在你家楼下?");
    }
}
