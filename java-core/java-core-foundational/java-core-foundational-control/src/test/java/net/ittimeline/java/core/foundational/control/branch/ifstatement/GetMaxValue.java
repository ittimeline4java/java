package net.ittimeline.java.core.foundational.control.branch.ifstatement;

import java.util.Scanner;

/**
 * 求三个整数的最大值
 * 需求：提示用户从键盘输入三个整数，求三个整数的最大值
 * 分析：先求两个整数的最大值，再求三个整数的最大值
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/8 9:48
 * @since Java21
 */
public class GetMaxValue {
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

        //①先求两个数的最大值
        //假设第一个数是最大值
        int max = first;
        //如果第二个值比第一个值大
        if (second > max) {
            //将第二个值赋值给最大值
            max = second;
        }

        //②再求三个数的最大值
        //如果第三个值比最大值还大
        if (third > max) {
            //将第三个值赋值给max
            max = third;
        }

        System.out.printf("三个整数%d、%d、%d的最大值是%d \n", first, second, third, max);


        //关闭Scanner
        scanner.close();
    }
}
