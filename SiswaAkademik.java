// Class untuk siswa di perguruan tinggi akademik
class SiswaAkademik extends Siswa {
    public SiswaAkademik(String nama, String perguruanTinggi, int score) {
        super(nama, perguruanTinggi, score);
    }

    public void lihatPengumuman(boolean diterima) {
        if (diterima) {
            System.out.println(getNama() + " diterima di " + getPerguruanTinggi());
        } else {
            System.out.println(getNama() + " tidak diterima di " + getPerguruanTinggi());
        }
    }
}