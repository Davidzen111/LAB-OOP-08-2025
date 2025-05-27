public class Main {
    public static void main(String[] args) {
        
        Serangan seranganAir = new Serangan("Water Gun", 25);
        Pokemon squirtle = new Pokemon("Squirtle", 100, seranganAir);
        Pokemon pikacu= new Pokemon();

        pikacu.tampilkanStatus();
        squirtle.tampilkanStatus();


        pikacu.serang(squirtle);
        squirtle.serang(pikacu);  
    }
}   