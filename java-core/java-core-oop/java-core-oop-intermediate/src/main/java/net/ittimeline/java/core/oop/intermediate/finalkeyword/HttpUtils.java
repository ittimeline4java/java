package net.ittimeline.java.core.oop.intermediate.finalkeyword;

/**
 * final关键字修饰方法案例
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 9:42
 * @since Java21
 */
public class HttpUtils {

    /**
     * 构建基础URL
     */
    public final  String buildBaseUrl(String protocol, String domain, int port) {
        return protocol + "://" + domain + ":" + port;
    }

    /**
     * 检查响应码是否成功
     * @param statusCode 响应码
     * @return 是否成功响应
     */
    public final boolean isSuccessResponse(int statusCode) {
        return statusCode >= 200 && statusCode < 300;
    }

}
