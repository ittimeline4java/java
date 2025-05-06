package net.ittimeline.java.core.oop.intermediate.encapsulation.constructor;

/**
 * 构造器封装案例：单例模式
 * 实体类-Singleton
 * @author tony 18601767221@163.com
 * @version 2025/5/5 17:28
 * @since Java21
 */
public class Singleton {
    /**
     * 私有静态实例
     */
    private static Singleton instance;

    /**
     * 私有构造器，禁止外部通过new实例化对象
     */
    private Singleton() {

    }

    /**
     * 公共静态方法获取唯一实例
     * synchronized关键字确保线程安全
     * @return 唯一实例
     */
    public synchronized static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
