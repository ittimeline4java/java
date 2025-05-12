package net.ittimeline.java.core.api.math;

import java.math.BigDecimal;

/**
 * BigDecimal构造方法测试
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/10 8:54
 * @since Java21
 */
public class BigDecimalConstructorTest {
    /**
     * @see BigDecimal#BigDecimal(double)  不推荐使用
     * @see BigDecimal#BigDecimal(String) 推荐使用
     * @see BigDecimal#valueOf(double)    推荐使用
     * @param args
     */
    public static void main(String[] args) {
        //传递double类型小数构造BigDecimal
        BigDecimal bd1 = new BigDecimal(0.01);
        BigDecimal bd2 = new BigDecimal(0.09);
        //结果不正确，因为double类型小数在底层转换成二进制后有精度损失
        System.out.println("bd1 = " + bd1);
        System.out.println("bd2 = " + bd2);

        //浮点数的精度问题
        System.out.println("0.01 + 0.09 = " + (0.01 + 0.09 ));

        //传递字符串构造BigDecimal
        BigDecimal bd3 = new BigDecimal("0.01");
        BigDecimal bd4 = new BigDecimal("0.09");
        //结果正确，因为字符串可以精确表示小数
        System.out.println("bd3 = " + bd3);
        System.out.println("bd4 = " + bd4);

        //计算两个BigDecimal的和
        BigDecimal bd5 = bd3.add(bd4);
        System.out.println("bd5 = " + bd5);

        //通过静态方法valueOf构造BigDecimal

        //如果要表示的数字不大，没有超出double的取值范围，建议使用静态方法，否则使用字符串构造方法
        BigDecimal bd6=BigDecimal.valueOf(10);
        System.out.println("bd6 = " + bd6);
        BigDecimal bd7=BigDecimal.valueOf(100.0);
        System.out.println("bd7 = " + bd7);

        //如果传递是0~10的数字，那么会使用缓存的BigDecimal对象
        BigDecimal bd8=BigDecimal.valueOf(10);
        BigDecimal bd9=BigDecimal.valueOf(10);

        System.out.println("bd8 == bd9 = " + (bd8 == bd9));
    }
}
