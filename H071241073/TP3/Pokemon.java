public class Pokemon {
    String nama;
    int hp;
    Serangan serangan; 

    public Pokemon() {
        this.nama = "Pikacu";
        this.hp = 100;
        this.serangan = new Serangan();
    }

    public Pokemon(String nama, int hp, Serangan serangan) {
        this.nama = nama;
        this.hp = hp;
        this.serangan = serangan;
    }

    public void serang(Pokemon lawan) {
        if (this.hp == 0) {
            System.out.println(this.nama + " mati!! tidak bisa menyerang lagi");
            return;
        }
        if (lawan.hp == 0) {
            System.out.println(lawan.nama + " mati!! tidak bisa diserang.");
            return;
        }
        System.out.println(this.nama + " menyerang " + lawan.nama + " dengan " + serangan.nama);
        lawan.hp -= serangan.kekuatan;
        if (lawan.hp < 0) {
            lawan.hp = 0;
        }
        System.out.println("HP " + lawan.nama + " sekarang: " + lawan.hp);
        if (lawan.hp == 0) {
            System.out.println(lawan.nama + " telah mati!!");
        }
        System.out.println();
        
    }

    public void tampilkanStatus() {
        System.out.println("Nama: " + nama);
        System.out.println("HP: " + hp);
        serangan.tampilkanSerangan(); 
        System.out.println();
    }
}