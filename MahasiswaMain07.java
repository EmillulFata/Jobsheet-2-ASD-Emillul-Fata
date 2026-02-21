public class MahasiswaMain07 {
    public static void main(String[] args) {

        // Instansiasi menggunakan konstruktor default
        Mahasiswa07 mhs1 = new Mahasiswa07();
        mhs1.nim = "2541070601";
        mhs1.nama = "Emillul Fata";
        mhs1.kelas = "1F";
        mhs1.ipk = 3.5;

        mhs1.TampilkanInformasi();
        mhs1.UbahKelas("2F");
        mhs1.UpdateIpk(3.8);
        mhs1.TampilkanInformasi();

        // Instansiasi menggunakan konstruktor berparameter
        Mahasiswa07 mhs2 = new Mahasiswa07(
                "2341720002",
                "Rey Verstapen",
                "1D",
                3.6);

        mhs2.TampilkanInformasi();
    }
}