package net.ittimeline.java.core.api.lang;

/**
 * system arraycopy()方法测试
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/9 9:55
 * @since Java21
 */
public class SystemArrayCopyTest {
    /**
     *
     * @see System#arraycopy(Object, int, Object, int, int)
     * @param args
     */
    public static void main(String[] args) {

        //静态初始化源数组
        int[] src = {10, 20, 30, 40, 50};
        //动态初始化目标数组
        int[] dest = new int[5];
        /**
         * src 源数组
         * 0 源数组的起始位置
         * dest 目标数组
         * 0 目标数组的起始位置
         * src.length 复制的元素个数
         *
         */
        System.arraycopy(src, 0, dest, 0, src.length);
        //遍历目标数组
        for (int i = 0; i < dest.length; i++) {
            System.out.println("dest[" + i + "] = " + dest[i]);
        }
    }
}
