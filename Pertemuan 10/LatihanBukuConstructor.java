package Pertemuan10;

class Buku{
    String judul;
    String pengarang;
    int harga;
    //Constructor tanpa parameter
    public Buku(){
        judul = "Belum diisi";
        pengarang = "Belum diisi";
        harga = 0;
    }
    //Constructor dengan parameter
    public Buku(String judul, String pengarang, int harga){
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
    }
    //Method untuk menampilkan informasi buku
    public void tampilkanInfo(){
        System.out.println("Judul     : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Harga     : Rp " + harga);
    }
}
public class LatihanBukuConstructor {
    public static void main(String[] args) {
        Buku buku1 = new Buku();
        Buku buku2 = new Buku("Pemrograman Java", "Budi Raharjo", 125000);
        Buku buku3 = new Buku("Algoritma dan Struktur Data", "Rinaldi Munir", 150000);

        System.out.println("=== INFORMASI BUKU ===");
        buku1.tampilkanInfo();
        System.out.println("");
        System.out.println("=== INFORMASI BUKU ===");
        buku2.tampilkanInfo();
        System.out.println("");
        System.out.println("=== INFORMASI BUKU ===");
        buku3.tampilkanInfo();
    }
}