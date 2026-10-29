package prja1_2026;

import java.sql.Connection;

public class koneksiTes {

    public static void main(String[] args) {
        Connection hasilKoneksi = koneksi.getkoneksi();

        if (hasilKoneksi != null) {
            System.out.println("Berhasil terhubung ke database!");

            try {
                hasilKoneksi.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Koneksi ke database gagal!");
        }
    }
}