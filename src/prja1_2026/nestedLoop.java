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
public class nestedLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int b=1,k=1;
        
        for (b=1 ; b<=3 ; b++){
            for(k=1 ; k<=4 ; k++){
            System.out.print(k);
            }
            System.out.print("\n");
        }
    }
}
