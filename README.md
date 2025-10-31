# 📘 Aplikasi Manajemen Keuangan Sederhana

## 📄 Deskripsi Proyek

Aplikasi **Manajemen Keuangan Sederhana** ini dibuat menggunakan bahasa pemrograman **Java** dengan pendekatan **Object-Oriented Programming (OOP)**. Program ini bertujuan untuk membantu pengguna dalam **mengelola keuangan pribadi**, seperti menambah pemasukan, mencatat pengeluaran, melihat laporan keuangan, dan menghapus seluruh data transaksi.

---

## 🔧 Fitur Utama

* **Tambah Pemasukan:** Menambahkan jumlah uang yang masuk ke saldo dan mencatat ke daftar transaksi.
* **Tambah Pengeluaran:** Menambahkan jumlah uang yang keluar beserta keterangannya.
* **Laporan Keuangan:** Menampilkan ringkasan pemasukan, pengeluaran, dan saldo akhir.
* **Peringatan Saldo:** Menampilkan notifikasi jika saldo di bawah batas minimum (Rp100.000).
* **Lihat Transaksi:** Menampilkan semua daftar pemasukan dan pengeluaran yang tersimpan.
* **Hapus Data:** Menghapus semua data transaksi dan mengatur saldo menjadi 0.

---

## 📁 Struktur Kelas

Aplikasi ini terdiri dari tiga kelas utama:

### 1. `MainApp`

* Berfungsi sebagai **kelas utama (entry point)** program.
* Membuat objek dari kelas `ManajemenKeuangan`.
* Menjalankan berbagai metode untuk mengelola keuangan.

### 2. `ManajemenKeuangan`

* Bertanggung jawab mengatur logika utama keuangan pengguna.
* Mengelola **saldo, pemasukan, dan pengeluaran**.
* Menggunakan objek dari kelas `NoteTransaksi` untuk mencatat data transaksi.

### 3. `NoteTransaksi`

* Menyimpan daftar pemasukan dan pengeluaran dalam bentuk `ArrayList<Double>`.
* Memiliki fungsi untuk menghitung total pemasukan, pengeluaran, dan menghapus data transaksi.

---

## 🔍 Contoh Output Program

```
✅ Pemasukan ditambahkan: Rp 500000.0
💸 Pengeluaran ditambahkan: Rp 200000.0 untuk Belanja kebutuhan
💸 Pengeluaran ditambahkan: Rp 150000.0 untuk Tagihan listrik

==== 📊 Laporan Keuangan ====
Nama Pengguna   : Mas Amba
Saldo Saat Ini  : Rp 400000.0
Total Pemasukan : Rp 500000.0
Total Pengeluaran: Rp 350000.0
Sisa Keuangan   : Rp 400000.0

=== 💼 Daftar Transaksi ===
Pemasukan  : [500000.0]
Pengeluaran: [200000.0, 150000.0]

🗑️ Semua data transaksi telah dihapus!
Saldo telah direset menjadi Rp 0.
```

---

## 👨‍💻 Cara Menjalankan Program

1. Simpan semua file berikut di folder yang sama:

   * `MainApp.java`
   * `ManajemenKeuangan.java`
   * `NoteTransaksi.java`
2. Pastikan sudah menginstall **Java JDK**.
3. Buka terminal atau command prompt, lalu arahkan ke folder proyek.
4. Jalankan perintah berikut:

   ```bash
   javac MainApp.java
   java MainApp
   ```

---

## 📖 Konsep Pemrograman yang Digunakan

* **Encapsulation:** Menggunakan `private` pada atribut dan `getter/setter` untuk akses data.
* **Composition:** Kelas `ManajemenKeuangan` memiliki objek dari `NoteTransaksi`.
* **Modular Programming:** Setiap kelas memiliki tanggung jawab yang spesifik.
* **Constants:** Menggunakan `BATAS_SALDO_RENDAH` sebagai batas minimal saldo.

---

## 📈 Pengembangan Selanjutnya

Beberapa fitur yang dapat ditambahkan di versi berikutnya:

* Menyimpan dan membaca transaksi ke file `.txt`.
* Menampilkan histori transaksi dengan tanggal dan waktu.
* Menambahkan sistem login pengguna.

---

## 👤 Pembuat

**Nama:** Sigit
**Versi:** 1.1
**Bahasa:** Java (JDK 17+)
**Lisensi:** Open Source
