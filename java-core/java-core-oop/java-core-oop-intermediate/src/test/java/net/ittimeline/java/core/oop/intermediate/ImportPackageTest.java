package net.ittimeline.java.core.oop.intermediate;


import java.util.Date;

/**
 * import导包
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/5 17:11
 * @since Java21
 */
public class ImportPackageTest {
    public static void main(String[] args) {
        //使用import方式
        Date utilDate = new Date();
        //使用全类名方式
        java.sql.Date sqlDate = new java.sql.Date(System.currentTimeMillis());
    }

}
