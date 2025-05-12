package net.ittimeline.java.core.api.lang;

/**
 * StringBuilder append()方法测试
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/11 14:43
 * @since Java21
 */
public class StringBuilderTest {
    /**
     * see StringBuilder#apppend()
     * @see StringBuilder#reverse()
     * @param args
     */
    public static void main(String[] args) {
        // 创建StringBuilder对象
        StringBuilder sb = new StringBuilder();
        // 拼接任何内容
        sb.append(10).append("年树木");
        sb.append(",");
        //链式编程：
        sb.append(100).append("百年树人");

        System.out.println(sb);

        // 反转StringBuilder对象中的内容
        StringBuilder content = new StringBuilder("Go Go Go!");
        content.reverse();
        System.out.println(content);


        //StringBuilder 转换为String
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello");
        stringBuilder.append(" World");
        String string = stringBuilder.toString();
        System.out.println(string);

    }
}
