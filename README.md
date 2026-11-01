# p03 

# Output Tema Terang
<img width="1920" height="1080" alt="outputTemaTerang" src="https://github.com/user-attachments/assets/937ccb50-380d-4b18-bae2-333138268dea" />

# Output Tema Gelap
<img width="1920" height="1080" alt="outputTemaGelap" src="https://github.com/user-attachments/assets/92171855-9117-4fdd-b175-11927b182c27" />

# Navigator
<img width="1920" height="1080" alt="navigator" src="https://github.com/user-attachments/assets/4469e55f-9149-478a-aa90-e15e1f56bf19" />

# p04

# Output Ukuran yang diperlebar
<img width="1920" height="1080" alt="Screenshot (208)" src="https://github.com/user-attachments/assets/5ebf4624-e0be-440e-8cff-44ce56ce8386" />

# Output Ukuran awal
<img width="1920" height="1080" alt="Screenshot (207)" src="https://github.com/user-attachments/assets/da5a79b3-33c4-4dc7-9f18-bbb9448dad2b" />

# Panel dan Navigator
<img width="1920" height="1080" alt="Screenshot (206)" src="https://github.com/user-attachments/assets/64026775-8d2d-4754-8631-54e34932551c" />
<img width="1920" height="1080" alt="Screenshot (205)" src="https://github.com/user-attachments/assets/eecc0b98-c914-4ed8-8c4f-ee461a6a557f" />

# Dinilai oleh Muhammad Ajidannor Rahman
<img width="488" height="295" alt="Cuplikan layar 2026-10-17 224352" src="https://github.com/user-attachments/assets/bf00e3d6-5a70-4f5a-abd2-9ae15d2920dc" />

