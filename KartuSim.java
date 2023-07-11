package projek2;

// Class KartuSim yang merupakan turunan dari Produk
class KartuSim extends Produk {
    public KartuSim(String nama, double harga) {
        super(nama, harga);
    }

    // Implementasi method hitungTotalHarga dari abstract class Produk
    @Override
    public double hitungTotalHarga(int jumlah) {
        return getHarga() * jumlah;
        //Dalam metode ini, total harga kartu SIM dihitung dengan mengalikan harga 
        //kartu SIM (diperoleh melalui metode getHarga()) dengan jumlah yang diberikan sebagai parameter.
    }
}
