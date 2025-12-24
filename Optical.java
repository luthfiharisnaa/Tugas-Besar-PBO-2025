import java.util.ArrayList;

// ini kelas induk, isinya info umum toko yang bakal dipake di kelas lain
public abstract class Optical implements Manajemen {
    protected String namaToko;
    protected String alamat;
    // pake ArrayList buat catat riwayat atau log biar gak hilang selama aplikasi jalan
    protected ArrayList<String> logAktivitas = new ArrayList<>(); 

    public Optical(String namaToko, String alamat) {
        this.namaToko = namaToko;
        this.alamat = alamat;
    }
}