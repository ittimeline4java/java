package net.ittimeline.java.core.foundational.control.loop.nestedloop;

/**
 * 需求：打印5行5列的星星(*)
 * * * * * *
 * * * * * *
 * * * * * *
 * * * * * *
 * * * * * *
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/9 15:19
 * @since Java21
 */
public class NestedLoop {
    public static void main(String[] args) {
        //①单层循环实现一行五列
        System.out.println("********************************1.单层循环实现一行五列********************************");
        for (int i = 0; i < 5; i++) {
            System.out.print("* ");
        }
        //一行打印完成后换行
        System.out.println();


        //②嵌套循环实现五行五列
        System.out.println("********************************2.嵌套循环实现五行五列********************************");
        //外层循环控制行数
        for (int i = 0; i < 5; i++) {
            //内层循环控制每行的列数
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            //每一行打印完成后换行
            System.out.println();
        }
    }
}
