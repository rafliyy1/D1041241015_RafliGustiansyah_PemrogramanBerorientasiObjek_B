package Pertemuan11;

class Mobil {
    String merk;
    String warna;
    int tahun;

    // constructor 1 tanpa parameter
    Mobil() {
        this.merk = "Unknown";
        this.warna = "Unknown";
        this.tahun = 0;
    }
    // constructor 2 cuman merk
    Mobil(String merk) {
        this.merk = merk;
        this.warna = "Unknown";
        this.tahun = 0;
    }
    // constructor 3 semua atribut
    Mobil(String merk, String warna, int tahun) {
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
    }

    void tampilkanSpesifikasi() {
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk : " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun: " + tahun);
        System.out.println();
    }
}

public class LatihanMobilOverloading {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        Mobil mobil2 = new Mobil("Toyota");
        Mobil mobil3 = new Mobil("Honda Civic", "Merah", 2023);

        mobil1.tampilkanSpesifikasi();
        mobil2.tampilkanSpesifikasi();
        mobil3.tampilkanSpesifikasi();
    }
}