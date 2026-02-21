public class MataKuliah07 {

  String kodeMK;
  String nama;
  int sks;
  int jumlahJam;

  // Konstruktor default
  public MataKuliah07() {
  }

  // Konstruktor berparameter
  public MataKuliah07(String kodeMK, String nama, int sks, int jumlahJam) {
    this.kodeMK = kodeMK;
    this.nama = nama;
    this.sks = sks;
    this.jumlahJam = jumlahJam;
  }

  void TampilInformasi() {
    System.out.println("Kode MK   : " + kodeMK);
    System.out.println("Nama MK   : " + nama);
    System.out.println("SKS       : " + sks);
    System.out.println("Jumlah Jam: " + jumlahJam);
    System.out.println("---------------------------");
  }

  void UbahSKS(int sksBaru) {
    sks = sksBaru;
    System.out.println("SKS berhasil diubah menjadi " + sksBaru);
  }

  void TambahJam(int jam) {
    jumlahJam += jam;
    System.out.println("Jumlah jam sekarang: " + jumlahJam);
  }

  void KurangiJam(int jam) {
    if (jumlahJam >= jam) {
      jumlahJam -= jam;
      System.out.println("Jumlah jam sekarang: " + jumlahJam);
    } else {
      System.out.println("Pengurangan tidak dapat dilakukan. Jam tidak mencukupi.");
    }
  }
}