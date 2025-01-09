package org.crm.model;

public class Student {
    private int studentID;
    private String studentName;
    private String userName;
    private String password;
    private String role;
    private int qrcodeID;
    public Student() {}
    public Student(int studentID, String studentName, String role, int qrcodeID , String userName, String password) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.userName = userName;
        this.password = password;
        this.role=role;
        this.qrcodeID=qrcodeID;
    }
    public int getStudentID() {
         return studentID;
    }
    public  void setStudentID(int studentID) {
        this.studentID=studentID;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password=password;

    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role =role;
    }
    public void updateDetails(String studentName, String role, int qrcodeID){
        this.studentName=studentName;
        this.role=role;
        this.qrcodeID=qrcodeID;
    }


}
