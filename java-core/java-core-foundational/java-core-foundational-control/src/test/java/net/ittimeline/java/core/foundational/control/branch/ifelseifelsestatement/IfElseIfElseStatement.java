package net.ittimeline.java.core.foundational.control.branch.ifelseifelsestatement;

import java.util.Scanner;

/**
 * 多分支结构if else if else使用
 * 需求：根据用户输入考试成绩的分数奖励不同的物品
 * ● 如果成绩为100分，奖励一台小米SU7 Ultra
 * ● 如果成绩为[90,99]，奖励一台MacBook Pro 16
 * ● 如果成绩为[80,89]，奖励一台iPad Pro 12.9
 * ● 其他时，一顿竹笋炒肉
 * 分析：略
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/8 14:17
 * @since Java21
 */
public class IfElseIfElseStatement {
    public static void main(String[] args) {
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入考试成绩");
        int score = scanner.nextInt();

        System.out.println("********************************实现方式1********************************");
        if (score == 100) {
            System.out.println("奖励一台小米SU7 Ultra");
        } else if (score >= 90) {
            System.out.println("奖励一台MacBook Pro 16");
        } else if (score >= 80) {
            System.out.println("奖励一台iPad Pro 12.9");
        } else {
            System.out.println("竹笋炒肉一顿");
        }
        System.out.println("********************************实现方式2********************************");
        if (score == 100) {
            System.out.println("奖励一台小米SU7 Ultra");
        } else if (score >= 90 && score <= 99) {
            System.out.println("奖励一台MacBook Pro 16");
        } else if (score >= 80 && score <= 89) {
            System.out.println("奖励一台iPad Pro 12.9");
        } else {
            System.out.println("竹笋炒肉一顿");
        }
        //关闭Scanner
        scanner.close();
    }
}
