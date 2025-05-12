package net.ittimeline.java.core.api.lang;

import java.util.Scanner;

/**
 * StringBuilder案例：对称字符串
 * 需求：键盘输入一个字符串，判断该字符串是否是对称字符串，并在控制台打印是不是
 *  对称字符串：123321、111
 *  非对称字符串：123123
 * 分析：① 反转字符串  ② 和原字符串进行比较
 * @author tony 18601767221@163.com
 * @version 2025/5/11 17:16
 * @since Java21
 */
public class StringBuilderSymmetryTest {

    public static void main(String[] args) {
        // 创建Scanner对象
        // System.in表示标准输入，也就是键盘输入
        // Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String text = scanner.next();
        boolean symmetry = isSymmetry(text);
        if (symmetry){
            System.out.println("是对称字符串");
        }else {
            System.out.println("不是对称字符串");
        }

        scanner.close();

    }


    /**
     * 判断字符串是否是对称
     * @param text 字符串
     * @return true 是对称，false 不是
     */
    static boolean isSymmetry(String text){
        // 判断字符串是否为空或空字符串
        if (null == text || "".equals(text)){
            return false;
        }
        // 将字符串反转，并与原字符串比较,返回比较结果
        return new StringBuilder(text).reverse().toString().equals(text);
    }

}
