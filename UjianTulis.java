// Class untuk ujian tulis
class UjianTulis implements UjianMasuk {
    private SiswaAkademik siswaAkademik;

    public UjianTulis(SiswaAkademik siswaAkademik) {
        this.siswaAkademik = siswaAkademik;
    }

    @Override
    public void lulus() {
        if (siswaAkademik.getScore() > 80) {
            System.out.println(siswaAkademik.getNama() + " telah memenuhi passing grade ujian tulis di " + siswaAkademik.getPerguruanTinggi());   
        } else {
            System.out.println(siswaAkademik.getNama() + " tidak memenuhi passing grade ujian tulis di " + siswaAkademik.getPerguruanTinggi());
        }
    }
}