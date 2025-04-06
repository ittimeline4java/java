package net.ittimeline.java.core.foundational.syntax.type.primitive;

/**
 * boolean类型使用
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/3 14:09
 * @since Java21
 */
public class BooleanTypeUsage {
    public static void main(String[] args) {
        /********************************boolean类型字面量和变量********************************/
        //boolean类型的字面量只能是true或者false
        //boolean类型的变量只能存储true或者false

        boolean flag = true;
        System.out.println("flag = " + flag);
        flag = false;
        System.out.println("flag = " + flag);
        //不能将非布尔类型的字面量、变量赋值给布尔类型的变量
        //flag = 1;
        /********************************boolean类型使用场景********************************/

        //1.布尔类型的变量在if/else条件判断语句中使用
        boolean isGrowUp = true;
        if (isGrowUp) { //等价于 isGrowUp == true ，在Java中=表示赋值，==表示是否相等
            System.out.println("恭喜你成年了");
        } else {
            System.out.println("你还没有成年");
        }

        //2.布尔类型的字面量在while循环中使用
        while (true) {
            //每间隔一秒打印我是一个死循环并换行
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("我是一个死循环");
        }

    }
}
