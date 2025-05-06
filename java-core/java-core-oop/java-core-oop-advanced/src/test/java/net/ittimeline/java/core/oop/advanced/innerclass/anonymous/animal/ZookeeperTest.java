package net.ittimeline.java.core.oop.advanced.innerclass.anonymous.animal;

/**
 * 匿名内部类案例-方法参数是抽象类
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 12:23
 * @since Java21
 */
public class ZookeeperTest {
    public static void main(String[] args) {
        Zookeeper zookeeper = new Zookeeper();
        zookeeper.feed(new Animal() {
            @Override
            public void eat() {
                System.out.println("熊猫吃竹子");
            }
        });

        zookeeper.feed(new Animal() {
            @Override
            public void eat() {
                System.out.println("狗吃骨头");
            }
        });

        zookeeper.feed(
                new Animal() {
                    @Override
                    public void eat() {
                        System.out.println("小猫吃鱼");
                    }
                });
    }

}
