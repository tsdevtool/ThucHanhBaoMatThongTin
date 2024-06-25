/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtralythuyet;

import java.sql.Timestamp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
//Thao tac voi co so du lieu
public class UserDao {

    //Chuc nang dang ky user
    public void registerUser(User user, Connection con) {
        String query = "INSERT INTO `user` (`username`, `password`, `role_id`) VALUES (?, ?, ?)";
        try (PreparedStatement pst = con.prepareStatement(query)) {
            pst.setString(1, user.getUsername());
            pst.setString(2, user.getPassword());
            pst.setInt(3, user.getRole_id());
            pst.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Loi khi ket noi voi sql: \n" + ex);
        }
    }

    //Lay thong tin user
    public User getUserByUsername(String username, Connection con) {
        String query = "SELECT * FROM user WHERE username = ?";
        try (PreparedStatement pst = con.prepareStatement(query)) {
            pst.setString(1, username);
            try {
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    int id = rs.getInt("id");
                    String dbUsername = rs.getString("username");
                    String dbPassword = rs.getString("password");
                    int roleId = rs.getInt("role_id");
                    boolean follow = rs.getBoolean("follow");
                    return new User(id, dbUsername, dbPassword, roleId, follow);
                }
            } catch (SQLException ex) {
                System.out.println("Khong the lay du lieu duoi db");
            }

        } catch (SQLException ex) {
            System.out.println("Loi khi ket noi voi sql: \n" + ex);
        }
        return null;
    }

    public List<User> getAllUser(Connection con) {
        List<User> userList = new ArrayList<>();
        String query = "SELECT id, username, follow FROM user";

        try {
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String username = rs.getString("username");
                boolean follow = rs.getBoolean("follow");
                userList.add(new User(id, username, follow));
            }
        } catch (SQLException ex) {
            System.out.println("Loi ket noi sql" + ex);
        }
        return userList;
    }

    public void updateFllowStatus(int userId, boolean follow, Connection con) {
        String query = "UPDATE user SET follow = ? WHERE id = ?";
        try {
            PreparedStatement pst = con.prepareStatement(query);
            pst.setBoolean(1, follow);
            pst.setInt(2, userId);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Loi ket noi sql" + ex);
        }
    }

    public List<History> getHistoryByUser(List<User> userList, Connection con) {
        List<History> historyList = new ArrayList<>();
        String sql = "SELECT h.* FROM history h JOIN user u ON h.user_id = u.id WHERE u.id = ? AND u.follow = true";
        try {
            for (User user : userList) {
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setInt(1, user.getId());
                try (ResultSet rs = pst.executeQuery()) {
                    while (rs.next()) {
                        int id = rs.getInt("id");
                        Timestamp time = rs.getTimestamp("time");
                        String status = rs.getString("status");
                        String action = rs.getString("action");
                        historyList.add(new History(id, time, user.getId(), status, action));
                    }
                } catch (SQLException ex) {
                    System.out.println("Loi ket noi sql" + ex);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Loi ket noi sql" + ex);
        }
        return historyList;
    }
}
