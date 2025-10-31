/**
 * Kelas {@code ManajemenKeuangan} bertanggung jawab untuk mengelola data keuangan pengguna,
 * termasuk pemasukan, pengeluaran, saldo, dan menampilkan laporan keuangan.
 * Kelas ini menggunakan komposisi dengan {@code NoteTransaksi} untuk menyimpan data transaksi.
 */
public class ManajemenKeuangan {

    public static final int BATAS_SALDO_RENDAH = 100000;

    private final NoteTransaksi noteTransaksi = new NoteTransaksi();
    private String namaPengguna;
    private double saldo;

    public ManajemenKeuangan(String n, double s) {
        this.namaPengguna = n;
        this.saldo = s;
    }

    /**
     * Menambah pemasukan ke daftar transaksi dan memperbarui saldo.
     * Tanggal transaksi ditambahkan secara otomatis.
     * @param jumlah jumlah uang yang ditambahkan
     */
    public void tambahPemasukan(double jumlah) {
        noteTransaksi.tambahTransaksi("Pemasukan", jumlah, "Umum", "-");
        saldo += jumlah;
        System.out.println("\n✅ Pemasukan ditambahkan: Rp " + jumlah);
    }

    /**
     * Menambah pengeluaran ke daftar transaksi dan memperbarui saldo.
     * @param jumlah jumlah uang yang dikeluarkan
     * @param keterangan deskripsi pengeluaran
     * @param kategori kategori pengeluaran (misal: Belanja, Transportasi)
     */
    public void tambahPengeluaran(double jumlah, String keterangan, String kategori) {
        noteTransaksi.tambahTransaksi("Pengeluaran", jumlah, kategori, keterangan);
        saldo -= jumlah;
        System.out.println("💸 Pengeluaran ditambahkan: Rp " + jumlah + " untuk " + keterangan);
    }

    /**
     * Menampilkan laporan keuangan pengguna, termasuk total pemasukan,
     * total pengeluaran, dan saldo akhir.
     */
    public void tampilkanLaporanKeuangan() {
        System.out.println("\n==== 📊 Laporan Keuangan ====");
        System.out.println("Nama Pengguna   : " + namaPengguna);
        System.out.println("Saldo Saat Ini  : Rp " + saldo);
        System.out.println("Total Pemasukan : Rp " + noteTransaksi.hitungTotal("Pemasukan"));
        System.out.println("Total Pengeluaran: Rp " + noteTransaksi.hitungTotal("Pengeluaran"));
        System.out.println("Sisa Keuangan   : Rp " + saldo);
    }

    /**
     * Memberikan peringatan apabila saldo di bawah batas minimum.
     */
    public void peringatanSaldo() {
        if (saldo < BATAS_SALDO_RENDAH) {
            System.out.println("⚠️ Peringatan! Saldo rendah: Rp " + saldo);
        }
    }

    /**
     * Menampilkan daftar transaksi secara detail.
     */
    public void lihatTransaksi() {
        System.out.println("\n=== 💼 Daftar Transaksi Detail ===");
        noteTransaksi.tampilkanSemuaTransaksi();
    }

    /**
     * Menghapus seluruh data transaksi dan mengatur saldo menjadi 0.
     */
    public void hapusData() {
        noteTransaksi.hapusData();
        saldo = 0;
        System.out.println("Saldo telah direset menjadi Rp 0.");
    }

    // Getter & Setter
    public String getNamaPengguna() {
        return namaPengguna;
    }

    public void setNamaPengguna(String namaPengguna) {
        this.namaPengguna = namaPengguna;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
