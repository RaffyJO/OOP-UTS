// Class untuk ujian komputer
class UjianKomputer implements UjianMasuk {
    private SiswaVokasi siswaVokasi;

    public UjianKomputer(SiswaVokasi siswaVokasi) {
        this.siswaVokasi = siswaVokasi;
    }

    @Override
    public void lulus() {
        if (siswaVokasi.getScore() > 80) {
            System.out.println(siswaVokasi.getNama() + " telah memenuhi passing grade ujian komputer di " + siswaVokasi.getPerguruanTinggi());
        } else {
            System.out.println(siswaVokasi.getNama() + " tidak memenuhi passing grade ujian komputer di " + siswaVokasi.getPerguruanTinggi());
        }
    }
}