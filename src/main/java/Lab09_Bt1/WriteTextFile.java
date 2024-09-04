/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab09_Bt1;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class WriteTextFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<SanPham> ds = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Nhap thong tin san pham  ");
            System.out.print("Ma So sp: ");
            String maSo = scanner.nextLine();
            System.out.print("Ten Sp: ");
            String ten = scanner.nextLine();
            System.out.print("Gia sp: ");
            float gia = scanner.nextFloat();
            scanner.nextLine();
            SanPham sp=new SanPham(maSo, ten, gia);
            ds.add(sp);
        }
        
        try {
            FileWriter fw = new FileWriter("Sanpham.txt");
            for (SanPham sp : ds) {
                fw.write(sp.getMaso()+ ";"+sp.getTen()+";"+sp.getGia()+ "\n");
            }
            fw.close();
        } catch (Exception ex) {
            System.out.println("Loi xay ra: " + ex.toString());
            System.out.println("Ghi file that bai");
        }
    }

}
