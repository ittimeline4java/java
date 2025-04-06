package net.ittimeline.java.core.foundational.syntax.type.primitive;

/**
 * 转义字符-制表符
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/3 13:39
 * @since Java21
 */
public class CharacterTypeTab {
    public static void main(String[] args) {
        //没有使用制表符展示数据
        System.out.println("姓名年龄");
        System.out.println("tony32");
        //使用制表符展示数据
        System.out.println("姓名\t年龄");
        System.out.println("tony\t32");
    }
}

