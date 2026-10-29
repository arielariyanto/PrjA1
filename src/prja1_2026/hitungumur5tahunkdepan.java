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
public class hitungumur5tahunkdepan {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        String nama;
        int umurSaatIni,umurBaru;
        
        System.out.print("Masukkan Nama Anda = ");
        nama = input.next();
        System.out.print("Masukkan Umur Anda = ");
        umurSaatIni = input.nextInt();
        
        umurBaru = umurSaatIni + 5;
        
        System.out.println("Nama Anda  " + nama);
        System.out.println("Umur Anda Saat Ini " + umurSaatIni);
        System.out.println("Umur Anda 5 Tahun Kedepan " + umurBaru);
    }
}
