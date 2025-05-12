package net.ittimeline.java.core.api.lang;

/**
 * system gc()方法测试
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/9 9:45
 * @since Java21
 */
public class SystemGCTest {

    static class Student {
        String name;

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Student对象的finalize方法被调用了" + this + "对象被回收了");
        }
    }

    /**
     * @see System#gc() 建议JVM进行垃圾回收
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < 100_0000; i++) {
            Student student = new Student();
            student.name = "student" + i;
            if (i % 10000 == 0){
                //建议垃圾回收
                System.gc();
            }
        }

    }
}
