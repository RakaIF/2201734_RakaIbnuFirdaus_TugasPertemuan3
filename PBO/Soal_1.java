package PBO;
import java.util.Scanner;

public class Soal_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inputan pembilang
        System.out.print("Masukkan pembilang pertama: ");
        float pembilang1 = scanner.nextFloat();
        System.out.print("Masukkan pembilang kedua: ");
        float pembilang2 = scanner.nextFloat();
        System.out.print("Masukkan pembilang ketiga: ");
        float pembilang3 = scanner.nextFloat();

        // Inputan penyebut
        System.out.print("Masukkan penyebut pertama: ");
        float penyebut1 = scanner.nextFloat();
        System.out.print("Masukkan penyebut kedua: ");
        float penyebut2 = scanner.nextFloat();
        System.out.print("Masukkan penyebut ketiga: ");
        float penyebut3 = scanner.nextFloat();

        // Proses pecahan atau pembagian
        float hasilPembagian1 = pembilang1 / penyebut1;
        float hasilPembagian2 = pembilang2 / penyebut2;
        float hasilPembagian3 = pembilang3 / penyebut3;
        System.out.println("Hasil Pembagian 1: " + hasilPembagian1);
        System.out.println("Hasil Pembagian 2: " + hasilPembagian2);
        System.out.println("Hasil Pembagian 3: " + hasilPembagian3);

        // Proses dan hasil operasi
        float hasilPenjumlahan = hasilPembagian1 + hasilPembagian2 + hasilPembagian3;
        float hasilPengurangan = hasilPembagian1 - hasilPembagian2 - hasilPembagian3;
        float hasilPerkalian = hasilPembagian1 * hasilPembagian2 * hasilPembagian3;
        float hasilPembagianAkhir = hasilPembagian1 / hasilPembagian2 / hasilPembagian3;
        System.out.println("Hasil Penjumlahan: " + hasilPenjumlahan);
        System.out.println("Hasil Pengurangan: " + hasilPengurangan);
        System.out.println("Hasil Perkalian: " + hasilPerkalian);
        System.out.println("Hasil Pembagian Akhir: " + hasilPembagianAkhir);

        scanner.close();
    }
}
