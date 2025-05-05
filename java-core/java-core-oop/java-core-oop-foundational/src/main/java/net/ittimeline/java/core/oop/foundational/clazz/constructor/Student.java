package net.ittimeline.java.core.oop.foundational.clazz.constructor;

/**
 * 无参构造器与有参构造器
 * 实体类-Student
 * @author tony 18601767221@163.com
 * @version 2025/5/5 14:34
 * @since Java21
 */
public class Student {
    /**
     * 姓名
     */
    String name;
    /**
     * 成绩
     */
    int score;

    /**
     * 无参构造器
     */
    public Student() {

    }

    /**
     * 有参构造器
     * 覆盖默认无参构造器
     *
     * @param studentName 学生姓名
     * @param studentScore 学生成绩
     */
    public Student(String studentName, int studentScore) {
        this.name = studentName;
        this.score = studentScore;
    }

}
