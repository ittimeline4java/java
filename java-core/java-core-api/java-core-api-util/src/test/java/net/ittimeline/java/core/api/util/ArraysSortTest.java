package net.ittimeline.java.core.api.util;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Arrays sort()方法测试
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/12 8:00
 * @since Java21
 */
public class ArraysSortTest {



    /**
     * @see Arrays#sort(int[])
     * @see Arrays#sort(Object[],Comparator)
     *
     * @see Arrays#sort(Object[])
     * @see Arrays#sort(Object[], Comparator)
     * @param args
     */
    public static void main(String[] args) {
        /************************************默认排序********************************/

        int[] array1 = new int[]{10, 30, 70, 50, 90, 20, 40, 80, 60};
        System.out.println("升序排序之前："+Arrays.toString(array1));
        // sort方法用于基本数据类型数组的排序
        // 默认情况下：升序排序，底层使用的是快速排序算法
        Arrays.sort(array1);
        System.out.println("升序排序之后："+Arrays.toString(array1));


        /************************************自定义排序规则********************************/

        /*
             public static <T> void sort(T[] a, Comparator<? super T> c)
             参数1：要排序的数组
             参数2：排序的规则
             细节：
                  只能给引用数据类型的数组进行排序
                  如果数组元素是基本数据类型，需要使用包装类，例如int[]数组，需要Integer[]包装类


         */

        //自定义排序规则：降序排序
        Integer[] array2 = new Integer[]{10, 30, 70, 50, 90, 20, 40, 80, 60};

        /*
            sort()方法第二个参数是一个接口，所以我们在调用方法额时候，需要传递这个接口的实现类对象，作为排序规则
            但是这个实现类，我们只需要使用一次，所以没有必要单独去写一个类，直接采用匿名内类的方式就可以了

            sort()方法底层原理：插入排序+二分法查找的方式进行排序
                     默认把0号索引的数组当成有序的序列， 1号索引到最后索引默认是无序的序列
                     遍历无序的序列获取每一个元素，假设当前遍历获取的元素是A元素
                     把A元素往有序序列中进行插入，在插入的时候，利用二分查找法确定A元素的插入点
                     将A元素跟插入点的元素进行比较，比较的规则就是compare()方法的方法体
                     如果方法的返回值是负数，使用A元素继续跟前面的数据进行比较
                     如果方法的返回值是正数，使用A元素继续跟后面的数据进行比较
                     如果方法的返回值是0，使用A元素跟后面的数据进行比较
                     直到能确定A的最终位置为止


         */
        Arrays.sort(array2, new Comparator<Integer>() {
            /*


                参数1：表示在无序序列中，遍历获取的每个元素
                参数2：有序序列中的元素

                返回值：
                    如果返回值是负数，表示当前要插入的元素是小的，放在前面
                    如果返回值是正数，表示当前要插入的元素是大的，放在后面
                    如果返回值是0，表示当前要插入的元素跟前面的元素相等，放在后面
             */
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println("------------------------------");
                System.out.println("o1 = " + o1);
                System.out.println("o2 = " + o2);
                /*
                    o1 -o2 升序排列
                    o2 - o1 降序排列

                    o1.compareTo(o2) 升序排列
                    o2.compareTo(o1) 降序排列
                 */
                return -o1.compareTo(o2);
            }
        });
        System.out.println("降序排序之后："+Arrays.toString(array2));
    }
}
