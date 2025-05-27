public class Serangan {
    String nama;
    int kekuatan;

    public Serangan() {
        this.nama = "Tackle";
        this.kekuatan = 10;
    }

    public Serangan(String nama, int kekuatan) {
        this.nama = nama;
        this.kekuatan = kekuatan;
    }

    public void tampilkanSerangan() {
        System.out.println("Nama Serangan: " + nama);
        System.out.println("Kekuatan: " + kekuatan);
        
    }
}