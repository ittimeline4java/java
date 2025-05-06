package net.ittimeline.java.core.oop.intermediate.encapsulation.constructor;

/**
 * 构造方法封装案例：工具类
 * 工具类-ArrayUtils
 * @author tony 18601767221@163.com
 * @version 2025/5/5 17:30
 * @since Java21
 */
public class ArrayUtils {
    /********************************私有构造器，防止工具类被实例化********************************/
    private ArrayUtils() {
        throw new AssertionError("不能实例化工具类！");
    }

    /********************************静态方法提供功能********************************/

    /**
     * 数组是否为空
     *
     * @param <T>   数组元素类型
     * @param array 数组
     * @return 是否为空
     */
    public static <T> boolean isEmpty(T[] array) {
        return array == null || array.length == 0;
    }

    /**
     * 数组是否为非空
     *
     * @param <T>   数组元素类型
     * @param array 数组
     * @return 是否为非空
     */
    public static <T> boolean isNotEmpty(T[] array) {
        return (null != array && array.length != 0);
    }

}
