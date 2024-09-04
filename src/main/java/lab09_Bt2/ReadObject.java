/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab09_Bt2;

import Lab09_Bt1.SanPham;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class ReadObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<SanPham> ds = new ArrayList<>();
        try {
            FileInputStream fw = new FileInputStream("Sanpham.bin");
            ObjectInputStream on = new ObjectInputStream(fw);
            ds=(ArrayList<SanPham>) on.readObject();
            on.close();
            System.out.println("\nDa doc xong");
            for (SanPham sp:ds){
                System.out.println(sp);
            }
            
        } catch (Exception ex) {
            System.out.println("Loi xay ra: " + ex.toString());
            System.out.println("Ghi file that bai");
        }
    }

}
