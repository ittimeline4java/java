package net.ittimeline.java.core.api.lang;

/**
 * 包装类取值范围
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/9 14:17
 * @since Java21
 */
public class WrapperClassLimitTest {
    /**
     * @param args
     * @see Byte#MAX_VALUE
     * @see Byte#MIN_VALUE
     * @see Short#MAX_VALUE
     * @see Short#MIN_VALUE
     * @see Character#MAX_VALUE
     * @see Character#MIN_VALUE
     * @see Integer#MAX_VALUE
     * @see Integer#MIN_VALUE
     * @see Long#MAX_VALUE
     * @see Long#MIN_VALUE
     * @see Float#MAX_VALUE
     * @see Float#MIN_VALUE
     * @see Double#MAX_VALUE
     * @see Double#MIN_VALUE
     */
    public static void main(String[] args) {
        //byte对应的包装类是Byte
        //调用Byte的静态常量（MAX_VALUE,MIN_VALUE)获取byte类型的取值范围
        //调用Byte的静态常量BYTES获取byte类型占据的字节数
        System.out.println("byte所能存储的最大值是" + Byte.MAX_VALUE +
                " byte所能存储的最小值是" + Byte.MIN_VALUE + " byte占据的内存空间是" + Byte.BYTES + "字节");


        //short对应的包装类是Short
        //调用Short的常量（MAX_VALUE,MIN_VALUE)获取byte类型的取值范围
        //调用Short的静态常量BYTES获取short类型占据的字节数
        System.out.println("short所能存储的最大值是" + Short.MAX_VALUE +
                " short所能存储的最小值是" + Short.MIN_VALUE + " short占据的内存空间是" + Short.BYTES + "字节");


        //char对应的包装类是Character
        //调用Character的静态常量（MAX_VALUE,MIN_VALUE)获取byte类型的取值范围
        //调用Character的静态常量BYTES获取char类型占据的字节数
        System.out.println("char所能存储的最大值是" + Character.MAX_VALUE +
                " char所能存储的最小值是" + Character.MIN_VALUE + " char占据的内存空间是" + Character.BYTES + "字节");

        //int对应的包装类是Integer
        //调用Integer的静态常量（MAX_VALUE,MIN_VALUE)获取int类型的取值范围
        //调用Integer的静态常量BYTES获取int类型占据的字节数
        System.out.println("int所能存储的最大值是" + Integer.MAX_VALUE +
                " int所能存储的最小值是" + Integer.MIN_VALUE + "int占据的内存空间是" + Integer.BYTES + "字节");


        //long对应的包装类是Long
        //调用Long的静态常量（MAX_VALUE,MIN_VALUE)获取long类型的取值范围
        //调用Long的静态常量BYTES获取long类型占据的字节数
        System.out.println("long所能存储的最大值是" + Long.MAX_VALUE +
                " long所能存储的最小值是" + Long.MIN_VALUE + " long占据的内存空间是" + Long.BYTES + "字节");


        //float对应的包装类是Float
        //调用Float的静态常量（MAX_VALUE,MIN_VALUE)获取float类型的取值范围
        //调用Float的静态常量BYTES获取float类型占据的字节数
        System.out.println("byte所能存储的最大值是" + Float.MAX_VALUE +
                " byte所能存储的最小值是" + Float.MIN_VALUE + " byte占据的内存空间是" + Float.BYTES + "字节");


        //double对应的包装类是Double
        //调用Double的静态常量（MAX_VALUE,MIN_VALUE)获取double类型的取值范围
        //调用Double的静态常量BYTES获取double类型占据的字节数
        System.out.println("double所能存储的最大值是" + Double.MAX_VALUE +
                " double所能存储的最小值是" + Double.MIN_VALUE + " double占据的内存空间是" + Double.BYTES + "字节");

    }
}
