/* JAVA CLASSES/OBJECT
 * Java merupakan bahasa pemrograman yang berorientasi objek
 * Apapun yang berada didalam java selalu berkaitan dengan Class dan Object, beserta atribut dan methodnya.
 * Contoh : Mobil merupakan sebuah Objek, Mobil memiliki atibut(Attributes) seperti warna, berat, dan methods, seperti kemudi dan rem.
 * Sebuah class merupakan constructor, atau sebuah cetak biru untuk membuat suatu objek.
 */
public class Main {
    int x = 5;
}

class Second {
    public static void main(String[] args) {
        Main myMain1 = new Main();
        Main myMain2 = new Main();

        System.out.println(myMain1.x);
        System.out.println(myMain2.x);
    }
}