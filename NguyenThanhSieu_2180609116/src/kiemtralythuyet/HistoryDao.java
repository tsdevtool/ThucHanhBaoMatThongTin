/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtralythuyet;

import java.sql.Timestamp;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDateTime;

/**
 *
 * @author admin
 */
public class HistoryDao {
    public void recordHistory(int userId, String status, String action, Connection con){
        String query = "INSERT INTO history (user_id, time, status, action) VALUES (?,?,?,?)";
        try{
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, userId);
            Timestamp time = Timestamp.valueOf(LocalDateTime.now());
            pst.setTimestamp(2, time);
            pst.setString(3, status);
            pst.setString(4, action);
            pst.executeUpdate();
        }catch(SQLException ex){
            System.out.println("Khong luu du lieu duoi db" + ex);
        }
    }
}
