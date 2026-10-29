package prja1_2026;
public class belajarFunction {
    static double luasLingkaran(double r){
        double phi = 3.14;
        return phi * r * r;
    }
    public static void main(String[] args) {
        double luas = luasLingkaran(10);
        System.out.println("Luas Lingkaran = "+ luas);
    }
    
}
