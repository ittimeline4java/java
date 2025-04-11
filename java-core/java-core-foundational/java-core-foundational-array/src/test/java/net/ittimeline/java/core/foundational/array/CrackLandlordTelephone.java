package net.ittimeline.java.core.foundational.array;

/**
 * 破解房东电话
 * 需求：爱博家园单间短期出租 6 个月， 3550 元/月（水电煤公摊，网费 100 元/月），空调、卫生间、厨房齐全。
 * 屋内均是 IT 行业人士，喜欢安静。所以要求来租者最好是同行或者刚毕业的年轻人，爱干净、安静。
 * 根据以下程序破解房东电话号码
 * 分析：略
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/10 11:31
 * @since Java21
 */
public class CrackLandlordTelephone {
    public static void main(String[] args) {
        //手机号的数字列表
        int[] phoneNumbers = {1, 8, 6, 0, 7, 2, 1};
        ///手机号数字的索引列表
        int[] phoneNumberIndexes = {0, 1, 2, 3, 0, 4, 2, 4, 5, 5, 6};
        String phoneNumber = "";
        System.out.print("房东的电话号码是");
        for (int i = 0; i < phoneNumberIndexes.length; i++) {
            //phoneNumberIndexes[i] 表示所有手机号数字对应的索引
            //phoneNumbers[phoneNumberIndexes[i]] 表示手机号每个数字
            phoneNumber += phoneNumbers[phoneNumberIndexes[i]];
        }
        System.out.println(phoneNumber);
    }
}
