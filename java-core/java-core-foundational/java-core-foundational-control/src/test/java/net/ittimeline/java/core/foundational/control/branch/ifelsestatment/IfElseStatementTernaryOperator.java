package net.ittimeline.java.core.foundational.control.branch.ifelsestatment;

import java.util.Scanner;

/**
 * 双分支结构if else语句和三元运算符比较
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/8 10:21
 * @since Java21
 */
public class IfElseStatementTernaryOperator {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的年龄（1~120）");
        int age = scanner.nextInt();
        System.out.println("1.使用三元运算符判断年龄");
        System.out.println(age >= 18 ? "成年" : "未成年");

        System.out.println("2.使用if else语句判断");
        if (age >= 18) {
            System.out.println("成年");
        } else {
            System.out.println("未成年");
        }
        //关闭Scanner
        scanner.close();
    }
}
