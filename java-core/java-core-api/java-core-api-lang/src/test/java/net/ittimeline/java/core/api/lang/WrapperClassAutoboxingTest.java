package net.ittimeline.java.core.api.lang;

/**
 * 包装类自动装箱与自动装箱
 * 自动装箱：在编译阶段，编译器会将基本类型值包装为对应的包装类对象，通常通过调用包装类的valueOf方法实现。
 *         例如，Integer num = 10; 实际上等效于 Integer num = Integer.valueOf(10);。
 * 自动拆箱：在编译阶段，编译器会调用包装类的xxxValue方法（如intValue、doubleValue），将包装类对象的值提取为基本数据类型。
 *         例如，int num = boxedNum; 实际上等效于 int num = boxedNum.intValue();
 * @author tony 18601767221@163.com
 * @version 2025/5/9 14:30
 * @since Java21
 */
public class WrapperClassAutoboxingTest {
    /**
     * Integer和Boolean自动拆箱和自动装箱
     * @see Integer#valueOf(int) 自动装箱
     * @see Integer#intValue() 自动拆箱
     *
     * @see Boolean#valueOf(boolean) 自动装箱
     * @see Boolean#booleanValue() 自动拆箱
     * @param args
     */
    public static void main(String[] args) {

        //Integer自动拆箱与自动装箱
        // 自动装箱 等价于Integer i = Integer.valueOf(10);
        Integer i = 10;
        System.out.println("i = " + i);
        //自动拆箱：等价于int j = i.intValue();
        int j = i;
        System.out.println("j = " + j);


        //Boolean自动拆箱与自动装箱
        // 自动装箱 等价于Boolean booleanReference = Boolean.valueOf(true);
        Boolean booleanReference = true;
        System.out.println("booleanReference = " + booleanReference);
        //自动拆箱：等价于boolean booleanValue = booleanReference.booleanValue();
        boolean booleanValue = booleanReference;
        System.out.println("booleanValue = " + booleanValue);
    }
}
