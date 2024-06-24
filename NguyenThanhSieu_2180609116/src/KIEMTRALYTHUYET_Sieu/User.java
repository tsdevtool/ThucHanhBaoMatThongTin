/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KIEMTRALYTHUYET_Sieu;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author admin
 */
public class User {
    public static ResultSet rs=null;// kết quả trả về 1 bảng hay 1 dòng dl
    public static PreparedStatement pst =null; // biến thực thi sql
    public static Connection conn = DBConnect.getConnect();// lấy từ lớp connect
    
    public static void them(String username, String password){
        String sql = "SELECT `username`, `password` FROM `login` WHERE username= '"+username+"' ";
        try {
            pst=conn.prepareStatement(sql);
            pst.setString(1, username.trim());
            pst.setString(2, password.trim());
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm vào "+username+ " thành công","Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Mã lớp "+username+ " đã tồn tại, không thể thêm","Thông báo",1);
        }
    }
}
