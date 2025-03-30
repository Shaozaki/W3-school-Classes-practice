# Encapsulation 
arti dari eckapsulasi adalah untuk mencegah data sensitive terlihat oleh pengguna, untuk melakukan hal ini hal yang perlu dilakukan adalah :
1. Mendeklarasikan variabel / atribut sebagai private; 
2. Menyediakan Public methods get dan set untuk mengakses private variable ;

Encapsuation (pembungkusan) merupakan fundamental oop dari bahasa java untuk membuat data tidak diakses secara langsung dar luar class dalam hal ini dibutuhkan method `get()` dan `set()` unutuk mengakses data private tersebut;

Tujuan untuk melakukan encapsulation (pembungkusan):
1. Untuk meningkatkan keamanan data ;
2. Lebih mudah dalam mengatur atribut dan methods;
3. Class bisa kita buat menjadi read-only dan write-only;
4. Fleksibel: programmer dapat mengganti sebagian dari kode tanpa harus takut berdampak pada kode lainnya ;

## Pmbuatan methods get and set 
 Method `get` dan `set` harus dideklarasikan di dalam public method seperti pada file [Person.java](https://github.com/Shaozaki/W3-school-Classes-practice/blob/095e922cb97f3c843a42cb5c6890586b8f3ea19c/src/Encapsulation/Person.java), dalam penulisan methods `get` harus melakukan pengembalian(return) ke variabel `name` dan untuk penulisan methods `set` harus mengambil parameter `newName` dan menugaskannya ke variable `name`. `this` keyword digunakan untuk mereferensikan objek yang digunakan sekarang;
<br>Namun, jika name dideklarasikan sebagai `private` maka kita tidak bisa mengaksesnya dari luar kelas ini;<br/>
