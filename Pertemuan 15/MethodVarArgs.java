package Pertemuan15;

public class MethodVarArgs {
    static double hitungRataRata(int... nilai){
        if(nilai.length == 0){
            return 0;
        }
        int total = 0;
        for(int n : nilai){
            total += n;
        }
        return (double) total / nilai.length;
    }
    public static void main(String[] args) {
        double rata1 = hitungRataRata(70, 80, 90);
        double rata2 = hitungRataRata(75, 80, 85, 90, 100);

        System.out.println("Rata-rata (3 nilai): " + rata1);
        System.out.println("Rata-rata (5 nilai): " + rata2);
    }
}