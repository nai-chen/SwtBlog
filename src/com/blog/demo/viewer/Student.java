package com.blog.demo.viewer;

/*
 * https://blog.csdn.net/chennai1101/article/details/103405121
 */
public class Student {
    public String mName;
    private int mAge;
    private Teacher mTeacher;

    public Student(String name) {
        this.mName = name;
    }

    public Student(String name, int age) {
        this.mName = name;
        this.mAge = age;
    }

    public Student(String name, int age, Teacher teacher) {
        this.mName = name;
        this.mAge = age;
        this.mTeacher = teacher;
    }

    public String getName() {
        return mName;
    }

    public int getAge() {
        return mAge;
    }

    public Teacher getTeacher() {
        return mTeacher;
    }
}
