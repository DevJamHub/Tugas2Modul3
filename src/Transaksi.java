import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Kelas {@code Transaksi} mewakili satu transaksi dengan detail lengkap:
 * jenis (pemasukan/pengeluaran), jumlah, kategori, keterangan, dan tanggal otomatis.
 */
public class Transaksi {
    private String jenis;
    private double jumlah;
    private String kategori;
    private String keterangan;
    private String tanggal;

    /**
     * Konstruktor untuk membuat objek transaksi baru dengan tanggal otomatis.
     */
    public Transaksi(String jenis, double jumlah, String kategori, String keterangan) {
        this.jenis = jenis;
        this.jumlah = jumlah;
        this.kategori = kategori;
        this.keterangan = keterangan;
        this.tanggal = new SimpleDateFormat("dd-MM-yyyy HH:mm").format(new Date());
    }

    // Getter
    public String getJenis() {
        return jenis;
    }

    public double getJumlah() {
        return jumlah;
    }

    public String getKategori() {
        return kategori;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public String getTanggal() {
        return tanggal;
    }
}
