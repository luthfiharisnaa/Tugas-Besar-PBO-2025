import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// ini kelas anak yang ambil sifat dari kelas Optical (inheritance)
public class TransaksiPelanggan extends Optical {
    private String namaPelanggan;
    private String resep;
    private double hargaFrame;
    private double hargaLensa;
    private LocalDate tanggal;

    public TransaksiPelanggan(String nama, String resep, double frame, double lensa) {
        // panggil constructor induk buat set lokasi toko di Pariaman
        super("Harisna Optical", "Jl. Pahlawan, Kp. Jawa I, Pariaman Tengah");
        
        // biar rapi, nama pelanggan otomatis dibikin kapital semua
        this.namaPelanggan = nama.trim().toUpperCase();
        this.resep = resep;
        this.hargaFrame = frame;
        this.hargaLensa = lensa;
        
        // ambil tanggal otomatis hari ini pas transaksi dibuat
        this.tanggal = LocalDate.now();
    }

    // rumus matematika buat hitung total belanja kacamata plus pajak 11%
    public double hitungTotal() {
        return (hargaFrame + hargaLensa) * 1.11; 
    }

    @Override 
    public void tambahData() { 
        // masukin info input ke dalam list log history
        logAktivitas.add("Input transaksi baru untuk pelanggan: " + namaPelanggan); 
    }

    @Override 
    public void tampilkanData() {
        // ubah format tanggal biar enak dibaca (contoh: 24 December 2025)
        DateTimeFormatter formatIndo = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        
        System.out.println("\n--- NOTA TRANSAKSI HARISNA OPTICAL ---");
        System.out.println("Alamat Toko  : " + this.alamat);
        System.out.println("Tanggal      : " + tanggal.format(formatIndo));
        System.out.println("Pelanggan    : " + namaPelanggan);
        System.out.println("Resep Mata   : " + resep);
        
        // pake String.format biar angka bayarnya gak kepanjangan nol di belakangnya
        System.out.println("Total Bayar  : Rp " + String.format("%,.2f", hitungTotal()));
        System.out.println("--------------------------------------");
    }

    @Override 
    public void hapusData(String id) {}

    // method bantu buat ambil data pas mau disave ke database
    public String getNama() { return namaPelanggan; }
    public String getResep() { return resep; }
}