package net.ittimeline.java.core.api.util;

import java.util.Objects;

/**
 * 抛出空指针异常
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/8 17:11
 * @since Java21
 */
public class ObjectsNPETest {
    /**
     * @see Objects#requireNonNull(Object, String)  如果对象为空，该方法会抛出空指针异常
     * @param args
     */
    public static void main(String[] args) {
        String str=null;
        System.out.println("Objects.requireNonNull(str,字符串不能为空) = " + Objects.requireNonNull(str, "字符串不能为空"));
    }
}
