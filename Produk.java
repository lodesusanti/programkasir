package projek2;

import java.util.ArrayList;
import java.util.Scanner;

// Abstract class Produk2
abstract class Produk {
    private String nama; //konstraktor nama dan harga  digunakan untuk menginisialisasi nilai (aksesmodifier)
    private double harga; //encapsulation 

    public Produk(String nama, double harga) { //Konstruktor ini menerima dua parameter, yaitu "nama" (bertipe String) dan "harga" (bertipe double).
        this.nama = nama; //
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Abstract method untuk menghitung total harga
    public abstract double hitungTotalHarga(int jumlah);
    //metode abstrak bernama "hitungTotalHarga()" yang menerima satu parameter "jumlah" (bertipe int) dan mengembalikan nilai bertipe double.
}
