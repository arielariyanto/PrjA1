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
public class angkaTerbesar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka1, angka2, angka3, terbesar;

        System.out.print("Masukkan angka ke-1: ");
        angka1 = input.nextInt();

        System.out.print("Masukkan angka ke-2: ");
        angka2 = input.nextInt();

        System.out.print("Masukkan angka ke-3: ");
        angka3 = input.nextInt();

        if (angka1 > angka2 && angka1 > angka3) {
            terbesar = angka1;
        } else if (angka2 > angka1 && angka2 > angka3) {
            terbesar = angka2;
        } else {
            terbesar = angka3;
        }

        System.out.println("Angka terbesar: " + terbesar);
    }
    }
    

