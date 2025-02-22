/* Static vs Public
 * Static Method bisa diakses tanpa membuat Object class
 * Public Method harus diakses dengan membuat object class
 */

// Contoh demonstrasi Static dan public
public class Mtd {
    // Static Method
    static void myStaticmethod() {
        System.out.println("Bisa dipanggil tanpa membuat Object");
    }

    // Public method
    public void myPublicmethod() {
        System.out.println("Harus dipanggil menggunakan object");
    }
     
    //Main Method
    public static void main(String[] args) {
        myStaticmethod(); // memanggil static method
        //myPublicmethod(); ini akan error compile

        Mtd myObj = new Mtd(); // membuat object dari Mtd 
        myObj.myPublicmethod(); // panggil public methode di samping object
    }
}
