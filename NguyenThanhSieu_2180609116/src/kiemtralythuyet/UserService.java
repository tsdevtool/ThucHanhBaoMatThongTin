/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtralythuyet;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author admin
 */
//Lop chua logic dang nhap
public class UserService {

    private UserDao userDao = new UserDao();
    private HistoryDao historyDao = new HistoryDao();

    //Dang xuat
    public boolean logout(String username, Connection con){
        try{
            User user = userDao.getUserByUsername(username, con);
            historyDao.recordHistory(user.getId(), "success", "logout", con);
            
        }catch(Exception ex){
            User user = userDao.getUserByUsername(username, con);
            historyDao.recordHistory(user.getId(), "fail", "logout", con);
            return false;
        }
        return true;
    }
    //Dang ky
    public void register(String username, String password, int roleId, Connection con) {
        String hashedPassword = SHA_256.passwordHash(password);
        User user = new User(0, username, hashedPassword, roleId, true);
        userDao.registerUser(user, con);
    }
    
    //Dang nhap
    public String login(String username, String password, Connection con){
        try{
            User user = userDao.getUserByUsername(username, con);
            String status = "Fail";
            if (user != null && user.getRole_id() == 2 && user.getPassword().equals(SHA_256.passwordHash(password))) {
                status = "Success";
                historyDao.recordHistory(user.getId(), status, "login", con);
                return "user";
            } else if (user != null && user.getRole_id() == 1 && user.getPassword().equals(SHA_256.passwordHash(password))) {
                status = "Success - Admin";
                historyDao.recordHistory(user.getId(), status, "login", con);
                return "admin";
            }
            historyDao.recordHistory(user.getId(), status, "login-fail", con);
        }catch(Exception ex){
            return "fail";
        }
        return "fail";
    }
    
    public List<User> getAllUsers(Connection con){
        return userDao.getAllUser(con);
    }
    
    public void updateFollowStatus(int userId, boolean follow, Connection con){
        userDao.updateFllowStatus(userId, follow, con);
    }
    
    public List<History> getHistoryByUser(List<User> userList, Connection con){
        return userDao.getHistoryByUser(userList, con);
    }
}
