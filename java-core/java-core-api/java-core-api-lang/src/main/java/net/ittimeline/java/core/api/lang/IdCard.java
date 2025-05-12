package net.ittimeline.java.core.api.lang;

/**
 * 字符串案例：身份证信息查看
 * 身份证号
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/11 13:40
 * @since Java21
 */
public class IdCard {

    /**
     * 查看身份证信息
     * 身份证号 421023 1969 01 23 4567
     * 身份证号规则
     * 1，2位：省份
     * 3，4位：城市
     * 5，6位：区县
     * 7-14位数：出生年月日
     * 15，16位：所在地派出所
     * 17位：性别（奇数男性、偶数女性）
     * @see String#substring(int, int)
     * @see String#charAt(int)
     * @see String#valueOf(char)
     * @param id
     */
    public static void getInfoByIdCard(String id) {
        if (null != id && id.length() == 18) {
            System.out.println("人物信息为:");
            String year=id.substring(6, 10);
            String month=id.substring(10, 12);
            String day=id.substring(12, 14);
            System.out.printf("出生年月日：%s年%s月%s日\n", year, month,day);
            char ch = id.charAt(16);
            //字符转数字：char - 48 或者 Integer.parseInt(String.valueOf(ch))
            String gender=Integer.parseInt(String.valueOf(ch))% 2 == 0 ? "女" : "男";
            System.out.println("性别："+gender);
        }else{
            throw new IllegalArgumentException("身份证号不合法");
        }

    }
}
