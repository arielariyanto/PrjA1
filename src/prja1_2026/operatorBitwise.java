package prja1_2026;
import java.util.Scanner;

public class operatorBitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.print("Masukkan nilai a = ");
        a = input.nextInt();
        System.out.print("Masukkan nilai b = ");
        b = input.nextInt();

        // Nilai awal
        System.out.println("\nNilai a = " + a);
        System.out.println("Biner a = " + Integer.toBinaryString(a));

        System.out.println("\nNilai b = " + b);
        System.out.println("Biner b = " + Integer.toBinaryString(b));

        // AND (&)
        System.out.println("\nHasil AND (&) = " + (a & b));
        System.out.println("Biner AND = " + Integer.toBinaryString(a & b));

        // OR (|)
        System.out.println("\nHasil OR (|) = " + (a | b));
        System.out.println("Biner OR = " + Integer.toBinaryString(a | b));

        // XOR (^)
        System.out.println("\nHasil XOR (^) = " + (a ^ b));
        System.out.println("Biner XOR = " + Integer.toBinaryString(a ^ b));

        // NOT (~)
        System.out.println("\nHasil NOT (~a) = " + (~a));
        System.out.println("Biner NOT = " + Integer.toBinaryString(~a));

        // Shift kiri (<<)
        System.out.println("\nHasil Shift Kiri (a << 1) = " + (a << 1));
        System.out.println("Biner Shift Kiri = " + Integer.toBinaryString(a << 1));

        // Shift kanan (>>)
        System.out.println("\nHasil Shift Kanan (a >> 1) = " + (a >> 1));
        System.out.println("Biner Shift Kanan = " + Integer.toBinaryString(a >> 1));
    }
}
