/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtralythuyet;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author admin
 */
public class User {

    public User() {
    }

    public User(int id, String username, String password, int role_id, boolean follow) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role_id = role_id;
        this.follow = follow;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public User(int id, String username, boolean follow) {
        this.id = id;
        this.username = username;
        this.follow = follow;
    }
    private int id;
    private String username;
    private String password;
    private int role_id;
    private boolean follow;

    public boolean isFollow() {
        return follow;
    }

    public void setFollow(boolean follow) {
        this.follow = follow;
    }
    
}
