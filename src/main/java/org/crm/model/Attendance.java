package org.crm.model;
import java.time.LocalDate;

public class Attendance {
    private int attendanceId;
    private LocalDate timestamp;
    private String attendanceStatus;
    private int studentId;
    private int courseId;
    private int instructorId;
    public Attendance() {}
    public Attendance(int attendanceId, LocalDate timestamp, String attendanceStatus, int studentId, int courseId, int instructorId) {
        this.attendanceId = attendanceId;
        this.timestamp = timestamp;
        this.attendanceStatus = attendanceStatus;
        this.studentId = studentId;
        this.courseId = courseId;
        this.instructorId = instructorId;
    }
    public int getAttendanceId() {
        return attendanceId;
    }
    public void setAttendanceId(int attendanceId) {
        this.attendanceId = attendanceId;
    }
    public LocalDate getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }
    public String getAttendanceStatus() {
        return attendanceStatus;
    }
    public void setAttendanceStatus(String attendanceStatus) {
        this.attendanceStatus = attendanceStatus;
    }
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public int getCourseId() {
        return courseId;
    }
    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
    public int getInstructorId() {
        return instructorId;
    }
    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }




}
