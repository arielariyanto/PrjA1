/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prja1_2026;

/**
 *
 * @author User
 */
public class arrayDuaDimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] angka = new int[3][5];

        for (int tingkat = 0; tingkat < 3; tingkat++) {

            for (int kolom = 0; kolom < 5; kolom++) {

                if (tingkat == 1) {
                    angka[tingkat][kolom] = (kolom * 2) + 1;
                } else {
                    angka[tingkat][kolom] = (kolom * 2) + 2;
                }

            }
        }

        for (int tingkat = 0; tingkat < 3; tingkat++) {
            for (int kolom = 0; kolom < 5; kolom++) {
                System.out.print(angka[tingkat][kolom] + " ");
            }
            System.out.println();
        }
    }
}
