public class LatihDataMahasiswa {
    public static void main(String[] args){
        long NIM = 2301010001L ; // untuk tipe data longlong, pada akhir nilainya harus diberi huruf L, kalau tidak maka akan dianggap int
        String Nama = "Budi Santoso";
        char Kelas = 'A';
        boolean StatusAktif = true;
        double IPK = 3.75;
        int SKS = 72;
        System.out.println("=== DATA MAHASISWA ===");
        System.out.println("NIM         : " + NIM);
        System.out.println("Nama        : " + Nama);
        System.out.println("Kelas       : " + Kelas);
        System.out.println("StatusAktif : " + StatusAktif);
        System.out.println("IPK         : " + IPK);
        System.out.println("SKS         : " + SKS);
    }
}
