package com.polban.jtk.JadwalAkademik;

public class Jadwal {
    private String hari;
    private MataKuliah mataKuliah;
    private String ruangan;

    public Jadwal(String hari, MataKuliah mataKuliah, String ruangan) {
        this.hari = hari;
        this.mataKuliah = mataKuliah;
        this.ruangan = ruangan;
    }

    public String getHari() {
        return hari;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public String getRuangan() {
        return ruangan;
    }

    public void tampilkanJadwal() {
        System.out.println("Hari: " + hari);
        System.out.println("Mata Kuliah: " + mataKuliah.getNamaMk());
        System.out.println("Dosen Pengampu: " + mataKuliah.getDosenPengampu().getNama() + " (" + mataKuliah.getDosenPengampu()+ ")");
        System.out.println("Ruangan: " + getRuangan());
        System.out.println();
    }
}


