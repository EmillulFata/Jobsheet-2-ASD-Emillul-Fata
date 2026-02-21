public class Dosen07 {

  String idDosen;
  String nama;
  boolean statusAktif;
  int tahunBergabung;
  String bidangKeahlian;

  // Konstruktor default
  public Dosen07() {
  }

  // Konstruktor berparameter
  public Dosen07(String idDosen, String nama, boolean statusAktif,
      int tahunBergabung, String bidangKeahlian) {
    this.idDosen = idDosen;
    this.nama = nama;
    this.statusAktif = statusAktif;
    this.tahunBergabung = tahunBergabung;
    this.bidangKeahlian = bidangKeahlian;
  }

  void TampilInformasi() {
    System.out.println("ID Dosen        : " + idDosen);
    System.out.println("Nama            : " + nama);
    System.out.println("Status Aktif    : " + statusAktif);
    System.out.println("Tahun Bergabung : " + tahunBergabung);
    System.out.println("Bidang Keahlian : " + bidangKeahlian);
    System.out.println("---------------------------");
  }

  void SetStatusAktif(boolean status) {
    statusAktif = status;
    System.out.println("Status aktif diubah menjadi: " + status);
  }

  int hitungMasaKerja(int thnSkrg) {
    return thnSkrg - tahunBergabung;
  }

  void UbahKeahlian(String bidang) {
    bidangKeahlian = bidang;
    System.out.println("Bidang keahlian diubah menjadi: " + bidang);
  }
}