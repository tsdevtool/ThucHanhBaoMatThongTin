/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtralythuyet;

import java.security.MessageDigest;

/**
 *
 * @author admin
 */
public class SHA_256 {
    public static String passwordHash(String password){
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(password.getBytes());
            byte[] rbt = md.digest();

            StringBuilder sb = new StringBuilder();

            for (byte b : rbt) {
                sb.append(String.format("%02x", b));
            }

            return sb.toString();

        } catch (Exception e) {
        }

        return null;
    }
}
