public class LatihanHariBulan {

    public static void main(String[] args) {

        int month = 4;

        String namaBulan;
        int jumlahHari;

        System.out.println("=== JUMLAH HARI DALAM BULAN ===");

        switch (month) {

            // 31 hari
            case 1:
                namaBulan = "Januari";
                jumlahHari = 31;
                break;

            case 3:
                namaBulan = "Maret";
                jumlahHari = 31;
                break;

            case 5:
                namaBulan = "Mei";
                jumlahHari = 31;
                break;

            case 7:
                namaBulan = "Juli";
                jumlahHari = 31;
                break;

            case 8:
                namaBulan = "Agustus";
                jumlahHari = 31;
                break;

            case 10:
                namaBulan = "Oktober";
                jumlahHari = 31;
                break;

            case 12:
                namaBulan = "Desember";
                jumlahHari = 31;
                break;

            // 30 hari
            case 4:
                namaBulan = "April";
                jumlahHari = 30;
                break;

            case 6:
                namaBulan = "Juni";
                jumlahHari = 30;
                break;

            case 9:
                namaBulan = "September";
                jumlahHari = 30;
                break;

            case 11:
                namaBulan = "November";
                jumlahHari = 30;
                break;

            // Februari
            case 2:
                namaBulan = "Februari";
                jumlahHari = 28;
                break;

            default:
                namaBulan = "Bulan tidak valid";
                jumlahHari = 0;
        }

        if (jumlahHari != 0) {
            System.out.println("Bulan: " + namaBulan + " (bulan ke-" + month + ")");
            System.out.println("Jumlah hari: " + jumlahHari + " hari");
        } else {
            System.out.println(namaBulan);
        }
    }
}