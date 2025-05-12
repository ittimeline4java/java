package net.ittimeline.java.core.api.lang;

/**
 * 字符串案例：金额转换
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/11 12:57
 * @since Java21
 */
public class AmountConversion {


    /**
     * 大写金额数组
     */
    private static final String[] amountArray = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};

    /**
     * 单位数组
     */
    private static final String[] unitArray = {"仟","佰", "拾", "万", "仟", "佰", "拾", "元"};


    /**
     * 金额转换  支持0-99999999
     *
     * @param amount 整数金额
     * @return  金额大写字符串
     */
    public static String amountConversion(int amount) {
        String result = "";

        String capitalNumber = "";
        //校验金额是否在0-99999999之间
        if (amount >= 0 && amount <= 9999_9999) {
            //1.获取金额的每个数字，并将金额数字转换为金额大写
            while (true) {
                int number = amount % 10;
                capitalNumber = getCapitalNumber(number) + capitalNumber;
                amount = amount / 10;

                if (amount == 0) {
                    break;
                }
            }
            //2.补零：将不足9999 9999的金额前面补零
            int count = unitArray.length - capitalNumber.length();
            for (int i = 0; i < count; i++) {
                capitalNumber = "零" + capitalNumber;
            }
            //3.补单位：将金额大写加上对应的单位
            for (int i = 0; i < capitalNumber.length(); i++) {
                result += capitalNumber.charAt(i) + unitArray[i];
            }

        } else {
            System.out.println("金额" + amount + "超过有效范围");
        }
        return result;
    }

    /**
     * 将数字转换为大写金额
     *
     * @param number
     * @return
     */
    private static String getCapitalNumber(int number) {
        return amountArray[number];
    }
}
