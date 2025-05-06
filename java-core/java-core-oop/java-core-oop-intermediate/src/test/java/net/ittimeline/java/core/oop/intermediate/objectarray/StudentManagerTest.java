package net.ittimeline.java.core.oop.intermediate.objectarray;
import static net.ittimeline.java.core.oop.intermediate.objectarray.StudentManager.*;
/**
 * 对象数组案例：学生管理系统
 * 需求：学生管理，完成学生创建、查找、排序、修改、删除、统计操作
 * 需求1：定义类 Student，包含三个属性：学号 number(int)，年级 state(int)，成绩score(int)。 创建 20 个学生对象，学号为 1 到 20，年级和成绩都由随机数确定。
 * 需求2：打印出 3 年级(state 值为 3）的学生信息。
 * 需求3：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 * 需求4：修改id为8的成绩加10分
 * 需求5：删除学号为14的学生信息
 * 需求7：统计3年级的最高分、最低分、平均分
 * 分析：略
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/5 18:10
 * @since Java21
 */
public class StudentManagerTest {
    public static void main(String[] args) {
        // 创建20个学生
        Student[] students = create(20);

        // 打印所有学生信息
        printAllStudents(students);

        // 打印3年级学生信息
        printStudentByState(students, 3);

        // 按成绩排序
        bubbleSort(students);
        printAllStudents(students);

        // 修改学号8的成绩加10分
        update(students, 8,  10);
        printAllStudents(students);

        // 删除学号14的学生
        students = delete(students, 14);
        printAllStudents(students);

        // 统计3年级成绩
        statisticsForState(students, 3);
    }
}
