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
public class perbandinganNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int nilai;
        
        System.out.print("Masukkan Nilai = ");
        nilai = input.nextInt();
        
        if(nilai>10){
            System.out.println("Nilai Besar");
        }else{
            System.out.println("Nilai Kecil");
        }
    }
    
}
