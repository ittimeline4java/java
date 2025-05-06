package net.ittimeline.java.core.oop.advanced.annotation.override;

/**
 * Override注解的使用
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 12:50
 * @since Java21
 */
public class Cat extends Animal {
    @Override //校验是否满足方法重写规则，如果不满足会编译错误
    public void eat() {
        System.out.println("小猫吃鱼");
    }
}
