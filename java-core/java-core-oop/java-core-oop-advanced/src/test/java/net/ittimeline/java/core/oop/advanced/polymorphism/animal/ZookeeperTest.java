package net.ittimeline.java.core.oop.advanced.polymorphism.animal;


/**
 * 多态案例：动物喂食系统
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 8:54
 * @since Java21
 */
public class ZookeeperTest {
    public static void main(String[] args) {
        // 创建一个Zookeeper对象
        Zookeeper zookeeper = new Zookeeper();

        // 创建动物对象
        // 狮子
        Animal lion = new Lion();
        // 大象
        Animal elephant = new Elephant();
        // 猴子
        Animal monkey = new Monkey();
        // 熊猫
        Animal panda = new Panda();

        // 喂食动物们
        zookeeper.feed(lion);
        zookeeper.feed(elephant);
        zookeeper.feed(monkey);
        zookeeper.feed(panda);
    }
}
