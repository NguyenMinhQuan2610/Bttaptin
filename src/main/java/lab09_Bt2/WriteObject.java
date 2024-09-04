/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab09_Bt2;

import Lab09_Bt1.SanPham;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class WriteObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<SanPham> ds = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        try {
            FileOutputStream fw = new FileOutputStream("Sanpham.bin");
            ObjectOutputStream on = new ObjectOutputStream(fw);
            for (int i = 0; i < 3; i++) {
                System.out.println("Nhap thong tin san pham  ");
                System.out.print("Ma So sp: ");
                String maSo = scanner.nextLine();
                System.out.print("Ten Sp: ");
                String ten = scanner.nextLine();
                System.out.print("Gia sp: ");
                float gia = scanner.nextFloat();
                scanner.nextLine();
                SanPham sp = new SanPham(maSo, ten, gia);
                ds.add(sp);
            }
            on.writeObject(ds);
            on.close();
            System.out.println("Da ghi xong");
        }
        catch (Exception ex) {
            System.out.println("Loi xay ra: " + ex.toString());
            System.out.println("Ghi file that bai");
        }

    }

}
