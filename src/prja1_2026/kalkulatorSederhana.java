
package prja1_2026;
import java.util.Scanner;

public class kalkulatorSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int angka1, angka2, tambah,kurang,bagi,kali,sisa;
        
        
        System.out.print("Masukkan Angka Pertama: ");
        angka1 = input.nextInt();

        System.out.print("Masukkan Angka Kedua: ");
        angka2 = input.nextInt();
        
        tambah = angka1 + angka2;
        System.out.println("Hasil Penjumlahan " +angka1+ "+" +angka2+ "= " +tambah);
        
        kurang = angka1 - angka2;
        System.out.println("Hasil Pengurangan " +angka1+ "-" +angka2+ "= " +kurang);

        kali = angka1 * angka2;
        System.out.println("Hasil Perkalian " +angka1+ "*" +angka2+ "= " +kali);
        
        bagi = angka1 / angka2;
        System.out.println("Hasil Pembagian " +angka1+ "/" +angka2+ "= " +bagi);
        
        bagi = angka1 % angka2;
        System.out.println("Hasil Modulus " +angka1+ "%" +angka2+ "= " +bagi);
    }
}
    
    
