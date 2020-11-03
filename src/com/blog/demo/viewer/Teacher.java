package com.blog.demo.viewer;

import java.util.ArrayList;
import java.util.List;

/*
 * https://blog.csdn.net/chennai1101/article/details/103405121
 */
public class Teacher {
    private String mName;
    private List<Student> mStudList = new ArrayList<Student>();

    public Teacher(String name) {
        this.mName = name;
    }

    public String getName() {
        return mName;
    }

    public void addStudent(Student stud) {
        mStudList.add(stud);
    }

    public List<Student> getStudents() {
        return mStudList;
    }
}
