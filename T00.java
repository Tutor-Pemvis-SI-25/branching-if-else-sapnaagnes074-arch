//12S25003_Afrian Josse Siadari
//12S25004_Sapna Agnes Napitupulu
//12S25042_Dewi Natasya Sitorus

import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int bil1, bil2, perkalian, penjumlahan;

        bil1 = Integer.parseInt(input.nextLine());
        bil2 = Integer.parseInt(input.nextLine());
        if (bil1 % 2 == 0) {
            System.out.println("Bilangan pertama: Genap");
        } else {
            System.out.println("Bilangan pertama: Ganjil");
        }
        if (bil2 % 2 == 0) {
            System.out.println("Bilangan kedua: Genap");
        } else {
            System.out.println("Bilangan kedua: Ganjil");
        }
        if (bil1 > bil2) {
            System.out.println("Bilangan pertama lebih besar");
        } else {
            if (bil1 < bil2) {
                System.out.println("Bilangan kedua lebih besar");
            } else {
                System.out.println("Kedua bilangan sama besar");
            }
        }
        if (bil1 % 2 == 0 && bil2 % 2 == 0) {
            penjumlahan = bil1 + bil2;
            System.out.println("Hasil penjumlahan: " + penjumlahan);
        } else {
            if (bil1 % 2 != 0 && bil2 % 2 != 0) {
                perkalian = bil1 * bil2;
                System.out.println("Hasil perkalian: " + perkalian);
            }
        }
        if (bil1 % 2 != 0 && bil2 % 2 == 0) {
            System.out.println("Berbeda jenis");
        } else {
            if (bil2 % 2 != 0 && bil1 % 2 == 0) {
                System.out.println("Berbeda jenis");
            }
        }
    }
}
