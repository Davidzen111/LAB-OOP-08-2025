import java.util.Date;

public class Sepeda extends Kendaraan implements IBergerak, IServiceable {
    private String jenisSepeda;
    private int jumlahGear;
    private int ukuranRoda;
    private double kecepatan;

    public Sepeda(String merek, String model) {
        super(merek, model);
    }

    public String getJenisSepeda() {
        return jenisSepeda;
    }

    public void setJenisSepeda(String jenisSepeda) {
        this.jenisSepeda = jenisSepeda;
    }

    public int getJumlahGear() {
        return jumlahGear;
    }

    public void setJumlahGear(int jumlahGear) {
        this.jumlahGear = jumlahGear;
    }

    public int getUkuranRoda() {
        return ukuranRoda;
    }

    public void setUkuranRoda(int ukuranRoda) {
        this.ukuranRoda = ukuranRoda;
    }

    @Override
    public double hitungPajak() {
        return 0.0;
    }

    @Override
    public String getTipeKendaraan() {
        return "Sepeda";
    }

    @Override
    public boolean mulai() {
        System.out.println("Sepeda mulai dikayuh...");
        return true;
    }

    @Override
    public boolean berhenti() {
        System.out.println("Sepeda berhenti.");
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

    @Override
    public boolean periksaKondisi() {
        return jumlahGear > 0 && ukuranRoda > 0;
    }

    @Override
    public void lakukanServis() {
        System.out.println("Sepeda sedang diservis...");
    }

    @Override
    public Date getWaktuServisBerikutnya() {
        long MILLIS_IN_DAY = 24 * 60 * 60 * 1000L;
        return new Date(System.currentTimeMillis() + 30 * MILLIS_IN_DAY);
    }

    @Override
    public double hitungBiayaServis() {
        return (ukuranRoda * 1000) + (jumlahGear * 500);
    }
}