# Jawaban untuk Refleksi
[jawaban refleksi.txt](https://github.com/user-attachments/files/33599033/jawaban.refleksi.txt)

1. Null Layout dan Absolute Layout sebaiknya dihindari karena posisi dan ukuran komponen ditentukan secara manual. Akibatnya, tampilan bisa berantakan ketika ukuran jendela berubah atau program dijalankan pada layar dengan resolusi berbeda.
2. FlowLayout menyusun komponen secara berurutan dari kiri ke kanan dan akan memindahkan komponen ke baris berikutnya jika ruang tidak cukup. GridLayout menyusun komponen dalam baris dan kolom dengan ukuran yang sama, sehingga ketika jendela dilebarkan, komponen ikut melebar secara merata.
3. Weight X berfungsi menentukan seberapa besar bagian ruang horizontal tambahan yang diberikan kepada komponen. Fill berfungsi mengatur apakah komponen akan memenuhi ruang yang tersedia pada sel GridBagLayout, baik secara horizontal, vertikal, maupun keduanya.
4. formPanel dibungkus dengan isiPanel agar susunan form lebih mudah diatur dan dipisahkan dari bagian lain. Form diletakkan di bagian North agar posisinya berada di atas area isiPanel, sehingga tampilannya lebih teratur dan ruang kosong di bagian bawah dapat tetap tersedia.
5. Dua prinsip desain yang diterapkan pada Form Anggota Perpustakaan adalah pengelompokan komponen dan konsistensi tata letak. Pengelompokan terlihat dari adanya bagian Data Anggota dan Kontak yang memisahkan informasi sesuai fungsinya. Konsistensi tata letak terlihat dari label dan kolom input yang disusun dalam dua kolom menggunakan GridBagLayout, sehingga form lebih mudah dibaca dan digunakan.

# Deklarasi Ai
Praktikum 1: Saya lancar dalam mengerjakan praktikum 1 dan sangat bisa memahami materi yang ada di modul, sehingga tidak terlalu membutuhkan bantuan AI.

Praktikum 2: Saya agak kesulitan dalam memahami beberapa bagian materi dan menerapkan kode program. Saya menggunakan bantuan AI untuk menjelaskan langkah-langkah pengerjaan dan membantu mengatasi kesalahan yang muncul.

Praktikum 3: Saya mengalami sedikit kesulitan dalam memahami komponen GUI di Java Swing, terutama dalam mengatur komponen pada form menggunakan NetBeans. Saya menggunakan bantuan AI untuk memahami fungsi komponen dan cara mengaturnya.

Praktikum 4: Saya mengalami kesulitan dalam mengatur layout dan posisi komponen pada form, khususnya saat menggunakan GridBagLayout dan mengatur constraint seperti Grid X, Grid Y, Weight X, dan Fill. Saya juga membutuhkan bantuan AI untuk mengatur form agar terlihat rapi serta membantu proses commit dan push proyek menggunakan Git.

Secara keseluruhan, AI membantu saya memahami materi yang belum saya kuasai, menyelesaikan kendala selama praktikum, dan meningkatkan pemahaman saya dalam menggunakan Java, NetBeans, serta Git.

# Sketsa
<img width="720" height="1280" alt="WhatsApp Image 2026-10-18 at 23 11 44" src="https://github.com/user-attachments/assets/c2e1b4b3-9711-415c-b2d7-21a210cdcf19" />

# p05

# Praktikum 2: Mengamati Event
<img width="479" height="295" alt="Cuplikan layar 2026-10-25 190156" src="https://github.com/user-attachments/assets/d607b47c-582f-4f7c-b18d-5bb003753044" />

# Jawaban eksperimen Praktikum 3 dan Praktikum 4
[## Praktikum 3 Konversi Suhu.txt](https://github.com/user-attachments/files/33924080/Praktikum.3.Konversi.Suhu.txt)
## Praktikum 3: Konversi Suhu

**Eksperimen 1:** Pesan `"item berubah"` tercetak dua kali setiap pilihan diganti, karena event `itemStateChanged` dipanggil untuk pilihan lama yang dilepas dan pilihan baru yang dipilih.

**Eksperimen 2:** Hasil konversi terlambat satu karakter karena `keyPressed` berjalan sebelum karakter dimasukkan ke dalam text field. Jadi, program masih membaca teks sebelumnya.

**Eksperimen 3:** Jika blok `try` dan `catch` dihapus, lalu saya mengetik huruf pada isian suhu, program dapat menampilkan error `NumberFormatException` di jendela Output karena teks tersebut tidak bisa diubah menjadi angka.

## Praktikum 4: Kalkulator Sederhana

**Eksperimen 1:** Pesan `"kali"` tercetak dua kali ketika tombol kali diklik, karena tombol tersebut memiliki dua event, yaitu `actionPerformed` dan lambda. Sebaiknya satu tombol menggunakan satu cara saja agar aksi tidak dijalankan dua kali.

**Eksperimen 2:** Untuk menambahkan tombol modulus (%), saya perlu menambahkan tombol `%` di tab Design, membuat event untuk tombol tersebut, lalu menambahkan logika operator `%` pada method `hitung()` di tab Source. Operator modulus digunakan untuk mencari sisa hasil pembagian.

**Eksperimen 3:** Saat tombol Hapus ditekan, kursor kembali ke isian angka pertama karena method `hapus()` menjalankan `angka1Field.requestFocusInWindow()`. Dengan begitu, pengguna bisa langsung memasukkan angka baru.

# Peta Event pada FormAnggotaPerpustakaan
<img width="480" height="334" alt="image" src="https://github.com/user-attachments/assets/f373711b-4847-4e29-af54-4e3dea6224f1" />

# Tangkapan layar jendela Properties bagian Events untuk tombol Daftar
<img width="1920" height="1080" alt="Screenshot (219)" src="https://github.com/user-attachments/assets/32aa7c32-a487-49dc-8272-4ee3c714f79f" />

# Tangkapan layar dialog ringkasan
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/7fa2d6e9-9d16-41d4-8b40-b593c730aae2" />

# Tangkapan layar dialog konfirmasi keluar
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/75c136be-54c0-4127-8ddd-5436091929c8" />

# Deklarasi penggunaan AI: alat yang dipakai dan untuk keperluan apa, atau pernyataan tidak memakai AI
Saya menggunakan ChatGPT sebagai alat bantu dalam mengerjakan praktikum P05 Event Handling. AI digunakan untuk membantu memahami konsep event pada Java Swing, memberikan arahan dalam pembuatan kode event, serta membantu menyusun peta event dan jawaban pertanyaan praktikum. Seluruh kode tetap saya pelajari, jalankan, dan uji kembali di NetBeans agar sesuai dengan hasil praktikum.

# p06

# Peer Review
<img width="411" height="326" alt="Cuplikan layar 2026-11-01 235406" src="https://github.com/user-attachments/assets/4ace6d51-9b22-43be-82b2-79c15d957403" />
Dinilai oleh : Akbar Ramadhan

# Tabel singkat berisi temuan dari teman, perbaikan yang Anda lakukan, dan commit
<img width="482" height="162" alt="Cuplikan layar 2026-11-02 001357" src="https://github.com/user-attachments/assets/e3d437a1-0588-4a2f-8f02-8abe5d51c040" />
dinilai oleh : Akbar Ramadhan

# pesan kesalahan
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/f2cbd2b4-8a89-4c4b-8e30-81f8db7cfa83" />

# Navigator
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/e550f557-eba6-4103-938a-1b0779de63bc" />
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/23349ed2-900d-49fe-a766-28b1e82de266" />

# Jawaban eksperimen
1. Ketik huruf pada isian NPM. Apa yang terjadi dan baris mana di npmFieldKeyTyped yang menyebabkannya?

Ketika saya mengetik huruf pada kolom NPM, huruf tersebut tidak dapat dimasukkan karena kolom NPM hanya menerima karakter angka. Hal ini disebabkan oleh kondisi !Character.isDigit(evt.getKeyChar()) yang memeriksa karakter yang diketik. Jika karakter bukan angka, perintah evt.consume() akan membatalkan input tersebut. Pembatasan ini berjalan dengan baik saat eksperimen dilakukan.

2. Isi email dengan siti@, lalu tekan Tab. Kapan pesan kesalahan muncul?

Pesan kesalahan muncul ketika saya menekan tombol Tab dan fokus berpindah dari kolom Email ke komponen berikutnya. Hal ini terjadi karena event focusLost menjalankan validasi email ketika kolom tidak kosong. Karena format email siti@ belum lengkap dan tidak valid, program menampilkan pesan kesalahan pada kolom Email.

3. Klik isian Nama tanpa mengetik, lalu tekan Tab. Mengapa tidak ada pesan kesalahan?

Tidak muncul pesan kesalahan karena program hanya menjalankan validasi ketika kolom Nama sudah berisi teks. Hal ini diatur melalui kondisi !namaField.getText().isBlank(). Jika kolom masih kosong, pemeriksaan akan dilewati. Kolom kosong nantinya akan diperiksa ketika tombol Daftar ditekan.

4. Centang persetujuan, lalu klik Daftar dengan form kosong. Isian mana yang mendapat fokus?

Ketika saya mencentang persetujuan lalu menekan tombol Daftar dalam keadaan form kosong, fokus diarahkan ke kolom NPM sebagai isian pertama yang tidak valid. Program juga menampilkan informasi mengenai jumlah isian yang perlu diperbaiki. Dengan demikian, pengguna dapat mengetahui bagian yang harus dilengkapi terlebih dahulu.

5. Tekan tombol Alt bersama huruf N. Isian mana yang mendapat fokus, dan properti apa yang mengaturnya?

Ketika saya menekan kombinasi tombol Alt + N, fokus berpindah ke kolom NPM. Hal ini karena huruf N telah ditetapkan sebagai mnemonic pada label NPM. Pengaturannya menggunakan properti displayedMnemonic untuk menentukan tombol pintasan dan labelFor untuk menghubungkan label dengan kolom NPM.

6. Isi beberapa isian, lalu klik Batal dan pilih No. Apakah data tetap ada?

Ya, data yang sudah saya masukkan tetap ada ketika memilih No pada dialog konfirmasi pembatalan. Hal ini karena pilihan No membatalkan proses pengosongan form sehingga method kosongkan() tidak dijalankan. Dengan demikian, pengguna dapat melanjutkan pengisian tanpa kehilangan data sebelumnya.

# Deklarasi Ai
saya menggunakan ChatGPT (OpenAI) sebagai alat bantu untuk:
1. Membantu memahami materi validasi input dan kegunaan pada aplikasi Java.
2. Membantu menyusun jawaban Eksperimen Praktikum 4 berdasarkan modul praktikum.
3. Membantu merapikan penulisan dokumentasi dan README.md.
Seluruh proses pengerjaan, implementasi program, serta pengujian aplikasi dilakukan dan diperiksa kembali secara mandiri. Penggunaan AI hanya sebagai alat bantu pembelajaran dan penyusunan dokumentasi

# p07

# Tabel dan Menu
Jawaban Eksperimen Praktikum 5

1. Apa yang terjadi jika fireTableRowsInserted(baris, baris) dijadikan komentar lalu kontak baru ditambahkan?

Data kontak tetap masuk ke dalam daftar pada KontakTableModel, tetapi tampilan JTable tidak langsung diperbarui. Hal ini karena fireTableRowsInserted() berfungsi memberi tahu JTable bahwa terdapat baris data baru yang ditambahkan.

2. Setelah mencari kata "ah", memilih Ahmad Fauzi, lalu klik Hapus dan pilih No, nama siapa yang muncul pada dialog konfirmasi jika barisTerpilih() hanya mengembalikan getSelectedRow()?

Nama yang muncul adalah Budi Santoso. Hal ini terjadi karena indeks baris pada tampilan tabel berbeda dengan indeks pada model setelah dilakukan pencarian. Untuk mengatasinya, indeks tampilan harus dikonversi menggunakan convertRowIndexToModel().

3. Apa yang terjadi jika dialog diubah menjadi tidak modal (super(pemilik, judul, false))?

Jendela utama masih bisa digunakan ketika dialog terbuka. Selain itu, program tidak menunggu dialog ditutup untuk melanjutkan proses. Akibatnya, nilai hasil dialog bisa masih null ketika proses berikutnya dijalankan.

4. Mengapa Ctrl+E dan Ctrl+D tidak bekerja saat tidak ada baris yang dipilih?

Karena tombol dan menu Ubah serta Hapus dinonaktifkan ketika tidak ada baris yang dipilih. Sedangkan Ctrl+N tetap bisa digunakan karena fitur Tambah tidak membutuhkan pilihan baris.

5. Baris apa yang berubah di initComponents() ketika accelerator hapus diubah menjadi tombol Delete tanpa Ctrl?

Bagian pengaturan accelerator pada hapusItem berubah. Tombol yang digunakan menjadi VK_DELETE dan modifier Ctrl dihilangkan.

Contoh kode:

hapusItem.setAccelerator(
    javax.swing.KeyStroke.getKeyStroke(
        java.awt.event.KeyEvent.VK_DELETE, 0
    )
);

6. Pesan error apa yang muncul jika model baru dibuat setelah initComponents(), dan mengapa?

Program dapat mengalami NullPointerException karena model masih bernilai null ketika digunakan oleh komponen JTable. Oleh karena itu, objek model harus dibuat sebelum initComponents() dijalankan.

# Mini Proyek Katalog Buku Perpustakaan
Deskripsi Aplikasi

Aplikasi Katalog Buku Perpustakaan merupakan aplikasi berbasis Java Swing yang digunakan untuk mengelola dan menampilkan data buku. Aplikasi ini menyediakan beberapa fitur untuk memudahkan pengguna dalam mencari, menambahkan, mengubah, dan menghapus data buku.

Fitur Aplikasi

Menampilkan daftar buku dalam bentuk tabel.

Menyediakan beberapa data buku contoh.

Menambahkan data buku baru.

Mengubah data buku yang sudah tersedia.

Menghapus data buku dengan konfirmasi.

Melakukan pencarian buku berdasarkan informasi buku.

Menggunakan menu dan shortcut keyboard.

Menampilkan informasi jumlah buku pada aplikasi.

Video Demo Mini Proyek

Link video demo: (https://drive.google.com/file/d/1IkxNjKtKH9II05hUEk4bfZxplRJQjOeJ/view?usp=sharing)

Video demo dibuat dengan durasi maksimal 3 menit. Video memperlihatkan fitur-fitur aplikasi sesuai tabel bagian D pada modul Praktikum P07.

Video juga memperlihatkan sekilas tab Design dan jendela Navigator pada Apache NetBeans.

Deklarasi Penggunaan AI

Dalam pengerjaan Praktikum P07 ini, saya menggunakan ChatGPT sebagai alat bantu untuk memahami materi praktikum, mencari penjelasan ketika mengalami kesulitan, membantu memperbaiki kesalahan kode program, memberikan contoh data buku, serta membantu menyusun dokumentasi README.

Kode program tetap saya jalankan dan periksa kembali menggunakan Apache NetBeans agar sesuai dengan kebutuhan mini proyek.

Teknologi yang Digunakan

Java

Java Swing

Apache NetBeans

Maven

FlatLaf

