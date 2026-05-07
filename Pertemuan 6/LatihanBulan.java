public class LatihanBulan {
    public static void main(String[] args){
        int month = 13;
        String monthName;
        System.out.println("=== Konversi Bulan ===");
        System.out.println("Angka Bulan: " + month);
        switch (month) {
            case 1:
                monthName = "Nama Bulan: Januari";
                break;
            case 2:
                monthName = "Nama Bulan: Februari";
                break;
            case 3:
                monthName = "Nama Bulan: Maret";
                break;
            case 4:
                monthName = "Nama Bulan: April";
                break;
            case 5:
                monthName = "Nama Bulan: Mei";
                break;
            case 6:
                monthName = "Nama Bulan: Juni";
                break;
            case 7:
                monthName = "Nama Bulan: Juli";
                break;
            case 8:
                monthName = "Nama Bulan: Agustus";
                break;
            case 9:
                monthName = "Nama Bulan: September";
                break;
            case 10:
                monthName = "Nama Bulan: Oktober";
                break;
            case 11:
                monthName = "Nama Bulan: November";
                break;
            case 12:
                monthName = "Nama Bulan: Desember";
                break;
            default:
                monthName = "Angka bulan tidak valid (1-12)";
                break;
        }
        System.out.println(monthName);
    }
}
