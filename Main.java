import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Calon Mahasiswa: ");
        int jumlahSiswa = scanner.nextInt();
        System.out.println("-------------------------------");

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("1. Vokasi");
            System.out.println("2. Akademik");
            System.out.print("Pilih: ");
            int jenisPTN = scanner.nextInt();

            System.out.print("Masukkan Nama Siswa: ");
            String nama = scanner2.nextLine();
            System.out.print("Masukkan Perguruan Tinggi: ");
            String perguruanTinggi = scanner2.nextLine();
            System.out.print("Masukkan Jumlah Score: ");
            int score = scanner.nextInt();
            System.out.print("Masukkan Posisi Ranking: ");
            int ranking = scanner.nextInt();

            Pengumuman pengumuman = new Pengumuman();
            switch (jenisPTN) {
                case 1:
                    SiswaVokasi siswaVokasi = new SiswaVokasi(nama, perguruanTinggi, score);
                    UjianKomputer ujianKomputer = new UjianKomputer(siswaVokasi);
                    pengumuman.informasiDiterima(ujianKomputer, siswaVokasi, ranking);
                    break;
                case 2:
                    SiswaAkademik siswaAkademik = new SiswaAkademik(nama, perguruanTinggi, score);
                    UjianTulis ujianTulis = new UjianTulis(siswaAkademik);
                    pengumuman.informasiDiterima(ujianTulis, siswaAkademik, ranking);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
            System.out.println();
        }
    }
}