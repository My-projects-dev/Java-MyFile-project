package com.mycompany;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class InsertApp {

    
    public Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:fayl.sqlite";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    
    public void insert(String ad, String sifre, String selahiyyet) {
        String sql = "INSERT INTO istifadeci (istifadeci, sifre, selahiyyet) VALUES (?,?,?)";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, ad);
            pstmt.setString(2, sifre);
            pstmt.setString(3, selahiyyet);
            
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void insert(String fayl, String sahibi, String tarix, String izzahi, String ok) {
        String sql = "INSERT INTO fayllar (fayl, sahibi, tarix, izzahi, ok) VALUES (?,?,?,?,?)";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, fayl);
            pstmt.setString(2, sahibi);
            pstmt.setString(3, tarix);
            pstmt.setString(4, izzahi);
            pstmt.setString(5, ok);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    public void update(String ok, String id) {
        String sql = "UPDATE fayllar SET ok = ? where id = ?";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, ok);
            pstmt.setString(2, id);
             
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
     public void update(String ad, String sifre, String selahiyyet, String ad2) {
        String sql = "UPDATE Istifadeci SET istifadeci = ?, sifre = ?, selahiyyet = ? where istifadeci like  ?";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, ad);
            pstmt.setString(2, sifre);
            pstmt.setString(3, selahiyyet);
            pstmt.setString(4, ad2);
            
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
     
    
}