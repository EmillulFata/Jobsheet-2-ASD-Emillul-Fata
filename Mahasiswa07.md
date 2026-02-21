Soal
1.	Sebutkan dua karakteristik class atau object!
2.	Perhatikan class Mahasiswa pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class Mahasiswa? Sebutkan apa saja atributnya!
3.	Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!
4.	Perhatikan method updateIpk() yang terdapat di dalam class Mahasiswa. Modifikasi isi method tersebut sehingga IPK yang dimasukkan valid yaitu terlebih dahulu dilakukan pengecekan apakah IPK yang dimasukkan di dalam rentang 0.0 sampai dengan 4.0 (0.0 <= IPK <= 4.0). Jika IPK tidak pada rentang tersebut maka dikeluarkan pesan: "IPK tidak valid. Harus antara 0.0 dan 4.0".
5.	Jelaskan bagaimana cara kerja method nilaiKinerja() dalam mengevaluasi kinerja mahasiswa,  kriteria apa saja yang digunakan untuk menentukan nilai kinerja tersebut, dan apa yang dikembalikan (di-return-kan) oleh method nilaiKinerja() tersebut?
6.	Commit dan push kode program ke Github

Jawab
1. Dua karakteristik utama:
    Atribut 
     Data atau variabel yang dimiliki oleh suatu object.
     Contoh: nim, nama, kelas, ipk.
    Method 
     Fungsi atau aksi yang bisa dilakukan object.
      Contoh: tampilkanInformasi(), ubahKelas(), updateIpk().
2. Class Mahasiswa memiliki 4 atribut, yaitu:
    nim (String)
    nama (String)
    kelas (String)
    ipk (double)
3. Class Mahasiswa memiliki 4 method utama, yaitu:
    TampilkanInformasi()
    UbahKelas(String kelasBaru)
    UpdateIpk(double ipkBaru)
    NilaiKinerja(double ipk)
4. Modifikasi done
5. Method NilaiKinerja(double ipk) bekerja dengan cara:
    Menerima nilai IPK sebagai parameter.
    Mengecek IPK menggunakan percabangan if-else.
    Menentukan kategori kinerja berdasarkan rentang IPK.
    Mengembalikan (return) nilai berupa String.
   Method ini mengembalikan String berupa kategori kinerja mahasiswa.
    Contoh:
    Jika IPK = 3.7
    return "Sangat Baik"
6. commit done
