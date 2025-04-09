package net.ittimeline.java.core.foundational.control.branch.ifelseifelsestatement;

import java.util.Scanner;

/**
 * 数字降序排序
 * 需求：提示用户从键盘输入三个整数，然后从大到小排序输出
 * 分析：先比较第一个整数和第二个整数，然后再将第三个数分别和第一个数、第二个数进行比较
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/8 15:53
 * @since Java21
 */
public class NumericSortingDesc {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入第一个整数");
        int first = scanner.nextInt();

        System.out.println("请输入第二个整数");
        int second = scanner.nextInt();

        System.out.println("请输入第三个整数");
        int third = scanner.nextInt();

        System.out.print("三个整数从大到小的顺序是：");

        //先比较第一个整数和第二个整数，然后再将第三个数分别和第一个数、第二个数进行比较
        //第一个数比第二个数大
        if (first > second) {
            //第三个数比第一个数大，那么第三个数是三个整数中最大的一个
            if (third > first) {
                System.out.printf("%d > %d > %d \n", third, first, second);
            }
            //第三个数比第二个数小，那么第三个数就是三个整数中最小的一个
            else if (third < second) {
                System.out.printf("%d > %d > %d \n", first, second, third);
            }
            //第三个数介于第一个数和第二个数的中间
            else {
                System.out.printf("%d > %d > %d \n", first, third, second);
            }
        }
        //第一个数比第二个数小
        else if (first < second) {
            //第三个数比第二个数大，那么第三个数是三个整数中最大的一个
            if (third > second) {
                System.out.printf("%d > %d > %d \n", third, second, first);
            }
            //第三个数比第一个数小，那么第三个数就是三个整数中最小的一个
            else if (third < first) {
                System.out.printf("%d > %d > %d \n", second, first, third);
            }
            //第三个数介于第二个数和第一个数的中间
            else {
                System.out.printf("%d > %d > %d \n", second, third, first);
            }
        }
        //关闭Scanner
        scanner.close();
    }
}
