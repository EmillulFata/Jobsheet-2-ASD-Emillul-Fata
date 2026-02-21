Soal
1.	Pada class MahasiswaMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi! Apa nama object yang dihasilkan?
2.	Bagaimana cara mengakses atribut dan method dari suatu objek?
3.	Mengapa hasil output pemanggilan method tampilkanInformasi() pertama dan kedua berbeda?

Jawab
1. Mahasiswa07 mhs1 = new Mahasiswa07();
   Baris tersebut adalah proses instansiasi (pembuatan object).
   Jika menggunakan konstruktor berparameter, Nama object yang dihasilkan adalah: mhs1 dan  mhs2
2. Menggunakan operator titik (.).
    Contoh:
    mhs1.nama = "Emillul";
    mhs1.TampilkanInformasi();
3. Karena sebelum pemanggilan kedua, nilai atribut object sudah diubah.
    Penjelasan:
    Pemanggilan pertama menampilkan data awal.
    Setelah method UbahKelas() dan UpdateIpk() dijalankan, nilai atribut berubah.
    Maka saat dipanggil lagi, hasilnya berbeda karena data sudah diperbarui.
    Jadi perbedaannya terjadi karena state (nilai atribut) object telah berubah.