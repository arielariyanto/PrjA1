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
public class BelajarMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan Panjang Persegi Panjang = ");
        int panjang = input.nextInt();
        
        System.out.print("Masukkan Lebar Persegi Panjang = ");
        int lebar = input.nextInt();
        
        System.out.println("|======================================|");
        System.out.println("|                 Hasil                |");
        System.out.println("|======================================|");
        //memanggil procedure
        luasPersegi(panjang, lebar);
        
        //memanggil function
        kelilingPersegi(panjang, lebar);
        
    }
    
    //procedure
    static void luasPersegi (int panjang, int lebar){
           int luas = panjang * lebar; 
           System.out.println("Luas Persegi = "+ luas);
    }    
    
    //function
    static int kelilingPersegi(int panjang, int lebar){
        int keliling = 2 * (panjang + lebar);
        System.out.println("Keliling Persegi = "+keliling);
        return 100;
    }
}
