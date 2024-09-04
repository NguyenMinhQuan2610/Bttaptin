/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab09_Bt1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class ReadTextFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<SanPham> ds=new ArrayList<>();
        try{
            FileReader rd=new FileReader("Sanpham.txt");
            BufferedReader br=new BufferedReader(rd);
            String data=null;
            while((data=br.readLine())!=null){
                String[] arr=data.split(";");
                ds.add(new SanPham(arr[0],arr[1],Float.parseFloat(arr[2])));
            }
            br.close();
            System.out.println("Doc thanh cong");
        }catch (Exception ex){
            System.out.println("Loi xay ra: "+ex.toString());
            System.out.println("Ghi file that bai");
        }

    }
    
}
