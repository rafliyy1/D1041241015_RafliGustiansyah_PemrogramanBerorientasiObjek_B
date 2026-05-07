package Pertemuan10;

class Persegi{
    int sisi;
    int luas;
    int keliling;
    boolean isError = false;
    //Constructor
    public Persegi(int sisi){
        if(sisi <= 0){
            isError = true;
            this.sisi = 1;
        } else {
            this.sisi = sisi;
        }
        this.luas = this.sisi * this.sisi;
        this.keliling = 4 * this.sisi;
    }
    public void tampilkanHasil(){
        if(isError){
            System.out.println("ERROR: Sisi tidak boleh <= 0. Diset ke default (1).");
        }
        System.out.println("=== PERSEGI ===");
        System.out.println("Sisi    : " + sisi + " cm");
        System.out.println("Luas    : " + luas + " cm²");
        System.out.println("Keliling: " + keliling + " cm");
    }
}
public class LatihanPersegiConstructor {
    public static void main(String[] args) {
        Persegi persegi1 = new Persegi(5);
        Persegi persegi2 = new Persegi(-3);

        persegi1.tampilkanHasil();
        System.out.println("");
        persegi2.tampilkanHasil();
    }
}