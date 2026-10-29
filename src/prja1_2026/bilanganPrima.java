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
public class bilanganPrima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int jumlah, angka, faktor, pembagi;
        
        System.out.print("Masukkan jumlah bilangan prima: ");
        jumlah = input.nextInt();

        System.out.println("Deret bilangan prima:");

        int bilPrima = 0;
        
        for (angka = 2; bilPrima < jumlah; angka++) {

            faktor = 0;
            
            for (pembagi = 2; pembagi < angka; pembagi++) {

                if (angka % pembagi == 0) {
                    faktor++;
                }
            }
 
            if (faktor == 0) {
                System.out.print(angka + " ");
                bilPrima++;
            }
        }
    }
}
     

