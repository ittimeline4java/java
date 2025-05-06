package net.ittimeline.java.core.oop.intermediate;
//static import导入静态成员
//PI是Math的静态变量
import static java.lang.Math.PI;
//out是System的静态变量
import static java.lang.System.out;

/**
 * import static静态导入
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/5 17:16
 * @since Java21
 */
public class ImportStaticTest {
    public static void main(String[] args) {
        out.println("圆周率是" + PI);
    }
}
