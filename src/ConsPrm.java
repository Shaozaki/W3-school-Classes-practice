/* sebuah constructor juga bisa memiliki parameter
 * yang digunakan untuk menginisialisasi atribut
 *
 */

public class ConsPrm {

    int modelSeries;
    String modelName;

    public ConsPrm(int gen, String name) {
        modelSeries = gen;
        modelName = name;
    }

    public static void main(String[] args) {
        ConsPrm Hp = new ConsPrm(23, "Samsung S");
        System.out.println(Hp.modelName + Hp.modelSeries);
    }
}
