package org.crm.model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Datasource {
    String URL="jdbc:postgresql://localhost:5432/cclassmanagementtt";
    String USER="zolafss";
    String PASSWORD="kill123qwe";

    Connection con = null;
    public Connection connect() {

        try{
            con= DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("Connection established with database");
            return con;
        }catch ( SQLException e) {
            System.out.println("Failed to connect to database" + e.getMessage());
            return null;
        }
    }
    public void disconnect() {
        try {
            if(con!=null){
                con.close();
                System.out.println("Connection closed");
            }
        }catch(SQLException e){
            System.out.println("Failed to close connection");
        }

    }


}
