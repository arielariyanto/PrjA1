/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prja1_2026;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class contohSwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int panjang,lebar,keliling,luas,pilihan;
        
        System.out.println("Perhitungan Luas dan Keliling");
        System.out.print ("Masukkan Panjang = ");
        panjang = input.nextInt();
        System.out.print("Masukkan Lebar = ");
        lebar = input.nextInt();
        
        System.out.println("--------------------------------");
        System.out.println("Pilihan");
        System.out.println("1. Luas ");
        System.out.println("2. Keliling ");
        System.out.println("3. Luas Dan Keliling ");
        System.out.print("Pilih = ");
        pilihan = input.nextInt();
        System.out.println("--------------------------------");
        switch (pilihan){
            case 1:
                luas = panjang*lebar;
                System.out.println("Hasil");
                System.out.println("Luas = "+luas);
                break;
            case 2:
                keliling = 2*(panjang + lebar);
                System.out.println("Hasil");
                System.out.println("Keliling = "+ keliling);
                break;
            case 3: 
                luas = panjang * lebar;
                keliling = 2 *(panjang + lebar);
                System.out.println("Hasil");
                System.out.println("Luas = "+luas);
                System.out.println("Keliling = "+keliling);
                break;
            default:
                System.out.println("Pilihan Tidak Valid");
        }
//    input.close();
    }
    
}
