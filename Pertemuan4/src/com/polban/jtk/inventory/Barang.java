package com.polban.jtk.inventory;

public class Barang {
    private String kode_barang;
    private String nama_barang;
    private int stok;

    public Barang(String kode, String nama, int stk) {
        this.kode_barang = kode;
        this.nama_barang = nama;
        this.stok = stk;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setStok(int jumlah) {
        if (jumlah > 0) {
            this.stok += jumlah;
        } else {
            System.out.println("Stok " + nama_barang + " saat ini: " + stok + ". Jumlah stok baru harus lebih daro 0!");
        }
    }

    public String getKode_barang() {
        return kode_barang;
    }

    public int getStok() {
        return stok;
    }
}
