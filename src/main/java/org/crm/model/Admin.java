package org.crm.model;

public class Admin {
    private  int adminId;
    private String adminName;
    private String adminUsername;
    private String adminPassword;
    private String role;
    public Admin(){}
    public Admin(int adminId, String adminName, String adminUsername, String adminPassword , String role) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminUsername = adminUsername;
        this.adminPassword = adminPassword;
        this.role = role;
    }
    public int getAdminId() {
        return adminId;
    }
    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }
    public String getAdminName() {
        return adminName;
    }
    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }
    public String getAdminUsername() {
        return adminUsername;
    }
    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
    }
    public String getAdminPassword() {
        return adminPassword;
    }
   public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }



}
