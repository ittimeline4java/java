package net.ittimeline.java.core.foundational.method;

/**
 * 可变参数与方法重载案例-字符串拼接
 * 需求：按照任意分隔符拼接任意个数字符串和按任意分隔符拼接2个字符串
 * 分析：略
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/14 18:00
 * @since Java21
 */
public class StringConcatTest {
    public static void main(String[] args) {

        //按照任意分隔符拼接任意个字符串
        System.out.println(StringConcat.concat("、", "北京", "上海", "广州", "深圳", "杭州"));
        //按照任意分割符拼接两个字符串
        System.out.println(StringConcat.concat("-", "Hello", "World"));
    }
}
