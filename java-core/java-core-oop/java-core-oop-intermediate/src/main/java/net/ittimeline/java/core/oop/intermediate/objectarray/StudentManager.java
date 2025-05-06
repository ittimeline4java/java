package net.ittimeline.java.core.oop.intermediate.objectarray;

import java.util.Random;

/**
 * 对象数组案例：学生管理
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/5 18:03
 * @since Java21
 */
public class StudentManager {

    /**
     * 创建指定数量的学生信息
     *
     * @param size 指定数量
     * @return 学生数组
     */
    public static Student[] create(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("创建的学生数量必须大于0");
        }
        System.out.println("********************************创建" + size + "个学生信息********************************");
        //动态初始化学生数组
        Student[] students = new Student[size];
        //年级随机数
        Random randomState = new Random();
        //成绩随机数
        Random randomScore = new Random();
        for (int i = 0; i < students.length; i++) {
            // 1-6年级
            int state = randomState.nextInt(6) + 1;
            // 0-100分
            int score = randomScore.nextInt(101);
            //实例化指定数量的学生对象
            //给学生对象的number、state、score属性赋值
            students[i] = new Student(i + 1, state, score);
        }
        return students;
    }


    /**
     * 打印指定年级的学生信息
     *
     * @param students 学生数组
     * @param state    指定年级
     */
    public static void printStudentByState(Student[] students, int state) {
        System.out.println("********************************显示" + state + "年级学生信息********************************");
        for (int i = 0; i < students.length; i++) {
            if (students[i].getState() == state) {
                System.out.println(students[i]);
            }
        }
    }


    /**
     * 使用冒泡排序按学生成绩排序
     */
    public static void bubbleSort(Student[] students) {
        System.out.println("********************************使用冒泡排序按学生成绩排序********************************");
        if (students == null) return;

        //外层循环控制轮数
        for (int i = 0; i < students.length - 1; i++) {
            //内层循环控制每轮比较的次数
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].getScore() < students[j + 1].getScore()) {
                    //交换学生
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    /**
     * 根据学生id修改分数
     *
     * @param students 学生数组
     * @param number       学号
     * @param score    分数
     */
    public static void update(Student[] students, int number, int score) {
        System.out.println("********************************修改学号"+number+"的成绩********************************");
        //分数校验
        if (score < 0 || score > 100) {
            System.out.println("成绩必须在0-100之间");
            return;
        }
        boolean flag = false;
        for (int i = 0; i < students.length; i++) {
            if (null!=students[i]&&students[i].getNumber() == number) {
                int newScore = students[i].getScore() + score;
                if (newScore < 0 || newScore > 100) {
                    System.out.println("修改后的成绩必须在0-100之间");
                    return;
                }
                students[i].setScore(newScore);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("未找到学号为" + number + "的学生信息");

        }
    }

    /**
     * 删除指定id的学生信息
     *
     * @param students 学生数组
     * @param id       学生id
     * @return 删除后的学生数组
     */
    public static Student[] delete(Student[] students, int id) {
        if (students == null||students.length==0) {
            System.out.println("学生数组为空");
            return students;
        }
        System.out.println("********************************删除学号"+id+"的学生信息********************************");
        int index = -1;
        // 查找要删除的学生索引
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getNumber() == id) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("未找到学号为"+id+"的学生信息");
            return students;
        }

        // 创建新数组
        Student[] newStudents = new Student[students.length - 1];
        // 将删除元素之前的部分复制到新数组中
        System.arraycopy(students, 0, newStudents, 0, index);
        // 将删除元素之后的部分复制到新数组中
        System.arraycopy(students, index + 1, newStudents, index, students.length - index - 1);

        return newStudents;
    }


    /**
     * 遍历所有学生信息
     *
     * @param students 学生数组
     */
    public static void printAllStudents(Student[] students) {
        System.out.println("********************************显示所有学生信息********************************");
        for (int i = 0; i < students.length; i++) {
            if (null!= students[i]){
                System.out.println(students[i]);
            }
        }
    }

    /**
     * 统计指定年级的最高分、最低分、平均分
     *
     * @param students 学生数组
     * @param state    年级
     */
    public static void statisticsForState(Student[] students, int state) {
        System.out.println("********************************统计" + state + "年级成绩********************************");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;

        for (int i=0;i<students.length;i++) {
            Student student = students[i];
            if (student != null && student.getState() == state) {
                int score = student.getScore();
                sum += score;
                count++;
                if (score > max) max = score;
                if (score < min) min = score;
            }
        }
        if (count == 0) {
            System.out.println("没有该年级的学生数据");
            return;
        }
        double avg = (double) sum / count;
        System.out.println("最高分：" + max);
        System.out.println("最低分：" + min);
        System.out.println("平均分：" + avg);
    }
}
