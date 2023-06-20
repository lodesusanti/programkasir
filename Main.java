package projek2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produk> keranjangBelanja = new ArrayList<>();
        // Laptop test = new Laptop(null, 0);
       Scanner scanner = new Scanner(System.in);

        boolean beliLagi = true;

        while (beliLagi) {
            try {
                System.out.println("--- Pilihan Produk ---");
                System.out.println("----------------------");
                System.out.println("1. Handphone");
                System.out.println("2. Laptop");
                System.out.println("3. Kartu Sim");
                System.out.println("--------------------------- Selamat Berbelanja ------");
                System.out.print("Input pilihan : ");
                int pilihan = scanner.nextInt();

                switch (pilihan) {
                    case 1:
                        System.out.println("--- Pilihan Merek Handphone ---");
                        System.out.println("-------------------------------");
                        System.out.println("1. Samsung");
                        System.out.println("2. Xiaomi");
                        System.out.println("3. Oppo");
                        System.out.println("4. Realme");
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

                // System.out.print("Pilih Produk : ");
                // int pilihanProduk = scanner.nextInt();

                // if (pilihanProduk < 1 || pilihanProduk > keranjangBelanja.size()) {
                //     System.out.println("Pilihan produk tidak valid.");
                //     return;
                // }

                System.out.print("Berapa Unit : ");
                int jumlahUnit = scanner.nextInt();

                if (jumlahUnit <= 0) {
                    System.out.println("Jumlah unit tidak valid.");
                    return;
                }
                double testTotal =0;
                for(int i=1;i<=keranjangBelanja.size();i++){
                    testTotal += keranjangBelanja.get(i-1).getHarga();
                    // System.out.println(keranjangBelanja.get(i-1).getHarga());
                    // System.out.println(testTotal);
                }
                // double totalBelanja = keranjangBelanja.get(pilihanProduk - 1).hitungTotalHarga(jumlahUnit);
                // System.out.println("Total Belanja : 1 Rp. " + totalBelanja);
                System.out.println("Total Belanja : 2 Rp. " + testTotal);



                System.out.print("Apakah Akan Beli Lagi? [Y/T] ");
                String beliLagiInput = scanner.next();

                if (beliLagiInput.equalsIgnoreCase("T")) {
                    beliLagi = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Input yang dimasukkan tidak valid. Program berhenti.");
                break;
            }
        }

        System.out.println("Terima kasih telah berbelanja!");
    }
}
