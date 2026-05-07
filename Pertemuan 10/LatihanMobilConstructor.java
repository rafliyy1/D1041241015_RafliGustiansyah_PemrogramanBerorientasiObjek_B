package Pertemuan10;

class Mobil {
    String merk;
    String warna;
    int tahun;
    //Constructor tanpa parameter
    public Mobil (){
        merk = "Belum diisi";
        warna = "Belum diisi";
        tahun = 0;
    }
    //Constructor yang cuman memiliki parameter merk
    public Mobil(String merk){
        this.merk = merk;
        warna = "Belum diisi";
        tahun = 0;
    }
    //Constructor untuk semua atribut memiliki parameter
    public Mobil(String merk, String warna, int tahun){
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
    }
    //Method yang menampilkan spesifikasi mobil
    public void tampilkanSpesifikasi(){
        System.out.println("Merk : " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun: " + tahun);
    }
}

public class LatihanMobilConstructor {
    public static void main(String[] args){
        Mobil mobil1 = new Mobil();
        Mobil mobil2 = new Mobil("Toyota");
        Mobil mobil3 = new Mobil("Honda Civic", "Merah", 2023);

        System.out.println("=== SPESIFIKASI MOBIL ===");
        mobil1.tampilkanSpesifikasi();
        System.out.println("");
        System.out.println("=== SPESIFIKASI MOBIL ===");
        mobil2.tampilkanSpesifikasi();
        System.out.println("");
        System.out.println("=== SPESIFIKASI MOBIL ===");
        mobil3.tampilkanSpesifikasi();
    }
}