public class SkuterListrik extends Kendaraan implements IBergerak {
    private double dayaBaterai; 
    private double kecepatan;   

    public SkuterListrik(String merek, String model) {
        super(merek, model);
        this.kecepatan = 0;
    }

    public double getDayaBaterai() {
        return dayaBaterai;
    }

    public void setDayaBaterai(double dayaBaterai) {
        this.dayaBaterai = dayaBaterai;
    }

    @Override
    public double hitungPajak() {
        return 0;
    }

    @Override
    public String getTipeKendaraan() {
        return "Skuter Listrik";
    }

    @Override
    public boolean mulai() {
        System.out.println("Skuter mulai berjalan.");
        return true;
    }

    @Override
    public boolean berhenti() {
        System.out.println("Skuter berhenti.");
        kecepatan = 0;
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
}
