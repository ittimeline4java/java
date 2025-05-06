package net.ittimeline.java.core.oop.intermediate.finalkeyword;

/**
 * final关键字修饰静态变量案例
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 9:40
 * @since Java21
 */
public class User {
    private String userName;

    private String password;

    public User() {
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    /**
     * 登录
     * @return true 登录成功 false 登录失败
     */
    public boolean login() {
        // 检查用户名和密码是否与默认设置匹配
        if (userName.equals(AppConfig.DEFAULT_USER_NAME) && password.equals(AppConfig.DEFAULT_PASSWORD)) {
            // 如果匹配，返回true
            return true;
        } else {
            // 如果不匹配，返回false
            return false;
        }
    }


}
