import com.polban.jtk.JadwalAkademik.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] hariList = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        Dosen[] dosens;
        Mahasiswa[] mahasiswa;

        // Untuk mengatur dosen mana yang mengajar di matakuliah mana dan juga di jadwal apa
        Jadwal[] jadwals = new Jadwal[5];
        Dosen dosen1 = new Dosen("Yudhi Widhiyasana, Santi Sundari, Trisna Gelar A" ,"KO0013N, KO009N, KO0018N");
        Dosen dosen2 = new Dosen("Ade Hodijah, Muhammad Rizqi S", "KO060N, KO074N");
        Dosen dosen3 = new Dosen("Bambang Wisnuadhi, Wendi Wirasta, Didik Suwito Pribadi", "KO003N; KO079N; KO005N");
        Dosen dosen4 = new Dosen("Ade Chandra Nugraha, Zulkifli Arsyad, Zulkifli Arsyad, Siti Dwi Setiarini", "KO001N, KO061N, KO075N");
        Dosen dosen5 = new Dosen("Yadhi Aditya P", "K0O52N");

        jadwals[0] = new Jadwal(hariList[0], new MataKuliah("21IF2015, 21IF2013, 21IF2015", "Komputer Grafik teori, PRPL TE, Komputer Grafik Praktek", dosen1), "D105, D105, LAB MT");
        jadwals[1] = new Jadwal(hariList[1], new MataKuliah("21IF2012, 21IF2014", "Basis Data Praktek, Aljabar Linear", dosen2), "D106-Lab. SDB, D101-Kelas");
        jadwals[2] = new Jadwal(hariList[2], new MataKuliah("21IF2016", "Proyek 3 Pengembangan Perangkat Lunak Berbasis Web", dosen3), "D116-Lab. PjBL-2");
        jadwals[3] = new Jadwal(hariList[3], new MataKuliah("21IF2012, 21IF2011, 21IF2010", "Basis Data Teori, PBO PR, PBO TE, Matematika Diskrit", dosen4), "D105-Kelas, D105-Kelas, D116-Lab. PjBL-2, D108-Kelas");
        jadwals[4] = new Jadwal(hariList[4], new MataKuliah("21IF2013", "PRPL PR", dosen5), "D116-Lab. PjBL-2");

        dosens = new Dosen[10];
        dosens[0] = new Dosen("Yudhi Widhiyasana",  "KO013N");
        dosens[1] = new Dosen("Santi Sundari",  "KO018N");
        dosens[2] = new Dosen("Yadhi Aditya P", "KO018N");
        dosens[3] = new Dosen("Trisna Gelar A",  "KO018N");
        dosens[4] = new Dosen("Ade Hodijah", "KO018N");
        dosens[5] = new Dosen("Muhammad Rizqi S", "KO018N");
        dosens[6] = new Dosen("Bambang Wisnuadhi, Wendi Wirasta, Didik Suwito Pribadi", "KO018N");
        dosens[7] = new Dosen("Ade Chandra Nugraha", "KO018N");
        dosens[8] = new Dosen("Zulkifli Arsyad", "KO018N");
        dosens[9] = new Dosen("Siti Dwi Setiarini", "KO018N");

        mahasiswa = new Mahasiswa[11];
        mahasiswa[0] =  new Mahasiswa("AHMAD FAUZAN NAJI", "231511033", "D3 Teknik Informatika");
        mahasiswa[1] =  new Mahasiswa("ALANNA TANISYA ANWAR", "231511034", "D3 Teknik Informatika");
        mahasiswa[2] =  new Mahasiswa("ALYA GUSTIANI NUR 'AFIFAH", "231511035", "D3 Teknik Informatika");
        mahasiswa[3] =  new Mahasiswa("AZKA DARAJAT", "231511036", "D3 Teknik Informatika");
        mahasiswa[4] =  new Mahasiswa("BANDYAGA ADIANSYAH SUGANDI", "231511037", "D3 Teknik Informatika");
        mahasiswa[5] =  new Mahasiswa("DAFFA AL GHIFARI", "231511038", "D3 Teknik Informatika");
        mahasiswa[6] =  new Mahasiswa("DAIVA RADITYA PRADIPA", "231511039", "D3 Teknik Informatika");
        mahasiswa[7] =  new Mahasiswa("DHEA DRIA SPRALIA", "231511040", "D3 Teknik Informatika");
        mahasiswa[8] =  new Mahasiswa("DHIRA RAMADINI", "231511041", "D3 Teknik Informatika");
        mahasiswa[9] =  new Mahasiswa("DWIKA ALI RAMDHAN IBRAHIM", "231511042", "D3 Teknik Informatika");
        mahasiswa[10] = new Mahasiswa("ERINA DWI YANTI", "23151143", "D3 Teknik Informatika");

        while (true) {
            System.out.println();
            System.out.println("-- Menu Jadwal Akademik --");
            System.out.println("1. Lihat Jadwal");
            System.out.println("2. Lihat Data Dosen");
            System.out.println("3. Lihat Data Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Opsi: ");
            int opsi = scanner.nextInt();

            switch (opsi) {
                case 1:
                    System.out.println("Jadwal Akademik JTK Polban:");
                    for (Jadwal jadwal : jadwals) {
                        jadwal.tampilkanJadwal();
                    }
                    break;
                case 2:
                    System.out.println("Data Dosen di JTK:");
                    for (Dosen dosen : dosens) {
                        dosen.tampilDosen();
                    }
                    break;
                case 3:
                    System.out.println("Data Mahasiswa:");
                    for (Mahasiswa mhs : mahasiswa) {
                        mhs.tampilMhs();
                    }
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan Aplikasi kami.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
