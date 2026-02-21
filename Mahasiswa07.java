public class Mahasiswa07 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    // Konstruktor default
    public Mahasiswa07() {
    }

    // Konstruktor berparameter
    public Mahasiswa07(String nim, String nm, String kls, double ipk) {
        this.nim = nim;
        nama = nm;
        kelas = kls;
        this.ipk = ipk;
    }

    void TampilkanInformasi() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK   : " + ipk);
        System.out.println("Nilai Kinerja : " + NilaiKinerja(ipk));
        System.out.println("---------------------------");
    }

    void UbahKelas(String kelasBaru) {
        kelas = kelasBaru;
        System.out.println("Kelas berhasil diubah menjadi " + kelasBaru);
    }

    void UpdateIpk(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
            System.out.println("IPK berhasil diupdate.");
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }

    String NilaiKinerja(double ipk) {
        if (ipk >= 3.5) {
            return "Sangat Baik";
        } else if (ipk >= 3.0) {
            return "Baik";
        } else if (ipk >= 2.5) {
            return "Cukup";
        } else {
            return "Kurang";
        }
    }
}