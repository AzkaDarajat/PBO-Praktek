package com.polban.jtk.JadwalAkademik;

public class Dosen extends Person {
    private String kode_dosen;

    public Dosen(String nama, String kode_dosen) {
        super(nama, kode_dosen);
        this.kode_dosen = kode_dosen;
    }

    public String getKode_dosen() {
        return kode_dosen;
    }

    public void tampilDosen() {
        System.out.println("Nama: " + getNama());
        System.out.println("Kode Dosen: " + getKode_dosen());
        System.out.println();
    }
}


