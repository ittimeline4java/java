package net.ittimeline.java.core.oop.intermediate.objectarray;

/**
 * 对象数组案例：学生管理
 *
 * @author tony 18601767221@163.com
 * @version 2025/5/5 18:02
 * @since Java21
 */
public class Student {

    /**
     * 学号
     */
    private int number;
    /**
     * 年级
     */
    private int state;
    /**
     * 成绩
     */
    private int score;

    public Student() {

    }

    public Student(int number, int state, int score) {
        this.number = number;
        this.state = state;
        this.score = score;
    }


    public int getNumber() {
        return number;
    }

    public int getState() {
        return state;
    }

    public int getScore() {
        return score;
    }


    public void setNumber(int number) {
        this.number = number;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "学号：" + number + ", 年级：" + state + ", 成绩：" + score;
    }
}
