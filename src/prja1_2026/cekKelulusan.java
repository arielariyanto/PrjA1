package prja1_2026;
import java.util.Scanner;
public class cekKelulusan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai, kehadiran;

        System.out.print("Masukkan Nilai = ");
        nilai = input.nextInt();

        System.out.print("Masukkan Kehadiran = ");
        kehadiran = input.nextInt();

        // Operator Perbandingan >=
        // Operator Logika && (AND)
        if (nilai >= 75 && kehadiran >= 80) {
            System.out.println("LULUS");
            System.out.println("Alasan = Nilai dan Kehadiran Memenuhi Syarat");
        } else {
            System.out.println("TIDAK LULUS");

            // Operator Perbandingan < 
            // Operator Logika || (OR)
            if (nilai < 75 || kehadiran < 80) {
                System.out.println("Ada syarat kelulusan yang belum terpenuhi.");
            }

            // Operator Logika ! (NOT)
            // Operator Perbandingan >=
            if (!(nilai >= 75)) {
                System.out.println("Alasan = Nilai Kurang Dari 75");
            }
            // Operator Logika ! (NOT)
            // Operator Perbandingan >=
            if (!(kehadiran >= 80)) {
                System.out.println("Alasan = Kehadiran Kurang Dari 80");
            }
        }
    }
}

