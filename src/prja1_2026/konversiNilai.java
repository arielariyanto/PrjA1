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
public class konversiNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai;
        
        System.out.print("Masukkkan Nilai = ");
        nilai = input.nextInt();
        
        
        if (nilai == 1){
            System.out.print("pertama");
            
            
        }else if (nilai >= 2 && nilai <=9){
            System.out.println("tengah");
            //konversi nilai ke teks
            if(nilai == 1){
                System.out.println("Satu");
            }else if (nilai == 2){
                System.out.println("Dua");
            }else if (nilai == 3){
                System.out.println("Tiga");
            }else if (nilai == 4){
                System.out.println("Empat");
            }else if (nilai == 5){
                System.out.println("Lima");
            }else if (nilai == 6){
                System.out.println("Enam");
            }else if (nilai == 7){
                System.out.println("Tujuh");
            }else if (nilai == 8){
                System.out.println("Delapan");
//            }else if(nilai == 9){
//                System.out.println("Sembilan");
            }else{
                System.out.println("Sembilan");
            }            
//        }else if (nilai > 9){
//            System.out.print("akhir");  
    }else{
        System.out.println("Akhir");
        }
    }
}

//            switch (nilai) {
//                case 2:
//                    System.out.println("dua");
//                    break;
//                case 3:
//                    System.out.println("tiga");
//                    break;
//                case 4:
//                    System.out.println("empat");
//                    break;
//                case 5:
//                    System.out.println("lima");
//                    break;
//                case 6:
//                    System.out.println("enam");
//                    break;
//                case 7:
//                    System.out.println("tujuh");
//                    break;
//                case 8:
//                    System.out.println("delapan");
//                    break;
//                case 9:
//                    System.out.println("sembilan");
//                    break;
