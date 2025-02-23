/*
 * Construrctor dalam java merupakan methode spesial yang berfungsi
 * untuk menginisialisasi objek dari sebuah class yang dibuat
 */

// membuat public class Construct
public class Constuct {
    int x; // buat sebuah atribut kelas

    // buat sebuah class constructor dari public class (nama harus sama dengan
    // public class)
    public Constuct() {
        x = 5; // atur initial value dari atribut kelas x
    }

    public static void main(String[] args){
        Constuct myObj = new Constuct(); // Buat sebuah objek dari class Construct (Ingat Public harus memnggunakan objek untuk bisa dipanggi;)
        System.out.println(myObj.x);
    }
    // output 5
}
