/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prja1_2026;
import java.util.Scanner;

public class belajarVariabelBuAyu {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nama,nim;
        int usia;
        double rataRataNilai;
        
        System.out.print("Masukkan Nama = ");
        nama = input.nextLine();
        
        System.out.print("Masukkan Nim = ");
        nim = input.nextLine();
        
        System.out.print("Masukkan Usia = ");
        usia = input.nextInt();
        
        System.out.print("Masukkan Rata - Rata Nilai = ");
        rataRataNilai = input.nextDouble();
        
        System.out.println("|-------------------------------------|");
        System.out.println("|              DATA ANDA              |");
        System.out.println("|-------------------------------------|");
        System.out.println("Nama = "+nama);
        System.out.println("Nim = "+nim);
        System.out.println("Usia = "+usia);
        System.out.println("Rata - Rata Nilai = "+rataRataNilai);
    }
    
}
