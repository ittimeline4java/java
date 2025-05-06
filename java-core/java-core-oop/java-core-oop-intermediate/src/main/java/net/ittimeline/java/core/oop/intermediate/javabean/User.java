package net.ittimeline.java.core.oop.intermediate.javabean;

import java.io.Serializable;

/**
 * JavaBean示例
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/5 17:33
 * @since Java21
 */
public class User implements Serializable {
    // 私有属性
    private String name;
    private int age;

    // 无参构造方法
    public User() {
    }

    // 带参构造方法（可选）
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter 和 Setter 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 重写 toString 方法（可选）
    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + "}";
    }
}
