package prja1_2026;

import java.util.Scanner;
public class belajarFuntionBoolean {
    
    static boolean cekGenap(int n){
        return n % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int n = input.nextInt();

        if (cekGenap(n)) {
            System.out.println(n + " adalah bilangan genap");
        } else {
            System.out.println(n + " adalah bilangan ganjil");
        }
    }
}
