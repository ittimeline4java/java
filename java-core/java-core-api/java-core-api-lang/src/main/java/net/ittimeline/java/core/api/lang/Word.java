package net.ittimeline.java.core.api.lang;

/**
 *
 * 字符串案例：敏感词替换
 *
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/11 14:01
 * @since Java21
 */
public class Word {

    /**
     * 敏感词列表
     */
    private static final String[] WORDS = {"TMD", "卧槽","你大爷","我日","尼玛","CNM"};

    /**
     * 敏感词替换
     * @param text 敏感词文本
     * @return 敏感词替换后的字符串
     * @see String#replace(CharSequence, CharSequence) 替换字符串
     * @see String#replaceAll(String, String)  正则表达式替换字符串
     */
    public static String desensitization(String text){
        // 判断输入的文本是否不为空
        if (null != text && !"".equals(text)) {
            // 遍历敏感词数组
            for (int i = 0; i < WORDS.length; i++) {
                // 使用正则表达式替换敏感词为"***"
                text = text.replaceAll(WORDS[i], "***");
            }
        }
        // 返回替换后的文本
        return text;
    }



}
