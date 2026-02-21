public class MataKuliahMain07 {
  public static void main(String[] args) {

    // Objek 1 (default constructor)
    MataKuliah07 mk1 = new MataKuliah07();
    mk1.kodeMK = "MK001";
    mk1.nama = "Algoritma dan Struktur Data";
    mk1.sks = 3;
    mk1.jumlahJam = 6;

    mk1.TampilInformasi();
    mk1.TambahJam(2);
    mk1.KurangiJam(3);
    mk1.UbahSKS(4);
    mk1.TampilInformasi();

    // Objek 2 (konstruktor berparameter)
    MataKuliah07 mk2 = new MataKuliah07(
        "MK002",
        "Basis Data",
        3,
        4);

    mk2.TampilInformasi();
    mk2.TambahJam(1);
    mk2.KurangiJam(2);
    mk2.UbahSKS(2);
    mk2.TampilInformasi();
  }
}