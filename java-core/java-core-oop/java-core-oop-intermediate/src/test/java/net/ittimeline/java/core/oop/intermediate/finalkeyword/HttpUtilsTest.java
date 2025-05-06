package net.ittimeline.java.core.oop.intermediate.finalkeyword;

/**
 * final关键字修饰方法案例
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 9:42
 * @since Java21
 */
public class HttpUtilsTest {
    public static void main(String[] args) {
        HttpUtils httpUtils = new HttpUtils();
        String baseUrl = httpUtils.buildBaseUrl("https", "baidu.com", 80);
        System.out.println(baseUrl);
        boolean success = httpUtils.isSuccessResponse(200);
        System.out.println(success);
    }
}
