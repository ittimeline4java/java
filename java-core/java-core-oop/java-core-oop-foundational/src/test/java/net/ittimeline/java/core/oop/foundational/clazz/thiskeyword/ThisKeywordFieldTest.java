package net.ittimeline.java.core.oop.foundational.clazz.thiskeyword;

/**
 * this关键字使用
 * 测试类-ThisKeywordFieldTest
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/5 14:52
 * @since Java21
 */
public class ThisKeywordFieldTest {

    /**
     *
     * @param args 命令行参数
     * @see Object#hashCode()  返回对象的哈希值，哈希值根据对象的内存地址计算得出
     */
    public static void main(String[] args) {
        //空参构造方法
        User userWithoutArgs = new User();
        System.out.println("userWithoutArgs.hashCode() = " + userWithoutArgs.hashCode());
        //有参构造方法
        User userWithArgs = new User("tony", "666666");
        System.out.println("userWithArgs.hashCode()= " + userWithArgs.hashCode());


        User user =new User();
        user.setUsername("jack");
        user.setPassword("888888");
        System.out.println("user.hashCode() = " + user.hashCode());
    }
}
