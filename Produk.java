package projek2;

import java.util.ArrayList;
import java.util.Scanner;

// Abstract class Produk2
abstract class Produk {
    private String nama;
    private double harga;

    public Produk(String nama, double harga) {
        this.nama = nama;
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
}
