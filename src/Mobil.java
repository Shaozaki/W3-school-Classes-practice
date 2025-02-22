public class Mobil {
    public void Gasspoll() {
        System.out.println("Mobil Ngegass Full Speed");
    }

    public void speed(int maxSpeed) {
        System.out.println("Full Speednya sampai: " + maxSpeed);
    }

}

class Secondh {
    public static void main(String[] args) {
        Mobil myMobil = new Mobil();
        myMobil.Gasspoll();
        myMobil.speed(300);
    }
}