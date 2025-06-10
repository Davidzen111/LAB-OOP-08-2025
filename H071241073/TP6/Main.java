import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Mobil mobil = new Mobil("Toyota", "Avanza");
        mobil.setKapasitasMesin(1.5);
        mobil.setJumlahKursi(7);
        mobil.setJumlahPintu(4);
        mobil.setBahanBakar("Bensin");
        mobil.setKecepatan(60);
        mobil.setTahunProduksi(2020);
        mobil.setWarna("Hitam");

        Motor motor = new Motor("Yamaha", "NMAX");
        motor.setKapasitasTangki(6.0);
        motor.setJenisMotor("Skuter");
        motor.setTipeSuspensi("Belakang Mono");
        motor.setKecepatan(80);
        motor.setTahunProduksi(2021);
        motor.setWarna("Merah");

        Sepeda sepeda = new Sepeda("Polygon", "Xtrada");
        sepeda.setJumlahGear(21);
        sepeda.setUkuranRoda(27);
        sepeda.setJenisSepeda("Gunung");
        sepeda.setKecepatan(25);
        sepeda.setTahunProduksi(2022);
        sepeda.setWarna("Biru");

        SkuterListrik skuter = new SkuterListrik("Xiaomi", "M365");
        skuter.setDayaBaterai(7.8);
        skuter.setKecepatan(30);
        skuter.setTahunProduksi(2023);
        skuter.setWarna("Abu-abu");

        int pilihan;
        do {
            System.out.println("\n===== MENU KENDARAAN =====");
            System.out.println("1. Info Mobil");
            System.out.println("2. Info Motor");
            System.out.println("3. Info Sepeda");
            System.out.println("4. Info Skuter Listrik");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    tampilkanInfoMobil(mobil);
                    break;
                case 2:
                    tampilkanInfoMotor(motor);
                    break;
                case 3:
                    tampilkanInfoSepeda(sepeda);
                    break;
                case 4:
                    tampilkanInfoSkuter(skuter);
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        scanner.close();
    }

    public static void tampilkanInfoMobil(Mobil mobil) {
        System.out.println("\n--- Info Mobil ---");
        mobil.mulai();
        System.out.println("Merek: " + mobil.getMerek());
        System.out.println("Model: " + mobil.getModel());
        System.out.println("Kecepatan: " + mobil.getKecepatan());
        System.out.println("Pajak: Rp" + mobil.hitungPajak());
        System.out.println("Biaya Servis: Rp" + mobil.hitungBiayaServis());
        System.out.println("Waktu Servis Berikutnya: " + mobil.getWaktuServisBerikutnya());
        mobil.lakukanServis();
        mobil.berhenti();
    }

    public static void tampilkanInfoMotor(Motor motor) {
        System.out.println("\n--- Info Motor ---");
        motor.mulai();
        System.out.println("Merek: " + motor.getMerek());
        System.out.println("Model: " + motor.getModel());
        System.out.println("Kecepatan: " + motor.getKecepatan());
        System.out.println("Pajak: Rp" + motor.hitungPajak());
        System.out.println("Biaya Servis: Rp" + motor.hitungBiayaServis());
        System.out.println("Waktu Servis Berikutnya: " + motor.getWaktuServisBerikutnya());
        motor.lakukanServis();
        motor.berhenti();
    }

    public static void tampilkanInfoSepeda(Sepeda sepeda) {
        System.out.println("\n--- Info Sepeda ---");
        sepeda.mulai();
        System.out.println("Merek: " + sepeda.getMerek());
        System.out.println("Model: " + sepeda.getModel());
        System.out.println("Kecepatan: " + sepeda.getKecepatan());
        System.out.println("Pajak: Rp" + sepeda.hitungPajak());
        System.out.println("Biaya Servis: Rp" + sepeda.hitungBiayaServis());
        System.out.println("Waktu Servis Berikutnya: " + sepeda.getWaktuServisBerikutnya());
        sepeda.lakukanServis();
        sepeda.berhenti();
    }

    public static void tampilkanInfoSkuter(SkuterListrik skuter) {
        System.out.println("\n--- Info Skuter Listrik ---");
        skuter.mulai();
        System.out.println("Merek: " + skuter.getMerek());
        System.out.println("Model: " + skuter.getModel());
        System.out.println("Kecepatan: " + skuter.getKecepatan());
        System.out.println("Pajak: Rp" + skuter.hitungPajak());
        skuter.berhenti();
    }
}
