import java.util.Date;

public class Mobil extends Kendaraan implements IBergerak, IServiceable {
    private int jumlahPintu;
    private double kapasitasMesin;
    private int jumlahKursi;
    private String bahanBakar;
    private double kecepatan;
    private boolean kondisi;
    private Date waktuServis;

    public Mobil(String merek, String model) {
        super(merek, model);
        this.kondisi = true;
        this.kecepatan = 0;
        this.waktuServis = new Date(); // waktu default sekarang
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlah) {
        this.jumlahPintu = jumlah;
    }

    public double getKapasitasMesin() {
        return kapasitasMesin;
    }

    public void setKapasitasMesin(double kapasitas) {
        this.kapasitasMesin = kapasitas;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public void setJumlahKursi(int jumlah) {
        this.jumlahKursi = jumlah;
    }

    public String getBahanBakar() {
        return bahanBakar;
    }

    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    @Override
    public double hitungPajak() {
        return kapasitasMesin * 50000; 
    }

    @Override
    public String getTipeKendaraan() {
        return "Mobil";
    }

    @Override
    public boolean mulai() {
        System.out.println("Mobil mulai berjalan...");
        return true;
    }

    @Override
    public boolean berhenti() {
        System.out.println("Mobil berhenti.");
        this.kecepatan = 0;
        return true;
    }

    @Override
    public double getKecepatan() {
        return kecepatan;
    }

    @Override
    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    public boolean periksaKondisi() {
        return kondisi;
    }

    public void lakukanServis() {
        this.kondisi = true;
        this.waktuServis = new Date(); 
    }

    @Override
    public Date getWaktuServisBerikutnya() {
        long enamBulanMs = 1000L * 60 * 60 * 24 * 30 * 6;
        return new Date(waktuServis.getTime() + enamBulanMs);
    }

    @Override
    public double hitungBiayaServis() {
        return kapasitasMesin * 100000; 
    }
}
