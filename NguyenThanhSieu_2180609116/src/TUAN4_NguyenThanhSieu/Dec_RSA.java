/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUAN4_NguyenThanhSieu;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateKey;

/**
 *
 * @author Administrator
 */
public class Dec_RSA {
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("M:\\Enc_RSA.dat")));
        String ctext = in.readLine();
        BigInteger c = new BigInteger(ctext);
        
        FileInputStream f = new FileInputStream("M:\\Skey_RSA_priv.dat");
        
        ObjectInputStream b = new ObjectInputStream(f);
        RSAPrivateKey prk = (RSAPrivateKey) b.readObject();
        
        BigInteger d = prk.getPrivateExponent();
        BigInteger n = prk.getModulus();
        
        System.out.println("d = " + d);
        System.out.println("n = " + n);
        
        BigInteger m = c.modPow(d, n);
        System.out.println("m = " + m);
        
        byte[] mt = m.toByteArray();
        System.out.print("Plaintext is \"");
        for(int i = 0; i<mt.length; i++)
            System.out.print((char) mt[i]);
        System.out.println("\"");
        
    }
}
