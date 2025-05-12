package net.ittimeline.java.core.api.lang;

/**
 * Object equals() 方法测试
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/8 13:28
 * @since Java21
 */
public class ObjectEqualsTest {
    /**
     * @see Object#equals(Object) 判断两个对象是否相等，true 表示相等，false 表示不相等  默认使用== 比较内存地址
     * @param args
     */
    public static void main(String[] args) {
        Employee employee1= new Employee("tb0001", "Tony",new Date(2025, 5, 8));
        Employee employee2= new Employee("tb0001", "Tony",new Date(2025, 5, 8));
        System.out.println("employee1 == employee2 = " + (employee1 == employee2));
        System.out.println("employee1.equals(employee2) = " + employee1.equals(employee2));
    }
}
