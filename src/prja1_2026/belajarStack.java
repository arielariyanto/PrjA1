/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prja1_2026;

/**
 *
 * @author User
 */
public class belajarStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int stack[] = new int[5];
        int top = -1;
        
        top = top + 1;
        stack[top] = 10;
        
        top = top + 1;
        stack[top] = 20;
        
        top = top + 1;
        stack[top] = 30;
        
        if(top >= 0){
            int data = stack[top];
            top = top - 1;
            System.out.println("Data Keluar = "+ data);
            
            for(int i = top; i >= top; i-- ){
                data = stack[i];
                System.out.println("Data ="+i+":" + data);
            }
        }else{
            System.out.println("Stack Kosong");
        }
    }
    
}
