package net.ittimeline.java.core.api.util;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * Array copyOf()方法测试
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/12 8:10
 * @since Java21
 */
public class ArraysCopyOfTest {
    static Product[] products;
    static{
        products = new Product[]{
                new Product("vivo X200 Ultra", BigDecimal.valueOf(7999.00)),
                new Product("xiaomi 15 Ultra", BigDecimal.valueOf(7799.00)),
                new Product("iPhone 16 Pro Max", BigDecimal.valueOf(12536.01)),
                new Product("OPPO Find X8 Ultra", BigDecimal.valueOf(7999.00)),
                new Product("Honor Magic7 RSR", BigDecimal.valueOf(7499.00))};
    }
    /**
     * 数组拷贝
     * @see Arrays#copyOf(int[] original, int newLength)
     * @see Arrays#copyOfRange(int[], int, int)
     * @see Arrays#copyOf(Object[] original, int newLength)
     * @see Arrays#copyOfRange(Object[], int, int)
     * @param args
     */
    public static void main(String[] args) {
        /********************************拷贝数组-基本数据类型********************************/
        int[] array1 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        //copyOf方法的底层会根据第二个参数创建新的数组
        //如果新数组的长度小于老数组长度，会部分拷贝
        int[] array2 = Arrays.copyOf(array1, 5);
        System.out.println("拷贝数组 新数组长度小于老数组："+Arrays.toString(array2));

        //如果新数组的长度等于老数组，会全部拷贝
        array2 = Arrays.copyOf(array1, array1.length);
        System.out.println("拷贝数组 新数组长度和老数组长度一样："+Arrays.toString(array2));

        //如果新数组的长度大于老数组长度，会拷贝老数组的全部内容，其余部分填充0
        array2 = Arrays.copyOf(array1, array1.length+5);
        System.out.println("拷贝数组 新数组长度大于老数组："+Arrays.toString(array2));

        /********************************拷贝数组（指定范围）-基本数据类型********************************/
        //copyOfRange方法拷贝数组包头不包尾，包左不包右
        //拷贝从索引5开始到倒数第二个元素结束的数组
        int[] array3 = Arrays.copyOfRange(array1, 5, array1.length-1);
        System.out.println("拷贝指定范围数组:"+Arrays.toString(array3));


        /********************************拷贝数组-引用数据类型********************************/
        Product[] productsCopy = Arrays.copyOf(products, 5);
        System.out.println("拷贝数组 新数组长度小于老数组："+Arrays.toString(productsCopy));

        //如果新数组的长度等于老数组，会全部拷贝
        productsCopy = Arrays.copyOf(products, products.length);
        System.out.println("拷贝数组 新数组长度和老数组长度一样："+Arrays.toString(productsCopy));

        //如果新数组的长度大于老数组长度，会拷贝老数组的全部内容，其余部分填充null
        productsCopy = Arrays.copyOf(products, products.
                length+5);
        System.out.println("拷贝数组 新数组长度大于老数组："+Arrays.toString(productsCopy));

        /********************************拷贝数组（指定范围）-引用数据类型********************************/
        //copyOfRange方法拷贝数组包头不包尾，包左不包右
        //拷贝从索引5开始到倒数第二个元素结束的数组
        Product[] productsCopyOfRange = Arrays.copyOfRange(products, 2, products.length-1);
        System.out.println("拷贝指定范围数组:"+Arrays.toString(productsCopyOfRange));

    }
}
