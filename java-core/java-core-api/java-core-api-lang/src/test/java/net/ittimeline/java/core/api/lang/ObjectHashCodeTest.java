package net.ittimeline.java.core.api.lang;

/**
 * Object hasCode()方法测试
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/8 14:17
 * @since Java21
 */
public class ObjectHashCodeTest {

    /**
     * @see Object#hashCode() 默认实现是根据对象的内存地址生成一个哈希值
     * @see Employee#hashCode() 重写该方法，根据对象的属性生成一个哈希值
     * @param args
     */
    public static void main(String[] args) {

        Employee employee1= new Employee("tb0001", "Tony",new Date(2025, 5, 8));
        Employee employee2= new Employee("tb0001", "Tony",new Date(2025, 5, 8));

        System.out.println("employee1.equals(employee2) = " + employee1.equals(employee2));
        System.out.println("employee1.hashCode() = " + employee1.hashCode());
        System.out.println("employee2.hashCode() = " + employee2.hashCode());


    }
}
