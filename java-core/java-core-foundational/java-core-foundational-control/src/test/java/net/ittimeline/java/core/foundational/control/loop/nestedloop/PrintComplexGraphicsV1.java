package net.ittimeline.java.core.foundational.control.loop.nestedloop;

/**
 * 打印复杂图形
 * 需求：打印复杂图形，效果如下图所示
 * $ # $ # $
 * # $ # $ #
 * $ # $ # $
 * # $ # $ #
 * $ # $ # $
 * 分析：整体来看25个符号中奇数是$ ，偶数是#
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/9 15:50
 * @since Java21
 */
public class PrintComplexGraphicsV1 {
    public static void main(String[] args) {
        int count = 0;
        //外层循环控制行数
        for (int i = 1; i <= 5; i++) {
            //内层循环控制每行的列数
            for (int j = 1; j <= 5; j++) {
                count++;
                //偶数是#
                if (count % 2 == 0) {
                    System.out.print("# ");
                }
                //奇数是*
                else {
                    System.out.print("$ ");
                }
                //每行显示5个
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
