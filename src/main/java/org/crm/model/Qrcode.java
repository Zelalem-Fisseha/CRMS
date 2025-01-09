package org.crm.model;
import java.util.Date;

public class Qrcode {
    private int qrcodeID;
    private Date issuedDate;
    private int studentID;
    private int courseID;
    public Qrcode() {}
    public Qrcode(int qrcodeID, Date issuedDate, int studentID, int courseID) {
        this.qrcodeID = qrcodeID;
        this.issuedDate = issuedDate;
        this.studentID = studentID;
    }
    public int getQrcodeID() {
        return qrcodeID;
    }
    public void setQrcodeID(int qrcodeID) {
        this.qrcodeID = qrcodeID;
    }
    public Date getIssuedDate() {
        return issuedDate;
    }
    public void setIssuedDate(Date issuedDate) {
        this.issuedDate = issuedDate;
    }
    public int getStudentID() {
        return studentID;
    }
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    public int getCourseID() {
        return courseID;
    }
    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }



}
