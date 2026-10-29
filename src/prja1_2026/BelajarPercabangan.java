/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prja1_2026;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class BelajarPercabangan {
    public static void main (String[]args){
        int nilai ;
        String keterangan;
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan Nilai Anda :");
        nilai = input.nextInt();
        
//         if (nilai >= 90) {
//            System.out.println("Nilai : A");
//        } else if (nilai >= 80) {
//            System.out.println("Nilai : B");
//        } else {
//            System.out.println("Nilai : C");
//        }

        if ((nilai <99) && (nilai >75)){
            keterangan = "Lulus";
        } else {
            keterangan = "Tidak Lulus";
        }
        
        System.out.println("Ket : "+keterangan);
        // Sruktur Percabangan If
        
        // Struktur Percaangan if....else
        
        // Struktur Percabangan if ....else....else i
        
//        
//        String nama;
//        int harga1, harga2, harga3, harga4, harga5, total;
//        System.out.println("|----------------------------------------");
    }
}
