package Pertemuan13;
public class ArrayNama {
    public static void main(String[] args) {
        String[] nama = {"Andi", "Budi", "Citra", "Deni", "Eka"};
        System.out.println("=== DAFTAR NAMA ===");
        for(int index = 0; index < nama.length; index++){
            System.out.println((index + 1) + ". " + nama[index]);
        }
    }
}