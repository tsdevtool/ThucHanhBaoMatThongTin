/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUAN5_NguyenThanhSieu;

/**
 *
 * @author Administrator
 */
public class CryptoUtil {
    public static final String toHexString(byte[] block){
        StringBuffer buf =new StringBuffer();
        int len = block.length;
        for(int i=0; i<len; i++){
            byte2hex(block[i],buf);
            if(i < len - 1)
                buf.append(":");
        }
        return buf.toString();
    }
    
    public static final void byte2hex(byte b, StringBuffer buf){
        char[] hexChars = {'0','1','2','3',
                            '4','5','6','7',
                            '8','9','A','B',
                            'C','D','E','F'};
        int high = ((b&0xf0)>>4);
        int low = (b & 0x0f);
        buf.append(hexChars[high]);
        buf.append(hexChars[low]);
    }
}
