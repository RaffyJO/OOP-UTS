import java.util.Scanner;

// Class abstrak untuk siswa
abstract class Siswa {
    private String nama;
    private String perguruanTinggi;

    public Siswa(String nama, String perguruanTinggi) {
        this.nama = nama;
        this.perguruanTinggi = perguruanTinggi;
    }

    public String getNama() {
        return nama;
    }

    public String getPerguruanTinggi() {
        return perguruanTinggi;
    }

    public void lihatPengumuman(boolean diterima) {
        if (diterima) {
            System.out.println(nama + " diterima di " + perguruanTinggi);
        } else {
            System.out.println(nama + " tidak diterima di " + perguruanTinggi);
        }
    }
}

// Interface untuk ujian masuk
interface UjianMasuk {
    void lulus();
}

// Class untuk ujian komputer
class UjianKomputer implements UjianMasuk {
    private SiswaVokasi siswaVokasi;

    public UjianKomputer(SiswaVokasi siswaVokasi) {
        this.siswaVokasi = siswaVokasi;
    }

    @Override
    public void lulus() {
        System.out
                .println(siswaVokasi.getNama() + " telah lulus ujian komputer di " + siswaVokasi.getPerguruanTinggi());
    }
}

// Class untuk ujian tulis
class UjianTulis implements UjianMasuk {
    private SiswaAkademik siswaAkademik;

    public UjianTulis(SiswaAkademik siswaAkademik) {
        this.siswaAkademik = siswaAkademik;
    }

    @Override
    public void lulus() {
        System.out
                .println(siswaAkademik.getNama() + " telah lulus ujian tulis di " + siswaAkademik.getPerguruanTinggi());
    }
}

// Class untuk siswa di perguruan tinggi vokasi
class SiswaVokasi extends Siswa {
    public SiswaVokasi(String nama, String perguruanTinggi) {
        super(nama, perguruanTinggi);
    }
}

// Class untuk siswa di perguruan tinggi akademik
class SiswaAkademik extends Siswa {
    public SiswaAkademik(String nama, String perguruanTinggi) {
        super(nama, perguruanTinggi);
    }
}

// Class untuk pengumuman
class Pengumuman {
    public void informasiDiterima(UjianMasuk ujian, Siswa siswa, boolean diterima) {
        ujian.lulus();
        siswa.lihatPengumuman(diterima);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Calon Mahasiswa: ");
        int jumlahSiswa = scanner.nextInt();

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("1. Vokasi");
            System.out.println("2. Akademik");
            System.out.print("Pilih: ");
            int jenisPTN = scanner.nextInt();

            System.out.print("Masukkan Nama Siswa: ");
            String nama = scanner2.nextLine();
            System.out.print("Masukkan Perguruan Tinggi: ");
            String perguruanTinggi = scanner2.nextLine();

            Pengumuman pengumuman = new Pengumuman();
            switch (jenisPTN) {
                case 1:
                    SiswaVokasi siswaVokasi = new SiswaVokasi(nama, perguruanTinggi);
                    UjianKomputer ujianKomputer = new UjianKomputer(siswaVokasi);
                    pengumuman.informasiDiterima(ujianKomputer, siswaVokasi, true);
                    break;
                case 2:
                    SiswaAkademik siswaAkademik = new SiswaAkademik(nama, perguruanTinggi);
                    UjianTulis ujianTulis = new UjianTulis(siswaAkademik);
                    pengumuman.informasiDiterima(ujianTulis, siswaAkademik, false);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }
}
