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
public class inputBilangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan, urutan;

        System.out.print("Masukkan Bilangan: ");
        bilangan = input.nextInt();
        int n = bilangan;

        if (bilangan % 2 == 0) {
            // genap, mulai dari 2
            bilangan = 2;   
            System.out.println("Menampilkan " + n + " angka genap:");
            for (urutan = 1; urutan <= n; urutan++) {
                System.out.print(bilangan + " ");
                bilangan += 2;
            }
        } else {
            // ganjil, mulai dari 1
            bilangan = 1;
            System.out.println("Menampilkan " + n + " angka ganjil:");
            for (urutan = 1; urutan <= n; urutan++) {
                System.out.print(bilangan +" ");
                bilangan += 2;
            }
        }
    }

}
