package com.bilgeadam.basicconseps.metroexample;

import java.util.Scanner;

public class Metro {

    static Scanner scanner = new Scanner(System.in);
    static double bakiye = 0.0;

    public static void main(String[] args) {

        int secim = 0;

        do {
            System.out.println("1- kart bakiyesini göster");
            System.out.println("2- Karta para yükle");
            System.out.println("3- Metroya bin");
            System.out.println("4- Sistemden çıkış");

            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    bakiyeGoster();
                    break;
                case 2:
                    kartaBakiyeYukle();
                    break;
                case 3:
                    metroyaBin();
                    break;
                default:
                    break;
            }

        } while (secim != 4);
    }

    private static void metroyaBin() {

        System.out.println("Abone durumuzunu seçiniz: \t\n1- İndirimli Bilet \t\n2- Tam Bilet");
        scanner aboneSecim = scanner.nextInt();

        if (aboneSecim == 1) {
            System.out.println("İndirimli Bilet! Metroya Hoşgeldiniz!");
            bakiye -= 3.5;
            System.out.println("Kalan: " + bakiyeGoster(););
        } else if (aboneSecim == 2) {
        } else {
            System.out.println("Hatalı seçim. Tekrar deneyiniz!");
            metroyaBin();
        }
    }

    private static void kartaBakiyeYukle() {

        System.out.println("Yüklemek istediğiniz miktarı giriniz: ");

        bakiye += scanner.nextDouble();

        bakiyeGoster();

    }

    private static void bakiyeGoster() {

        System.out.println("Bakiyeniz: " + bakiye + " TL");
    }
}
