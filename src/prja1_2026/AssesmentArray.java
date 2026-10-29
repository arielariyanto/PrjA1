
package prja1_2026;

import java.util.Scanner;

public class AssesmentArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int baris, kolom;
        int jumlah = 0;

        
        System.out.print("Masukkan Baris = ");
        baris = input.nextInt();
        
        System.out.print("Masukkan Kolom = ");
        kolom = input.nextInt();
        
        int[][] bilanganPrima = new int[baris][kolom];
        
        for (int angka = 2; jumlah < kolom; angka++) {
 
            int pembagi = 0;
            for (int d = 1; d <= angka; d++) {
                if (angka % d == 0) {
                    pembagi++;
                }
            }
 
            if (pembagi == 2) {
                for (int i = 0; i < baris; i++) {
                    bilanganPrima[i][jumlah] = angka;
                }
                jumlah++;
            }
        }
 
        System.out.println("Hasil Bilangan Prima = ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(bilanganPrima[i][j] + " ");
            }
            System.out.println();
        }
    
                
    }
    
}
