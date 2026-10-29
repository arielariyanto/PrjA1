/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prja1_2026;

/**
 *
 * @author User
 */
public class kuisbuAyu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(int baris = 1; baris <=5; baris++){
            
            for(int spasi = 3; spasi > baris; spasi--){
                System.out.print("  ");
            }
            for(int kolom = 1; kolom <= baris; kolom++){
                System.out.print("A");
            }
            
            System.out.println(" ");
        }
    }
    
}
