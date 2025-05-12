package net.ittimeline.java.core.api.math;

import java.math.BigDecimal;

/**
 * BigDecimal底层原理
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/10 14:29
 * @since Java21
 */
public class BigDecimalPrincipleTest {
    public static void main(String[] args) {
        BigDecimal bd1 = BigDecimal.valueOf(0.226);
        System.out.println("bd1 = " + bd1);

        BigDecimal bd2 = BigDecimal.valueOf(123.226);
        System.out.println("bd2 = " + bd2);

        BigDecimal bd3 = BigDecimal.valueOf(-1.5);
        System.out.println("bd3 = " + bd3);

    }
}
