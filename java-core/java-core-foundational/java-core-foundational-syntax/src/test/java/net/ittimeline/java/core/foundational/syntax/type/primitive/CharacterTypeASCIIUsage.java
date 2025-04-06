package net.ittimeline.java.core.foundational.syntax.type.primitive;

/**
 * ASCII字符集使用
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/3 12:47
 * @since Java21
 */
public class CharacterTypeASCIIUsage {
    public static void main(String[] args) {
        //ASCII字符集字符类型字面量三种表示方式
        //方式1：使用一对单引号('')包含的单个字符
        //测试数据：小写字母a
        System.out.println("小写字母a的三种表示方式");
        char lowerCaseWay1 = 'a';
        System.out.println("lowerCaseWay1 = " + lowerCaseWay1);

        //方式2：用十进制的Unicode编码值
        char lowerCaseWay2 = 97;
        System.out.println("lowerCaseWay2 = " + lowerCaseWay2);

        //方式3：使用十六进制Unicode编码值表示
        char lowerCaseWay3 = '\u0061';
        System.out.println("lowerCaseWay3 = " + lowerCaseWay3);

        //测试数据：大写字母A
        System.out.println("大写字母A的三种表示方式");
        char upperCaseWay1 = 'A';
        System.out.println("upperCaseWay1 = " + upperCaseWay1);
        char upperCaseWay2 = 65;
        System.out.println("upperCaseWay2 = " + upperCaseWay2);
        char upperCaseWay3 = '\u0041';
        System.out.println("upperCaseWay3 = " + upperCaseWay3);

        //测试数据：字符'0'
        System.out.println("字符0的三种表示方式");
        char zeroWay1 = '0';
        System.out.println("zeroWay1 = " + zeroWay1);
        char zeroWay2 = 48;
        System.out.println("zeroWay2 = " + zeroWay2);
        char zeroWay3 = '\u0030';
        System.out.println("zeroWay3 = " + zeroWay3);
    }
}
