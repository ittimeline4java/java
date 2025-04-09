package net.ittimeline.java.core.foundational.control.branch.switchstatement;

import java.util.Scanner;

/**
 * switch语句和if else if else语句对比
 * 需求：根据用户输入的分数判断所在区间的等级
 * 90-100 等级A
 * 80-89 等级B
 * 70-79 等级C
 * 60-69 等级D
 * 0-59 等级E
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/8 18:33
 * @since Java21
 */
public class SwitchIfElseIfElseStatement {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入考试成绩（0~100）");
        int score = scanner.nextInt();
        System.out.println("考试成绩是" + score);
        //考试成绩必须在[0,100]
        if (score >= 0 && score <= 100) {
            System.out.println("********************************基于if else if else语句实现********************************");
            if (score >= 90) {
                System.out.println("等级A");
            } else if (score >= 80) {
                System.out.println("等级B");
            } else if (score >= 70) {
                System.out.println("等级C");
            } else if (score >= 60) {
                System.out.println("等级D");
            } else {
                System.out.println("等级E");
            }
            System.out.println("********************************基于switch语句实现********************************");
            score /= 10;
            switch (score) {
                case 10:
                case 9:
                    System.out.println("等级A");
                    break;
                case 8:
                    System.out.println("等级B");
                    break;
                case 7:
                    System.out.println("等级C");
                    break;
                case 6:
                    System.out.println("等级D");
                    break;
                default:
                    System.out.println("等级E");
            }

        } else {
            System.out.println("考试成绩输入有误");
        }
    }
}
