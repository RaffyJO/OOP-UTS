// Class abstrak untuk siswa
abstract class Siswa {
    private String nama;
    private String perguruanTinggi;
    private int score;

    public Siswa(String nama, String perguruanTinggi, int score) {
        this.nama = nama;
        this.perguruanTinggi = perguruanTinggi;
        this.score = score;
    }

    public String getNama() {
        return nama;
    }

    public String getPerguruanTinggi() {
        return perguruanTinggi;
    }

    public int getScore() {
        return score;
    }

    public abstract void lihatPengumuman(boolean diterima);
}