public class DosenMain07 {
  public static void main(String[] args) {

    // Objek 1 (default)
    Dosen07 d1 = new Dosen07();
    d1.idDosen = "DS001";
    d1.nama = "Dr. Raven";
    d1.statusAktif = true;
    d1.tahunBergabung = 2015;
    d1.bidangKeahlian = "Pemrograman";

    d1.TampilInformasi();
    System.out.println("Masa Kerja: " + d1.hitungMasaKerja(2025) + " tahun");

    // Objek 2 (berparameter)
    Dosen07 d2 = new Dosen07(
        "DS002",
        "Dr. Tifany",
        true,
        2018,
        "Basis Data");

    d2.TampilInformasi();
    d2.SetStatusAktif(false);
    d2.UbahKeahlian("Artificial Intelligence");
    d2.TampilInformasi();
  }
}