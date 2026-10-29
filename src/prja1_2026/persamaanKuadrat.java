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
public class persamaanKuadrat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nilaiA, nilaiB, nilaiC;
        double diskriminan;
        double hasil1, hasil2;

        System.out.print("Input a: ");
        nilaiA = input.nextDouble();

        System.out.print("Input b: ");
        nilaiB = input.nextDouble();

        System.out.print("Input c: ");
        nilaiC = input.nextDouble();

        diskriminan = (nilaiB * nilaiB) - (4 * nilaiA * nilaiC);

        if (diskriminan > 0) {
            hasil1 = (-nilaiB + Math.sqrt(diskriminan)) / (2 * nilaiA);
            hasil2 = (-nilaiB - Math.sqrt(diskriminan)) / (2 * nilaiA);

            System.out.println("The roots are " + hasil1 + " and " + hasil2);
        } 
        else if (diskriminan == 0) {
            hasil1 = -nilaiB / (2 * nilaiA);

            System.out.println("The roots are " + hasil1 + " and " + hasil1);
        } 
        else {
            System.out.println("The equation has no real roots");
        }

        input.close();
    }
}
    

