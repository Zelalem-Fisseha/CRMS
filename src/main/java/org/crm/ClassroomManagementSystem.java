package org.crm;
import org.crm.model.Datasource;

import java.sql.Connection;

public class ClassroomManagementSystem {
    public static void main(String[] args) {
        Datasource datasource = new Datasource();
        Connection connection = datasource.connect();
        if (connection != null) {
            System.out.println("Connection established");
        }
    }
}
