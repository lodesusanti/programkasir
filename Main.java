package projek2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produk> keranjangBelanja = new ArrayList<>(); //class produk sebagai tipe data dan berisi nama arraylist yaitu keranjang belanja yang berguna untuk menyimpan produk yang akan di beli
       Scanner scanner = new Scanner(System.in); //Variabel "scanner" dideklarasikan sebagai objek dari kelas "Scanner" yang digunakan untuk membaca input dari pengguna.

        boolean beliLagi = true; 
        //Variabel "beliLagi" dideklarasikan sebagai variabel bertipe boolean yang akan digunakan untuk mengontrol apakah pengguna ingin membeli lagi atau tidak.


        while (beliLagi) { //program ini memiliki sebuah perulangan while yang digunakan untuk mengulang proses pembelian produk selama pengguna masih ingin membeli.
            try { //Terdapat blok try-catch yang digunakan untuk menangani InputMismatchException
                System.out.println("---------------------------------------------------");
                System.out.println("----------------Pilihan Produk ---------------------");
                System.out.println("---------------------------------------------------");
                System.out.println("1. Handphone");
                System.out.println("2. Laptop");
                System.out.println("3. Kartu Sim");
                System.out.println("-----------------------------------------------------");
                System.out.println("------------------- Selamat Berbelanja --------------");
                System.out.println("-----------------------------------------------------");
                System.out.print("Input pilihan : "); 
                int pilihan = scanner.nextInt(); // menggunakan Scanner, program dapat menerima input dari pengguna mengenai produk yang ingin ditambahkan ke keranjang belanja

                switch (pilihan) { //memilih menu
                    case 1:
                        System.out.println("-------------------------------");
                        System.out.println("--- Pilihan Merek Handphone ---");
                        System.out.println("-------------------------------");
                        System.out.println("1. Samsung");
                        System.out.println("2. Xiaomi");
                        System.out.println("3. Oppo");
                        System.out.println("4. Realme");
                        System.out.println("5. asus");
                        System.out.println("-------------------------------");
                        System.out.print("Pilihan Merek (Nomor) : ");
                        int merekHandphone = scanner.nextInt();

                        switch (merekHandphone) {
                            case 1:
                                Handphone samsungS9 = new Handphone("Samsung Galaxy S9+", 1000000);
                                keranjangBelanja.add(samsungS9);
                                break;
                            case 2:
                                Handphone xiaomiA04 = new Handphone("Xiaomi Redmi A04", 900000);
                                keranjangBelanja.add(xiaomiA04);
                                break;
                            case 3:
                                Handphone oppoA23 = new Handphone("Oppo A23", 800000);
                                keranjangBelanja.add(oppoA23);
                                break;
                            case 4:
                                Handphone realmeA73 = new Handphone("Realme A73", 500000);
                                keranjangBelanja.add(realmeA73);
                                break;
                            case 5:
                            Handphone asus = new Handphone();
                            keranjangBelanja.add(asus);
                            break;
                            default:
                                System.out.println("Pilihan merek handphone tidak valid.");
                                return;
                        }

                        break;
                    case 2:
                        System.out.println("--- Pilihan Merek Laptop ---");
                        System.out.println("-------------------------------");
                        System.out.println("1. Macbook");
                        System.out.println("2. Asus");
                        System.out.println("3. Huawei");
                        System.out.println("4. Notebook");
                        System.out.println("-------------------------------");
                        System.out.print("Pilihan Merek (Nomor) : ");
                        int merekLaptop = scanner.nextInt();

                        switch (merekLaptop) {
                            case 1:
                                Laptop macbookpro = new Laptop("Macbook pro 2019", 5000000);
                                keranjangBelanja.add(macbookpro);
                                break;
                            case 2:
                                Laptop asusvivobook = new Laptop("Asus vivobook 14x", 4000000);
                                keranjangBelanja.add(asusvivobook);
                                break;
                            case 3:
                                Laptop huaweimatebook = new Laptop("Huawei matebook D15", 3000000);
                                keranjangBelanja.add(huaweimatebook);
                                break;
                            case 4:
                                Laptop notebookhp = new Laptop("Notebook hp 14s", 2000000);
                                keranjangBelanja.add(notebookhp);
                                break;
                            default:
                                System.out.println("Pilihan merek laptop tidak valid.");
                                return;
                        }

                        break;
                    case 3:
                        System.out.println("--- Pilihan Merek KartuSim ---");
                        System.out.println("-------------------------------");
                        System.out.println("1. Axis");
                        System.out.println("2. Xl");
                        System.out.println("3. Indosat");
                        System.out.println("4. Smartfren");
                        System.out.println("-------------------------------");
                        System.out.print("Pilihan Merek (Nomor) : ");
                        int merekKartuSim = scanner.nextInt();

                        switch (merekKartuSim) {
                            case 1:
                                KartuSim axis = new KartuSim("Axis", 12000);
                                keranjangBelanja.add(axis);
                                break;
                            case 2:
                                KartuSim xl = new KartuSim("XL", 20000);
                                keranjangBelanja.add(xl);
                                break;
                            case 3:
                                KartuSim indosat = new KartuSim("Indosat", 30000);
                                keranjangBelanja.add(indosat);
                                break;
                            case 4:
                                KartuSim smartfren = new KartuSim("Smartfren", 40000);
                                keranjangBelanja.add(smartfren);
                                break;
                            default:
                                System.out.println("Pilihan merek kartu sim tidak valid.");
                                return;
                        }

                        break;
                    default:
                        System.out.println("Pilihan produk tidak valid.");
                        return;
                }

                
                System.out.print("Berapa Unit : ");
                int jumlahUnit = scanner.nextInt();

                if (jumlahUnit <= 0) { 
                    System.out.println("Jumlah unit tidak valid.");
                    return; //program yang digunakan untuk memvalidasi jumlah unit dalam suatu transaksi. 
                }
                double testTotal =0;
                for(int i=1;i<=keranjangBelanja.size();i++){
                    testTotal += keranjangBelanja.get(i-1).getHarga();
                    //rogram yang digunakan untuk menghitung total harga belanjaan dalam keranjang belanja. 
                    
                }
                
                System.out.println("Total Belanja :  Rp. " + testTotal);
                // program yang digunakan untuk mencetak total harga belanjaan ke layar.


                System.out.print("Apakah Akan Beli Lagi? [Y/T] ");
                String beliLagiInput = scanner.next();

                // Print Nota Pembelian
                System.out.println("\n===== NOTA PEMBELIAN =====");
                for (int i = 0; i < keranjangBelanja.size(); i++) {
                    Produk produk = keranjangBelanja.get(i);
                    System.out.println("Produk: " + produk.getNama() + ", Harga: Rp. " + produk.getHarga() +
                            ", Jumlah Unit: " + jumlahUnit + ", Total Harga: Rp. " + (produk.getHarga() * jumlahUnit));
                }
                System.out.println("==========================");


                if (beliLagiInput.equalsIgnoreCase("T")) { //equalsIgnoreCase, yang berarti tidak memperhatikan apakah input "T" atau "t", keduanya dianggap sama).
                    beliLagi = false; //program yang mengatur logika untuk memeriksa apakah pengguna ingin melanjutkan pembelian atau tidak
                }
            } catch (InputMismatchException e) { //Terdapat blok try-catch yang digunakan untuk menangani InputMismatchException
                System.out.println("Input yang dimasukkan tidak valid. Program berhenti.");
                break;
                //InputMismatchException adalah sebuah jenis pengecualian (exception) yang terjadi saat program mencoba membaca input dari pengguna, tetapi nilainya tidak sesuai dengan yang diharapkan.
            }
        }

        System.out.println("Terima kasih telah berbelanja!");
    }
}
