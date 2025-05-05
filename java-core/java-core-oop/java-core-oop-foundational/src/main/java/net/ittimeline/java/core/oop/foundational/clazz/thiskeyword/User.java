package net.ittimeline.java.core.oop.foundational.clazz.thiskeyword;

import java.time.LocalDate;

/**
 * this关键字使用-调用构造器
 * 实体类-User
 * @author tony 18601767221@163.com
 * @version 2025/5/5 14:47
 * @since Java21
 */
public class User {

    /**
     * 姓名
     */
    String username;
    /**
     * 密码
     */
    String password;

    /**
     * 创建时间
     */
    LocalDate createTime;

    /**
     * 更新时间
     */
    LocalDate updateTime;


    /**
     * 无参构造器
     */
    public User() {
        System.out.println("空参构造方法：this.hashCode()=" + this.hashCode());
        this.username = "admin";
        this.password = "111111";
        this.createTime = LocalDate.now();
        this.updateTime = LocalDate.now();
    }


    /**
     * 有参构造器
     *
     * @param username 用户名
     * @param password 密码
     */
    public User(String username, String password) {
        //this(); 调用无参构造器
        this();
        System.out.println("有参构造方法：this.hashCode()=" + this.hashCode());
        //this关键字的作用：区分局部变量和成员变量
        //name是局部变量
        //this.name 当前对象的成员变量name
        this.username = username;

        //password是局部变量
        //this.password 表示当前对象的成员变量password
        this.password = password;
    }
    /**
     * 全参构造器
     *
     * @param name
     * @param password
     */
    public User(String name, String password, LocalDate createTime,LocalDate updateTime) {
        //this调用有参构造器
        this(name, password);
        this.createTime=createTime;
        this.updateTime=updateTime;
    }


    public void setUsername(String username) {
        System.out.println("setUsername方法：this.hashCode()="+this.hashCode());
        //this关键字的作用：区分局部变量和成员变量
        //形参username是局部变量
        //this.username 表示当前对象的成员变量
        this.username = username;
    }

    public void setPassword(String password) {
        System.out.println("setPassword方法：this.hashCode()="+this.hashCode());
        //this关键字的作用：区分局部变量和成员变量
        //形参password是局部变量
        //this.password 表示当前对象的成员变量
        this.password = password;
    }


    public void displayInfo() {
        System.out.println("用户信息如下：");
        //this访问成员变量
        System.out.println("用户名：" + this.username);
        System.out.println("用户密码：" + this.password);
        System.out.println("用户创建时间：" + this.createTime);
        System.out.println("用户更新时间：" + this.updateTime);
    }
}
