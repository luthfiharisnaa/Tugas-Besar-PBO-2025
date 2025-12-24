import java.sql.*;

public class TransaksiDAO {
    // ini fungsi buat mindahin data dari java ke tabel transaksi di database
    public void simpan(TransaksiPelanggan t) {
        String sql = "INSERT INTO transaksi (nama, resep, total) VALUES (?, ?, ?)";
        
        // pake try-with-resources biar koneksi otomatis ketutup sendiri kalau udah kelar
        try (Connection conn = DatabaseConnection.getKoneksi();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            // isi tanda tanya di query SQL sesuai urutannya
            pstmt.setString(1, t.getNama());
            pstmt.setString(2, t.getResep());
            pstmt.setDouble(3, t.hitungTotal());
            pstmt.executeUpdate(); // eksekusi simpan ke database
            
            System.out.println("Data tersimpan ke database!");
        } catch (SQLException e) {
            // kalau ada masalah sama mysql-nya, pesan error muncul di sini
            System.err.println("Gagal: " + e.getMessage()); 
        }
    }
}