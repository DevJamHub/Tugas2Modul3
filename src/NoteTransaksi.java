import java.util.ArrayList;

/**
 * Kelas {@code NoteTransaksi} digunakan untuk menyimpan data pemasukan dan pengeluaran.
 * Kelas ini juga menyediakan metode untuk menghitung total dan menghapus data transaksi.
 */
public class NoteTransaksi {

    private ArrayList<Double> daftarPemasukan = new ArrayList<>();   // Daftar semua pemasukan
    private ArrayList<Double> daftarPengeluaran = new ArrayList<>(); // Daftar semua pengeluaran

    /**
     * Konstruktor default tanpa parameter.
     */
    public NoteTransaksi() {}

    /**
     * Menghitung total nilai dari daftar yang diberikan.
     * @param daftar daftar nilai (pemasukan/pengeluaran)
     * @return total keseluruhan dari daftar
     */
    public double hitungTotal(ArrayList<Double> daftar) {
        double total = 0;
        for (double nilai : daftar) {
            total += nilai;
        }
        return total;
    }

    /**
     * Menghitung sisa keuangan dari total pemasukan dikurangi total pengeluaran.
     * @return sisa keuangan
     */
    public double hitungSisaKeuangan() {
        return hitungTotal(daftarPemasukan) - hitungTotal(daftarPengeluaran);
    }

    /**
     * Menghapus semua data pemasukan dan pengeluaran.
     */
    public void hapusData() {
        daftarPemasukan.clear();
        daftarPengeluaran.clear();
        System.out.println("🗑️ Semua data transaksi telah dihapus!");
    }

    // ======== Getter & Setter ========

    public ArrayList<Double> getDaftarPemasukan() {
        return daftarPemasukan;
    }

    public void setDaftarPemasukan(ArrayList<Double> daftarPemasukan) {
        this.daftarPemasukan = daftarPemasukan;
    }

    public ArrayList<Double> getDaftarPengeluaran() {
        return daftarPengeluaran;
    }

    public void setDaftarPengeluaran(ArrayList<Double> daftarPengeluaran) {
        this.daftarPengeluaran = daftarPengeluaran;
    }
}
