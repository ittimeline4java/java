package net.ittimeline.java.core.foundational.control.loop.infiniteloop;

import java.util.Random;
import java.util.Scanner;

/**
 * 猜字母游戏
 * 需求：让用户猜随机生成的字母，如果猜中了就结束游戏，如果没有猜中就继续（重复）猜，但是继续猜的前提是猜的次数小于等于5次(5次机会)，字母分大写字母和小写字母，由于还没有学数组，我们目前将大写字母和小写字母分开猜。
 * 分析
 * ● 随机生成大写字母和小写字母
 * ● 让用户选择猜大写字母还是小写字母
 * ● 将用户猜的字母和随机生成的字母进行比较
 * a.  如果用户猜的字母比电脑随机生成的字母更大，那么提示用户 你猜的字母太大了
 * b.  如果用户猜的字母比电脑随机生成的字母更小，那么提示用户 你猜的字母太小了
 * c.  如果用户猜的字母和电脑随机生成的字母相同，那么提示用户 恭喜你猜对了，然后结束游戏
 * ● 控制用户猜字母的次数，如果等于5次就结束游戏
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/9 13:32
 * @since Java21
 */
public class GuessLetter {
    public static void main(String[] args) {
        Random random = new Random();
        //创建Scanner对象
        //System.in表示标准输入，也就是键盘输入
        //Scanner对象可以扫描用户从键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎来到猜字母游戏！");
        System.out.println("请选择猜大写字母还是小写字母");
        System.out.println("1.猜大写字母");
        System.out.println("2.猜小写字母");
        int selection = scanner.nextInt();
        if (selection == 1) {
            //随机生成大写字母
            char randomUpper = (char) (random.nextInt(26) + 'A');
            int count = 5;
            while (count > 0) {
                System.out.println("请输入你猜的大写字母");
                char inputUpper = scanner.next().charAt(0);
                count--;
                if (inputUpper > randomUpper) {
                    System.out.println("你猜的大写字母太大了，还剩" + count + "次机会");
                } else if (inputUpper < randomUpper) {
                    System.out.println("你猜的大写字母太小了，还剩" + count + "次机会");
                } else {
                    System.out.println("恭喜你猜中了，随机生成的大写字母是" + randomUpper);
                    break;
                }
                if (count == 0) {
                    System.out.println("5次机会都用完了，程序即将退出，随机生成的大写字母是" + randomUpper);
                    break;
                }
            }
        } else if (selection == 2) {
            //随机生成小写字母
            char randomLower = (char) (random.nextInt(26) + 'a');
            int count = 5;
            while (count > 0) {
                System.out.println("请输入你猜的小写字母");
                char inputLower = scanner.next().charAt(0);
                count--;
                if (inputLower > randomLower) {
                    System.out.println("你猜的小写字母太大了，还剩" + count + "次机会");
                } else if (inputLower < randomLower) {
                    System.out.println("你猜的小写字母太小了，还剩" + count + "次机会");
                } else {
                    System.out.println("恭喜你猜中了，随机生成的小写字母是" + randomLower);
                    break;
                }
                if (count == 0) {
                    System.out.println("5次机会都用完了，程序即将退出，随机生成的小写字母是" + randomLower);
                    break;
                }
            }
        } else {
            System.out.println("你的输入有误！！！");
        }
        //关闭Scanner
        scanner.close();
    }
}
