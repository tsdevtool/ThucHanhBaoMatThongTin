/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtrathu;

import java.security.MessageDigest;

/**
 *
 * @author admin
 */
public class XuLyChuoi {
    
    public static void main(String args[]){
        String chuoi1 = "Nguyen Thanh Sieu";
        String chuoi2 = "Nguyen Thi Thuy Linh";
        String noiChuoi1 = NoiChuoi(chuoi1, chuoi2);
        
        String hash = HamBam(noiChuoi1);
        
        System.out.println("Chuoi sau khi duoc noi lan 1 la: " + noiChuoi1);
        
        String chuoi3 = "Nguyen Thanh Hong Anh";
        String noiChuoi2 = NoiChuoi(noiChuoi1, hash, chuoi3);
        
        System.out.println("Chuoi sau khi noi lan 2 la:" + noiChuoi2);
        
        // Sử dụng mảng để nhận kết quả tách chuỗi
        String[] tachKetQua1 = TachChuoiLan1(noiChuoi2);
        String tachChuoi3 = tachKetQua1[0];
        String tachHash = tachKetQua1[1];
        String tachNoiChuoi1 = tachKetQua1[2];
        
        System.out.println("Chuoi sau khi duoc tach lan 1 la: ");
        System.out.println("Chuoi3 : " + tachChuoi3);
        System.out.println("Hash: " + tachHash);
        System.out.println("Tach Noi Chuoi 1: " + tachNoiChuoi1);
        
        String[] tachKetQua2 = TachChuoiLan2(tachNoiChuoi1);
        if (tachKetQua2 != null && tachKetQua2.length == 2) {
            String tachChuoi1 = tachKetQua2[0];
            String tachChuoi2 = tachKetQua2[1];
            
            System.out.println("Chuoi sau khi duoc tach lan 2 la: ");
            System.out.println("Chuoi 2: " + tachChuoi2);
            System.out.println("Chuoi 1: " + tachChuoi1);
        } else {
            System.out.println("Lỗi: Không thể tách chuỗi lần 2.");
        }
    }
    // Tách chuỗi cho lần 1
    public static String[] TachChuoiLan1(String chuoi) {
        String[] s = chuoi.split("\\-");
        if (s.length == 3) {
            return new String[] { s[2], s[1], s[0] };
        } else {
            System.out.println("Lỗi: Độ dài của mảng sau khi tách lần 1 không đúng.");
            return new String[0];
        }
    }
    
    // Tách chuỗi cho lần 2
    public static String[] TachChuoiLan2(String chuoi) {
        String[] s = chuoi.split("\\|");
        if (s.length == 2) {
            return new String[] { s[0], s[1] };
        } else {
            System.out.println("Lỗi: Độ dài của mảng sau khi tách lần 2 không đúng.");
            return new String[0];
        }
    }
    
    public static String NoiChuoi(String chuoi1, String chuoi2){
        return chuoi1 + "|" + chuoi2;
    }
    
    public static String NoiChuoi(String chuoi1, String chuoi2, String chuoi3){
        return chuoi1 + "-" + chuoi2 + "-" + chuoi3;
    }

    
    
    public static String HamBam(String chuoi){
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(chuoi.getBytes());
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
