package prja1_2026;
public class belajarOverloading {
        
    static int jumlah(int a, int b) {
        return a + b;
    }

    static int jumlah(int a, int b, int c) {
        return a + b + c;
    }
    
    public static void main(String[] args) {
        System.out.println(jumlah(10, 20));
        System.out.println(jumlah(10, 20, 30));
    }   
}
