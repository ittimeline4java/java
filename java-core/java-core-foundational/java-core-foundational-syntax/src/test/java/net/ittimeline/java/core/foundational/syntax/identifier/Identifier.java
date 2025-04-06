package net.ittimeline.java.core.foundational.syntax.identifier;

/**
 * 标识符使用
 *
 * @author tony 18601767221@163.com
 * @version 2025/4/2 15:29
 * @since Java21
 */
public class Identifier {
}

/********************************类的命名规则和命名规范********************************/
class UserInfo {

    /********************************常量的命名规则和命名规范********************************/
    public static final String DEFAULT_PASSWORD = "111111";

    /********************************属性（成员变量）的命名规则和命名规范********************************/

    private String userName;

    private String password;

    /********************************方法的命名规则和命名规范********************************/

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
