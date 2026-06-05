package Pertemuan11;

class PersegiPanjang {
    int panjang;
    int lebar;
    int luas;
    int keliling;
    // constructor 1 persegi
    PersegiPanjang(int sisi) {
        this.panjang = sisi;
        this.lebar = sisi;
        this.luas = panjang * lebar;
        this.keliling = 2 * (panjang + lebar);
    }
    // constructor 2 Persegi Panjang
    PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.luas = panjang * lebar;
        this.keliling = 2 * (panjang + lebar);
    }
    void tampilkanInfo() {
        System.out.println("Panjang : " + panjang + " cm");
        System.out.println("Lebar   : " + lebar + " cm");
        System.out.println("Luas    : " + luas + " cm²");
        System.out.println("Keliling: " + keliling + " cm");
    }
}
public class LatihanPersegiOverloading {
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(5);
        PersegiPanjang persegiPanjang = new PersegiPanjang(8, 4);

        System.out.println("=== PERSEGI ===");
        persegi.tampilkanInfo();
        System.out.println();
        System.out.println("=== PERSEGI PANJANG ===");
        persegiPanjang.tampilkanInfo();
    }
}