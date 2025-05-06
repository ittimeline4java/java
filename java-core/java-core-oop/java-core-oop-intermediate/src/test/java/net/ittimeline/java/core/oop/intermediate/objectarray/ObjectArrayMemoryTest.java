package net.ittimeline.java.core.oop.intermediate.objectarray;

/**
 * 对象数组内存分析
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/6 7:27
 * @since Java21
 */
public class ObjectArrayMemoryTest {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        System.out.println("students = " + students);
        for (int i = 0; i < students.length; i++) {
            //创建3个学生对象
            students[i] = new Student();
            System.out.println(students[i]);
        }
        //给索引为0的学生属性赋值
        students[0].setNumber(1);
        students[0].setState(2);
        students[0].setScore(90);

        for (int i = 0; i < students.length; i++) {
            System.out.println("students[" + i + "].number = " + students[i].getNumber());
            System.out.println("students[" + i + "].state = " + students[i].getState());
            System.out.println("students[" + i + "].score = " + students[i].getScore());
        }
    }
}
