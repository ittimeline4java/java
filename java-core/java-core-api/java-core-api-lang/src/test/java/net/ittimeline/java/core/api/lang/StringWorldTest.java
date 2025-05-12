package net.ittimeline.java.core.api.lang;

/**
 * 字符串案例：敏感词替换
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/11 14:06
 * @since Java21
 */
public class StringWorldTest {
    public static void main(String[] args) {
        String talk = "卧槽，今天天气不错，我日TMD";
        String replaceTalk = Word.desensitization(talk);
        System.out.println("敏感词替换之前："+talk);
        System.out.println("敏感词替换之后："+replaceTalk);
    }
}
