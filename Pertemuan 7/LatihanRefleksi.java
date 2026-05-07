public class LatihanRefleksi {
    public static void main(String[] args) {

        int angka = 1;
        System.out.println("=== MENGGUNAKAN WHILE ===");
        while (angka <= 5) {
            System.out.print(angka + " ");
            angka++;
        }
        System.out.println();

        int angka2 = 1;
        System.out.println("=== MENGGUNAKAN DO-WHILE ===");
        do {
            System.out.print(angka2 + " ");
            angka2++;
        } while (angka2 <= 5);
        System.out.println();

        System.out.println("=== MENGGUNAKAN FOR ===");
        for (int angka3 = 1; angka3 <= 5; angka3++) {
            System.out.print(angka3 + " ");
        }
    }
}
//Yang paling mudah dipahami menurut saya adalah for loop karena sudah terbiasa menggunakan ini dan kondisi-kondisinya berada dalam 1 baris yang sama sehingga mudah dibaca