import java.util.ArrayList;

/**
 * Kelas {@code NoteTransaksi} digunakan untuk menyimpan data pemasukan dan pengeluaran.
 * Setiap transaksi memiliki atribut jenis, jumlah, tanggal, kategori, dan keterangan.
 */
public class NoteTransaksi {

    private ArrayList<Transaksi> daftarTransaksi = new ArrayList<>();

    /**
     * Menambahkan transaksi baru ke daftar.
     * @param jenis jenis transaksi (Pemasukan/Pengeluaran)
     * @param jumlah nilai transaksi
     * @param kategori kategori transaksi
     * @param keterangan deskripsi tambahan
     */
    public void tambahTransaksi(String jenis, double jumlah, String kategori, String keterangan) {
        Transaksi transaksi = new Transaksi(jenis, jumlah, kategori, keterangan);
        daftarTransaksi.add(transaksi);
    }

    /**
     * Menghitung total berdasarkan jenis transaksi.
     * @param jenis "Pemasukan" atau "Pengeluaran"
     * @return total keseluruhan
     */
    public double hitungTotal(String jenis) {
        double total = 0;
        for (Transaksi t : daftarTransaksi) {
            if (t.getJenis().equalsIgnoreCase(jenis)) {
                total += t.getJumlah();
            }
        }
        return total;
    }

    /**
     * Menampilkan seluruh transaksi dengan format tabel.
     */
    public void tampilkanSemuaTransaksi() {
        if (daftarTransaksi.isEmpty()) {
            System.out.println("Belum ada transaksi yang tercatat.");
            return;
        }

        System.out.printf("%-20s %-15s %-15s %-15s %-20s%n",
                "Tanggal", "Jenis", "Jumlah", "Kategori", "Keterangan");
        System.out.println("----------------------------------------------------------------------------");

        for (Transaksi t : daftarTransaksi) {
            System.out.printf("%-20s %-15s Rp %-13.0f %-15s %-20s%n",
                    t.getTanggal(), t.getJenis(), t.getJumlah(), t.getKategori(), t.getKeterangan());
        }
    }

    /**
     * Menghapus semua data transaksi.
     */
    public void hapusData() {
        daftarTransaksi.clear();
        System.out.println("🗑️ Semua data transaksi telah dihapus!");
    }
}
