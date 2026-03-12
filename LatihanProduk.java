public class LatihanProduk {
    public static void main(String[] args) {
        String namaProduk = "Laptop ASUS" ;
        int hargaSatuan = 7000000;
        int jumlahStok = 15;
        boolean isActive = true;
        double pajak = 0.11;
        System.out.println("=== INFORMASI PRODUK ===");
        System.out.println("Nama Produk     : " + namaProduk);
        System.out.println("Harga Satuan    : " + hargaSatuan);
        System.out.println("Jumlah Stok     : " + jumlahStok);
        System.out.println("Status Tersedia : " + isActive);
        System.out.println("---");
        int totalNilaiStok = hargaSatuan * jumlahStok;
        System.out.println("Total Nilai Produk  : " + totalNilaiStok);
        double nilaiPajak = totalNilaiStok * pajak;
        System.out.println("Pajak (11%)         : " + (long) nilaiPajak);
    }
}
