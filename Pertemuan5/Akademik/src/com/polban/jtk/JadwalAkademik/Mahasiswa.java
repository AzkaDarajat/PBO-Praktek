package com.polban.jtk.JadwalAkademik;

public class Mahasiswa extends Person {
    private String nim;

    public Mahasiswa(String nama, String nim, String prodi) {
        super(nama, prodi);
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void tampilMhs() {
        System.out.println("\nNama Mahasiswa: " + getNama() + "\nNIM: " + getNim() + "\nProdi: " + getProdi());
    }
}


