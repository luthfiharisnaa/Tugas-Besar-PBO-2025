import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    // ini alamat database mysql di laptop, nama db-nya db_harisna_optical
    private static final String URL = "jdbc:mysql://localhost:3306/db_harisna_optical";
    private static final String USER = "root";
    private static final String PASSWORD = ""; 

    // method ini buat panggil koneksi tiap kali mau hubungin java ke database
    public static Connection getKoneksi() throws SQLException {
        // pake drivermanager buat buka akses koneksinya
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}