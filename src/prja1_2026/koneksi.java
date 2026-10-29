
package prja1_2026;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {

    public static Connection getkoneksi() {
        Connection koneksi = null;

        try {
            koneksi = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/db_belajarwsibd",
                "root",
                ""
            );

            System.out.println("Koneksi berhasil!");

        } catch (SQLException e) {
            System.out.println("Koneksi gagal!");
            System.out.println(e.getMessage());
        }

        return koneksi;
    }
}
