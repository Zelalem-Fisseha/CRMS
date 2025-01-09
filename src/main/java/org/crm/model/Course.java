package org.crm.model;
import java.util.ArrayList;
import java.util.List;


public class Course {
    private int courseID;
    private String courseName;
    private List<Student> students;
    public Course() {}
    public Course(int courseID, String courseName, List<Student> students) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }
    public int getCourseID() {
        return courseID;
    }
    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }

}
