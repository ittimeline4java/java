package net.ittimeline.java.core.foundational.control.loop.nestedloop;

/**
 * 百鸡百钱
 * 需求：百鸡百钱：花光100文钱买100只鸡
 * 公鸡 5文钱一只 最少0只，最多20只
 * 母鸡 3文钱一只 最少0只，最多33只
 * 小鸡 1文钱三只 最多100只
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/9 16:11
 * @since Java21
 */
public class HundredCoins4HundredChickens {
    public static void main(String[] args) {
        //公鸡 5文钱一只 最少0只，最多20只
        for (int roosterCount = 0; roosterCount <= 20; roosterCount++) {
            // 母鸡 3文钱一只 最少0只，最多33只
            for (int henCount = 0; henCount <= 33; henCount++) {
                //小鸡 1文钱三只
                //小鸡的数量
                int chickCount = 100 - roosterCount - henCount;
                //小鸡的钱
                int chickCoins = chickCount / 3;
                //百鸡： 公鸡的数量+母鸡的数量+小鸡的数量=100只 并且小鸡的数量必须是3的倍数
                boolean isHundredChicken = roosterCount + henCount + chickCount == 100 && chickCount % 3 == 0;
                //百钱：公鸡的数量*5+母鸡的数量*3+小鸡的数量/3=100文钱
                boolean isHundredCoins = roosterCount * 5 + henCount * 3 + chickCoins == 100;
                if (isHundredChicken && isHundredCoins) {
                    System.out.printf("公鸡的数量是%d 母鸡的数量是%d 小鸡的数量是%d\n", roosterCount, henCount, chickCount);
                }
            }
        }
    }
}
