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
public class tugas2periode {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        String nama;
        int umur,umurBaru,periode;
        
        System.out.print("Masukkan Nama = ");
        nama = input.next();
        System.out.print("Masukkan Umur Anda Saat Ini = ");
        umur = input.nextInt();
        System.out.print("Masukkan Periode = ");
        periode = input.nextInt();
        
        umurBaru = umur + periode;
        
        System.out.println("Nama Anda = " + nama);
        System.out.println("Umur Anda Saat Ini = " + umur);
        System.out.print("Umur Anda Pada Periode " + periode);
        System.out.print(" Tahun Adalah " + umurBaru); System.out.print(" Tahun");
    }
}
