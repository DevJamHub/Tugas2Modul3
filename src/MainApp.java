/**
 * Kelas MainApp merupakan kelas utama yang menjalankan program manajemen keuangan.
 * Program ini membuat objek dari kelas {@code ManajemenKeuangan} dan melakukan beberapa operasi
 * seperti menambah pemasukan, menambah pengeluaran, menampilkan laporan keuangan,
 * memberi peringatan saldo, melihat daftar transaksi, dan menghapus data.
 *
 * @author Sigit
 * @version 1.1
 */
public class MainApp {
    // Program utama
    public static void main(String[] args) {
        // Membuat objek manajemen keuangan untuk pengguna
        ManajemenKeuangan mk = new ManajemenKeuangan("Sigit", 250000);

        // Menambahkan beberapa transaksi contoh

        System.out.println("Ini dari terminal");
        mk.tambahPemasukan(500000);
        mk.tambahPengeluaran(200000, "Belanja kebutuhan");
        mk.tambahPengeluaran(150000, "Tagihan listrik");

        // Menampilkan laporan dan transaksi
        mk.tampilkanLaporanKeuangan();
        mk.peringatanSaldo();
        mk.lihatTransaksi();

        // Menghapus semua data transaksi
        mk.hapusData();
    }
}