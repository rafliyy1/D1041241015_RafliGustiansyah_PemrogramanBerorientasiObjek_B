package Pertemuan12;

class Mahasiswa {

    static int jumlahMahasiswa = 0;
    String nama;

    // constructor
    public Mahasiswa(String nama) {
        this.nama = nama;
        jumlahMahasiswa++;
        System.out.println("Mahasiswa dibuat: " + nama);
    }
    public static int getJumlah() {
        return jumlahMahasiswa;
    }
}
public class StaticCounter {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("Andi");
        Mahasiswa m2 = new Mahasiswa("Budi");
        Mahasiswa m3 = new Mahasiswa("Citra");
        System.out.println("");
        System.out.println("Total Mahasiswa: " + Mahasiswa.getJumlah());
    }
}