# Tugas-Besar-PBO-2025
TUGAS BESAR PEMROGRAMAN BERORIENTASI OBJEK 2025, Sistem Manajemen Transaksi Harisna Optical berbasis Java dan JDBC

# Sistem Manajemen Transaksi - Harisna Optical 👓

Repository ini berisi proyek **Tugas Besar Pemrograman Berorientasi Objek (PBO)** yang mengimplementasikan sistem manajemen transaksi untuk toko kacamata **Harisna Optical** yang berlokasi di Pariaman Tengah.

## 👤 Identitas Pengembang
* **Nama** : Luthfi Harisna Mufti
* **NIM** : 2411523019
* **Dosen Pengampu**: Jefril Rahmadoni, M.Kom
* **Instansi**: Fakultas Teknologi Informasi, Universitas Andalas

## 📝 Deskripsi Proyek
Sistem ini dirancang untuk mendigitalisasi proses pencatatan transaksi di Harisna Optical. Program ini mampu mengolah data pelanggan, resep mata, serta menghitung total biaya secara otomatis dengan integrasi database MySQL untuk penyimpanan data yang permanen.

## 🚀 Fitur Utama & Kriteria PBO
Proyek ini memenuhi seluruh kriteria penilaian mata kuliah PBO:
- **Inheritance & Interface**: Menggunakan struktur kelas induk `Optical` dan interface `Manajemen`.
- **Collection Framework**: Implementasi `ArrayList` untuk manajemen log aktivitas sistem.
- **JDBC (Java Database Connectivity)**: Koneksi sistem ke database MySQL untuk operasi CRUD.
- **Exception Handling**: Penanganan kesalahan input (InputMismatchException) dan error database (SQLException).
- **Manipulasi Data**: Pengolahan String (Uppercase/Trim), Date (LocalDate), dan Matematika (Perhitungan Pajak PPN 11%).

## 🛠️ Teknologi yang Digunakan
- **Bahasa Pemrograman**: Java (JDK 17+)
- **Database**: MySQL
- **Library**: JDBC MySQL Connector
- **Tools**: VS Code / IntelliJ IDEA / NetBeans

## 📂 Struktur File
- `Main.java`: Kelas utama untuk menjalankan alur program.
- `DatabaseConnection.java`: Konfigurasi koneksi ke database.
- `TransaksiPelanggan.java`: Subclass yang menangani logika transaksi.
- `TransaksiDAO.java`: Mengatur operasi penyimpanan ke database (CRUD).
- `Optical.java` & `Manajemen.java`: Struktur dasar PBO (Superclass & Interface).
- `LAPORAN_TUGAS_BESAR.docx`: Dokumen penjelasan teknis lengkap.

## ⚙️ Cara Menjalankan
1. Impor database `db_harisna_optical` menggunakan file SQL yang disediakan.
2. Pastikan Driver MySQL Connector sudah terpasang pada project.
3. Jalankan `Main.java`.
