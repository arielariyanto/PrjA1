/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prja1_2026;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
import java.util.Locale;
/**
 *
 * @author User
 */
public class BelajarTipeData {
    public static void main(String[] args) {
    String nama,alamat;
    Date tanggalLahir;
    Double ukt;
    boolean jenisKelamin;
    
    Scanner input = new Scanner (System.in);
    
    System.out.print("Masukkan Nama Anda = ");
    nama = input.nextLine(); 
    
    System.out.print("Masukkan tanggal lahir (dd-MM-yyyy): ");
    String tanggal = input.nextLine();
    try {
            SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
            tanggalLahir = format.parse(tanggal);
        } catch (Exception e) {
            System.out.println("Format tanggal salah!");
            return;
        }
    
    System.out.print("Masukkan alamat: ");
    alamat = input.nextLine();
    
    System.out.print("Masukkan UKT: ");
    ukt = input.nextDouble();
    input.nextLine();
    
    System.out.print("Jenis kelamin (L/P): ");
    String jk = input.nextLine();
    jenisKelamin = jk.equalsIgnoreCase("L");
    
    System.out.println("\n=== DATA MAHASISWA ===");
        System.out.println("Nama           : " + nama);
        System.out.println("Alamat         : " + alamat);
        SimpleDateFormat formatOutput = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Tanggal Lahir  : " + formatOutput.format(tanggalLahir));
        NumberFormat rupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        System.out.println("UKT            : " + rupiah.format(ukt));
        System.out.println("Jenis Kelamin  : " +
        (jenisKelamin ? "Laki-laki" : "Perempuan"));
    }    
}
