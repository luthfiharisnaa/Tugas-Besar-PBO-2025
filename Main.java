import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // siapin scanner buat baca ketikan user di console
        Scanner sc = new Scanner(System.in);
        TransaksiDAO dao = new TransaksiDAO();
        
        System.out.println("=== SISTEM MANAJEMEN HARISNA OPTICAL ===");

        // perulangan biar menu terus muncul selama user gak milih keluar
        while (true) {
            System.out.println("\nMenu Utama:");
            System.out.println("1. Tambah Transaksi");
            System.out.println("2. Keluar");
            System.out.print("Pilih menu: ");
            
            int pil;
            try {
                pil = sc.nextInt();
                sc.nextLine(); // bersihin sisa enter di buffer
            } catch (InputMismatchException e) {
                // kalau user malah ngetik huruf pas disuruh milih menu angka
                System.err.println("Input salah! Masukkan angka 1 atau 2.");
                sc.nextLine(); 
                continue;
            }

            if (pil == 1) {
                // handle kalau ada kesalahan pas ngetik harga
                try {
                    System.out.print("Nama Pelanggan: "); 
                    String n = sc.nextLine();
                    
                    System.out.print("Resep Mata: "); 
                    String r = sc.nextLine();
                    
                    System.out.print("Harga Frame: "); 
                    double f = sc.nextDouble(); 
                    
                    System.out.print("Harga Lensa: "); 
                    double l = sc.nextDouble();
                    sc.nextLine(); // bersihin buffer lagi

                    // buat objek transaksi baru dari data yang diinput
                    TransaksiPelanggan t = new TransaksiPelanggan(n, r, f, l);
                    
                    // jalanin fungsi simpan ke database mysql
                    dao.simpan(t);
                    
                    // cetak nota di layar
                    t.tampilkanData();
                    
                } catch (InputMismatchException e) {
                    // pesan peringatan kalau harga diisi pake huruf
                    System.err.println("Error: Harga frame dan lensa harus berupa angka!");
                    sc.nextLine(); 
                }
            } else if (pil == 2) {
                System.out.println("Terima kasih telah menggunakan sistem Harisna Optical.");
                break; // stop looping dan keluar aplikasi
            } else {
                System.out.println("Pilihan tidak tersedia.");
            }
        }
        sc.close();
    }
}