package prja1_2026;

public class operatorIncrementDecrement {
    public static void main(String[] args) {
         int angka = 5;

        // 1. POST-INCREMENT (angka++)
        // Nilai angka digunakan terlebih dahulu, baru kemudian ditambah 1.
        System.out.println("Post-increment: " + angka++);
        System.out.println("Nilai angka setelahnya: " + angka);


        // 2. PRE-INCREMENT (++angka)
        // Nilai angka ditambah 1 terlebih dahulu, baru kemudian digunakan.
        System.out.println("Pre-increment: " + ++angka);
        System.out.println("Nilai angka setelahnya: " + angka);


        // 3. POST-DECREMENT (angka--)
        // Nilai angka digunakan terlebih dahulu, baru kemudian dikurangi 1.
        System.out.println("Post-decrement: " + angka--);
        System.out.println("Nilai angka setelahnya: " + angka);


        // 4. PRE-DECREMENT (--angka)
        // Nilai angka dikurangi 1 terlebih dahulu, baru kemudian digunakan.
        System.out.println("Pre-decrement: " + --angka);
        System.out.println("Nilai angka setelahnya: " + angka);
    }   
}
