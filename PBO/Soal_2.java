package PBO;

import java.util.Scanner;

public class Soal_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Total jumlah tabungan Anda: ");
        float tabungan = scanner.nextFloat();
        System.out.println("Apakah sudah ada calon pasangan? (1 untuk ya, 0 untuk tidak)");
        int calonPasangan = scanner.nextInt();

        if (tabungan > 100000000 && calonPasangan == 1) {
            System.out.println("Selamat menjadi pengantin baru!");
        } else {
            System.out.println("Tetap semangat dan jangan menyerah.");
        }
        scanner.close();
    }
}