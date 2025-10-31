/**
 * Kelas MainApp merupakan kelas utama yang menjalankan program manajemen keuangan.
 * Program ini membuat objek dari kelas {@code ManajemenKeuangan} dan melakukan beberapa operasi
 * seperti menambah pemasukan, menambah pengeluaran (dengan kategori dan tanggal otomatis),
 * menampilkan laporan keuangan, memberi peringatan saldo, melihat daftar transaksi,
 * dan menghapus data.
 *
 * @author Sigit
 * @version 1.2
 */
public class MainApp {
    public static void main(String[] args) {
        // Membuat objek manajemen keuangan untuk pengguna
        ManajemenKeuangan mk = new ManajemenKeuangan("Sigit", 250000);

        // Menambahkan beberapa transaksi contoh
        mk.tambahPemasukan(500000);
        mk.tambahPengeluaran(200000, "Belanja kebutuhan", "Belanja");
        mk.tambahPengeluaran(150000, "Tagihan listrik", "Tagihan");

        // Menampilkan laporan dan transaksi
        mk.tampilkanLaporanKeuangan();
        mk.peringatanSaldo();
        mk.lihatTransaksi();

        // Menghapus semua data transaksi
        mk.hapusData();
    }
}
