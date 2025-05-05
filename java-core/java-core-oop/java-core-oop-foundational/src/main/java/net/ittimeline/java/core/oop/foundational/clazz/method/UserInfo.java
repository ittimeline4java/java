package net.ittimeline.java.core.oop.foundational.clazz.method;

/**
 * 实例方法案例：购物车系统
 * 实体类-UserInfo
 * @author tony 18601767221@163.com
 * @version 2025/5/5 8:14
 * @since Java21
 */
public class UserInfo {

    /************************************类的成员-成员变量************************************/

    /**
     * 用户姓名
     */
    String userName;
    /**
     * 用户密码
     */
    String password;
    /************************************类的成员-成员方法-实例方法************************************/

    /**
     * 验证用户是否登录成功
     *
     * @param inputUserName 输入的用户名
     * @param inputPassword 输入的密码
     * @return true 登录成功  false 登录失败
     */
    public boolean login(String inputUserName, String inputPassword) {
        return userName.equals(inputUserName) && password.equals(inputPassword);
    }

}
