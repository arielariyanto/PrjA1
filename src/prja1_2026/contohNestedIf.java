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
public class contohNestedIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int status, tb;
        
        System.out.print("Masukkan Status = ");
        status = input.nextInt();
        
        System.out.print("Masukkan Tinggi Badan = ");
        tb = input.nextInt();
        
        if(status==1){
            if(tb>150){
                System.out.println("Pria Tinggi");
            }else{
                System.out.println("Pria Kecil");
            }
        }else{
            if(tb<150){
                System.out.println("Wanita Kecil");
            }else{
                System.out.println("Wanita Tinggi");
            }
        }
    }
    
}
