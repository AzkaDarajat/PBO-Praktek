package com.polban.jtk.JadwalAkademik;

public class MataKuliah {
    private String kodeMK;
    private String namaMk;
    private Dosen dosenPengampu;

    public MataKuliah(String kodeMK, String namaMk, Dosen dosenPengampu) {
        this.kodeMK = kodeMK;
        this.namaMk = namaMk;
        this.dosenPengampu = dosenPengampu;
    }

    public String getKodeMK() {
        return kodeMK;
    }

    public String getNamaMk() {
        return namaMk;
    }

    public Dosen getDosenPengampu() {
        return dosenPengampu;
    }
}
