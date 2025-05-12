package net.ittimeline.java.core.api.lang;

/**
 * Object toString() 方法测试。
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/8 12:46
 * @since Java21
 * @see Date
 * @see Employee
 */
public class ObjectToStringTest {

    /**
     * toString() 方法测试。
     * @see Object#toString() 默认实现 将Java对象转换为字符串
     * @see Employee#toString() 重写 toString 方法，自定义输出格式。
     * @param args
     */
    public static void main(String[] args) {
        // 创建一个Employee对象，并设置其属性。
        Employee employee = new Employee("tb0001", "Tony",new Date(2025, 5, 8));
        // 打印输出employee对象，默认调用 Object 的 toString 方法输出 employee 的包名+类名@哈希码。
        // 例如：net.ittimeline.java.core.api.lang.Employee@7852e922
        // 可以通过重写 toString 方法，自定义输出格式。
        System.out.println(employee); // 隐式调用 toString 方法。会避免空指针异常
        System.out.println(employee.toString());// 显式调用 toString 方法。不会避免空指针异常
    }
}
