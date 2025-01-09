package org.crm.model;

public class Instructor {
    private int instructorId;
    private String instructorName;
    private String instructorUsername;
    private String password;
    private String role;
    public Instructor(){}
    public Instructor(int instructorId, String instructorName, String role, String instructorUsername, String password) {
        this.instructorId = instructorId;
        this.instructorName = instructorName;
        this.instructorUsername = instructorUsername;
        this.password = password;
        this.role=role;
    }
    public int getInstructorId() {
        return instructorId;
    }
    public void setinstructorId(int instructorId) {
        this.instructorId = instructorId;
    }
    public String getInstructorName() {
        return instructorName;
    }
    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public void Viewattendance(){
        System.out.print("viewing attendance for "+instructorName);
    }
    public String getinstructorUsername() {
        return instructorUsername;
    }
    public void setinstructorUsername(String instructorUsername) {
        this.instructorUsername = instructorUsername;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
