package net.ittimeline.java.core.api.lang;

/**
 * StringBuilder案例：拼接字符串
 * 需求：定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，并在控制台输出结果
 *           例如：数组为 int[] arr ={1,2,3};  ,执行方法后的输出结果为：[1 , 2 , 3]
 * 分析：略
 * @author tony 18601767221@163.com
 * @version 2025/5/11 17:26
 * @since Java21
 */
public class StringBuilderAppendTest {
    /**
     * 拼接数组为字符串
     * @param arr int[]
     * @return String
     */
    public static String arrayToString(int[] arr){
        if(arr == null || arr.length == 0){
            return "[]";
        }
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < arr.length; i++) {
            builder.append(arr[i]);
            if(i != arr.length - 1){
                builder.append(",");
            }
        }
        builder.append("]");
        return builder.toString();
    }

    /**
     * 拼接数组为字符串，自定义分隔符
     * @param arr
     * @param separator
     * @return
     */
    public static String arrayToString(int[] arr,String separator){
        if(arr == null || arr.length == 0){
            return "[]";
        }
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < arr.length; i++) {
            builder.append(arr[i]);
            if(i != arr.length - 1){
                builder.append(separator);
            }
        }
        builder.append("]");
        return builder.toString();
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(arrayToString(arr));
        System.out.println(arrayToString(arr, ","));
    }
}
