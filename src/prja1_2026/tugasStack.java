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
public class tugasStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        int[] stack = new int[5];   
        int top = -1;               
        int pilihan = 0;
 
        for (; pilihan != 4; ) {
            System.out.println();
            System.out.println("===== MENU STACK =====");
            System.out.println("1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. Tampilkan Stack");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            if (input.hasNextInt()) {
                pilihan = input.nextInt();
            } else {
                input.next();   
                pilihan = 0;    
            }
 
            switch (pilihan) {
                case 1:
                    // PUSH
                    if (top == stack.length - 1) {
                        System.out.println("Stack penuh!");
                    } else {
                        System.out.print("Masukkan angka: ");
                        if (input.hasNextInt()) {
                            int angka = input.nextInt();
                            top = top + 1;
                            stack[top] = angka;
                            System.out.println("Berhasil push " + angka);
                        } else {
                            input.next();
                            System.out.println("Input harus berupa angka!");
                        }
                    }
                    break;
 
                case 2:
                    // POP
                    if (top == -1) {
                        System.out.println("Stack kosong!");
                    } else {
                        int data = stack[top];
                        top = top - 1;
                        System.out.println("Data yang di-pop: " + data);
                    }
                    break;
 
                case 3:
                    // Tampilkan Stack
                    if (top == -1) {
                        System.out.println("Stack kosong!");
                    } else {
                        System.out.println("Isi stack (dari atas):");
                        for (int i = top; i >= 0; i--) {
                            System.out.println(stack[i]);
                        }
                    }
                    break;
 
                case 4:
                    //keluar
                    System.out.println("Program selesai.");
                    break;
 
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
