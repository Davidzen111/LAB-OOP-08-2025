import java.util.Scanner;

class Hero {
    String name;
    int health;
    int attackPower;

    public Hero(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void attack() {
        System.out.println(name + " menyerang dengan kekuatan " + attackPower + "!");
    }
}

class Archer extends Hero {
    public Archer(String name) {
        super(name, 100, 15);   
    }

    @Override
    public void attack() {
        System.out.println("Pemanah menyerang dengan kekuatan 15!");
    }
}

class Wizard extends Hero {
    public Wizard(String name) {
        super(name, 100, 20);
    }

    @Override
    public void attack() {
        System.out.println("Penyihir menyerang dengan kekuatan 20!");
    }
}

class Fighter extends Hero {
    public Fighter(String name) {
        this(name, 100, 18);
    }

    public Fighter(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void attack() {
        System.out.println("Fighter menyerang dengan kekuatan 25!");
    }
}

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hero hero = null;

        System.out.println("Pilih Karakter:");
        System.out.println("1. Archer");
        System.out.println("2. Wizard");
        System.out.println("3. Fighter");
        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        switch (pilihan) {
            case 1:
                hero = new Archer("Pemanah");
                break;
            case 2:
                hero = new Wizard("Penyihir");
                break;
            case 3:
                hero = new Fighter("Petarung");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }

        int menu;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Serang");
            System.out.println("2. Keluar");
            System.out.print("Pilih aksi: ");
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    hero.attack();
                    break;
                case 2:
                    System.out.println("Game selesai!");
                    break;
                default:
                    System.out.println("Aksi tidak valid.");
            }
        } while (menu != 2);

        scanner.close();
    }
}