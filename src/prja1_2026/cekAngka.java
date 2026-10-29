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
public class cekAngka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double angka;

        System.out.print("Input a number: ");
        angka = input.nextDouble();

        if (angka == 0) {
            System.out.println("nol");
        } else {
            if (angka > 0) {
                System.out.print("positive");
            } else {
                System.out.print("negative");
            }

            if (Math.abs(angka) < 1) {
                System.out.println(" small");
            } else if (Math.abs(angka) > 1000000) {
                System.out.println(" large");
            } else {
                System.out.println();
            }
        }
    }
    
}
