// Class untuk pengumuman
class Pengumuman {
    public void informasiDiterima(UjianMasuk ujian, Siswa siswa, int ranking) {
        ujian.lulus();
        boolean diterima;
        if (ranking < 100) {
            diterima = true;
        } else {
            diterima = false;
        }
        siswa.lihatPengumuman(diterima);
    }
}