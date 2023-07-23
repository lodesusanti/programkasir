package projek2;

// Class Handphone yang merupakan turunan dari Produk
class Handphone extends Produk {
    public Handphone(String nama, double harga) {
        super(nama, harga);
    }

     public Handphone() {
            super( "asus", 2000000);
        }
   
    // Implementasi method hitungTotalHarga dari abstract class Produk
    @Override
    public double hitungTotalHarga(int jumlah) {
        return getHarga() * jumlah;
    }
}
