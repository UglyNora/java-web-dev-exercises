package org.launchcode.java.demos.lsn3classes1;

import java.util.HashMap;

public class Course {
    private String courseName;
    private HashMap<String,Integer> students = new HashMap<>();
    private String teacherName;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
