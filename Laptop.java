package projek2;

// Class Laptop yang merupakan turunan dari Produk
class Laptop extends Produk { //Kelas "Laptop" merupakan turunan dari kelas "Produk" menggunakan kata kunci "extends
    public Laptop(String nama, double harga) {
        super(nama, harga);
    }
    //konstruktor dengan parameter yang sama seperti konstruktor dalam kelas "Produk".Konstruktor 
    //ini digunakan untuk menginisialisasi atribut "nama" dan "harga" dari kelas "Produk" menggunakan kata kunci "super".
    //Dengan menggunakan "super(nama, harga)", konstruktor kelas "Laptop" akan memanggil konstruktor 
   //kelas "Produk" untuk menginisialisasi atribut yang relevan.
    // Implementasi method hitungTotalHarga dari abstract class Produk
    @Override
    public double hitungTotalHarga(int jumlah) {
        return getHarga() * jumlah;
        //Kelas "Laptop" mengimplementasikan metode "hitungTotalHarga" yang diwarisi dari kelas "Produk".
        //Implementasi metode ini dilakukan dengan menggunakan anotasi @Override untuk menandakan bahwa metode
        // ini adalah implementasi ulang dari metode abstrak dalam kelas "Produk".
    }
}
