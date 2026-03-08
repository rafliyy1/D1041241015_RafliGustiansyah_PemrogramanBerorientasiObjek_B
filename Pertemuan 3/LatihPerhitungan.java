public class LatihPerhitungan {
    public static void main(String[] args){
        int saldo = 1000000;
        System.out.println("=== Simulasi Transaksi Bank ===");
        System.out.println("Saldo Awal              : " + saldo);
        int setoran = 500000;
        System.out.println("Setoran                 : " + setoran);
        saldo = saldo + setoran;
        System.out.println("Saldo Setelah Setoran   : " + saldo);
        int penarikan = 250000;
        System.out.println("Penarikan               : " + penarikan);
        saldo = saldo - penarikan;
        System.out.println("Saldo Akhir             : " + saldo);
    }
}
// variabel saldo yang akan dihasilkan adalah variabel terbaru yang setelah diupdate sebelum di outputkan
// Sintaks nya pada materi ini kurang lebih seperti cpp