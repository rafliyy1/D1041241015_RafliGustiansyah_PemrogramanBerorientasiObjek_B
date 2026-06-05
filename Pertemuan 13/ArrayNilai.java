package Pertemuan13;
public class ArrayNilai {
    public static void main(String[] args) {
        int[] nilai = {85, 90, 78, 92, 88};
        System.out.println("=== DAFTAR NILAI ===");
        for(int index = 0; index < nilai.length; index++){
            System.out.println("Nilai " + (index + 1) + ": " + nilai[index]);
        }
        System.out.println("");
        System.out.println("Total Nilai: " + nilai.length);
    }
}