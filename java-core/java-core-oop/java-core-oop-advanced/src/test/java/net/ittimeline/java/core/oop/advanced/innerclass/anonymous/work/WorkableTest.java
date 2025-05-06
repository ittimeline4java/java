package net.ittimeline.java.core.oop.advanced.innerclass.anonymous.work;

/**
 * 方法参数是接口
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 12:29
 * @since Java21
 */
public class WorkableTest {
    public static void main(String[] args) {
        // 创建一个匿名内部类，实现Workable接口，并重写work方法
        Workable developer = new Workable() {
            @Override
            public void work() {
                // 输出“程序员写代码”
                System.out.println("程序员写代码");
            }
        };

        // 调用developer对象的work方法
        developer.work();

        // 创建一个新的匿名内部类，实现Workable接口，并重写work方法
        new Workable() {
            @Override
            public void work() {
                // 输出“项目经理管理项目”
                System.out.println("项目经理管理项目");
            }
        }.work();

    }

}
