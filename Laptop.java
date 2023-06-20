package projek2;

// Class Laptop yang merupakan turunan dari Produk
class Laptop extends Produk {
    public Laptop(String nama, double harga) {
        super(nama, harga);
    }

    // Implementasi method hitungTotalHarga dari abstract class Produk
    @Override
    public double hitungTotalHarga(int jumlah) {
        return getHarga() * jumlah;
    }
}
